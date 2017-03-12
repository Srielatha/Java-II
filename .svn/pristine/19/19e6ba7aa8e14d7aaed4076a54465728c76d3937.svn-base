package com.jnit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//rset.absolute(+ve - forward, negative- backward), rset.relative(+x number if rows forward, -x number of rows backward)
//sensitive -> sensitive tochanges happening to the db outside your program
//updatable -> you can make changes to the resultset and save the changes back to ur db
public class ScrolltypeDemo {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseappdb", "root",
					"root");
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rset = statement.executeQuery("select * from course");
			// beforeFirst(),first(),last(),afterlast(),previous()
			rset.next();
			System.out.print(rset.getInt("courseId"));
			System.out.print(rset.getString("title"));
			System.out.print(rset.getString("author"));
			System.out.println();
			rset.first();
			System.out.print(rset.getInt("courseId"));
			System.out.print(rset.getString("title"));
			System.out.print(rset.getString("author"));
			System.out.println();
			rset.last();
			System.out.print(rset.getInt("courseId"));
			System.out.print(rset.getString("title"));
			System.out.print(rset.getString("author"));
			System.out.println();
			//rset.afterLast();
			rset.absolute(1);
			System.out.print(rset.getInt("courseId"));
			System.out.print(rset.getString("title"));
			System.out.print(rset.getString("author"));
			System.out.println();
			
			rset.absolute(-2);
			System.out.print(rset.getInt("courseId"));
			System.out.print(rset.getString("title"));
			System.out.print(rset.getString("author"));
			System.out.println();
			rset.absolute(1);
			rset.relative(3);
			System.out.print(rset.getInt("courseId"));
			System.out.print(rset.getString("title"));
			System.out.print(rset.getString("author"));
			System.out.println();	
			rset.relative(-2);
			System.out.print(rset.getInt("courseId"));
			System.out.print(rset.getString("title"));
			System.out.print(rset.getString("author"));
			System.out.println();	
			
			
			

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}
	}

}
