package com.jnit.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Class.forName
//Connection object from driver
//create statement and pass the query
//execute the statment
//get resultset and then iterate and look athe results
//Pstmt vs stmt
//pre compiled statement(statment get compiled only once and the execution plan is retained)
//sql injection is not possible with ur prepared statement
//we can parameterize the inputs to ur sql

//result set types - Forward, Insensitive, sensitive(sensitive to changes in the database)
//concurrency types - ReadOnly, Updatable
//exception handling and resource leaks
//transaction - a commit or a rollback
//conn.setAutoCommit()
public class ConnectionMain {
	//executeQuery -> resultset
	//executeUpate -> int -> insert,update, delete operations
	//execute -> boolean(true -resultset, false-int) -> both executequery and executeupdate both can be performed
	public static void test(String courseName){
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseappdb", "root", "root");
			Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			boolean bool = statement.execute("select * from course where title ='" +courseName+"'");
			//ResultSet rset1 = statement.executeQuery("select * from course");
			if(bool){
				ResultSet rset = statement.getResultSet();
				List<Course>courses = new ArrayList<>();
				if(rset.next()){
					Course course = new Course(rset.getInt("courseId"),rset.getString("title"),rset.getString("author"));
					courses.add(course);
	//				int count = rset.getInt(1);
	//				System.out.println(count);
//					System.out.print(rset.getInt("courseId"));
//					System.out.print(rset.getString("title"));
//					System.out.print(rset.getString("author"));
					System.out.println();
				}
			}else{
				int count = statement.getUpdateCount();
			}
			//statement.close();
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}

	}
	//heapsize = 1 gb(Xms, Xmx), permgenspace ->stringpool
	public static void testtrywithResources(String courseName){
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseappdb", "root", "root");
				Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);) {
			boolean bool = statement.execute("select * from course where title ='" +courseName+"'");
			//ResultSet rset1 = statement.executeQuery("select * from course");
			if(bool){
				ResultSet rset = statement.getResultSet();
				List<Course>courses = new ArrayList<>();
				if(rset.next()){
					Course course = new Course(rset.getInt("courseId"),rset.getString("title"),rset.getString("author"));
					courses.add(course);
	//				int count = rset.getInt(1);
	//				System.out.println(count);
//					System.out.print(rset.getInt("courseId"));
//					System.out.print(rset.getString("title"));
//					System.out.print(rset.getString("author"));
					System.out.println();
				}
			}else{
				int count = statement.getUpdateCount();
			}
			//statement.close();
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}

	}
	
	public static void testPstmt(String courseName){
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseappdb", "root", "root");
			PreparedStatement statement = connection.prepareStatement("select * from course where title = ? and author=?");
			statement.setString(1, courseName);
			statement.setString(2, "Mike");
			//statement.executeUpdate();
			ResultSet rset = statement.executeQuery();

			if(rset.next()){
//				int count = rset.getInt(1);
//				System.out.println(count);
				System.out.print(rset.getInt("courseId"));
				System.out.print(rset.getString("title"));
				System.out.print(rset.getString("author"));
				System.out.println();
			}
			connection.close();
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		test("Java Programming - I");
//		try {
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseappdb", "root", "root");
//			Statement statement = connection.createStatement();
//			ResultSet rset = statement.executeQuery("select * from course");
//			while(rset.next()){
//				//System.out.println(rset.getInt(1));
//				//System.out.println(rset.getString(2));
//				//System.out.println(rset.getString(3));
//				System.out.print(rset.getInt("courseId"));
//				System.out.print(rset.getString("title"));
//				System.out.print(rset.getString("author"));
//				System.out.println();
//			}
//			connection.close();
//		} catch (SQLException e) {
//			//e.printStackTrace();
//			System.out.println(e.getSQLState());
//			System.out.println(e.getErrorCode());
//			System.out.println(e.getMessage());
//		}
		

	}

}
