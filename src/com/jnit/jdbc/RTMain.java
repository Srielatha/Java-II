package com.jnit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RTMain {

	public static void main(String[] args) {
		loadReviewers(2);
	}
	
	public static void loadReviewers(int taskId){
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "root");){
			String sql = "select t.name,t.task_id,r.name,r.reviewer_id from reviewer r join reviewer_task rt on r.reviewer_id = rt.reviewer_id join task t on t.task_id = rt.task_id where t.task_id = ?;";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, taskId);
			ResultSet rs = pstmt.executeQuery();
			Task t1 = new Task();
			List<Reviewer>reviewers = new ArrayList<>();
			while(rs.next()){
				t1.setName(rs.getString(1));
				t1.setTaskId(rs.getInt(2));
				Reviewer r = new Reviewer();
				r.setName(rs.getString(3));
				r.setReviewerId(rs.getInt(4));
				reviewers.add(r);
			}
			t1.setReviewers(reviewers);
			System.out.println(t1.getTaskId());
			System.out.println(t1.getName());
			t1.getReviewers().forEach(r -> System.out.println(r));
		}catch(SQLException se){
			se.printStackTrace();
		}

	}

}
