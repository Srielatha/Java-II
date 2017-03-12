package com.jnit.jdbc;

public class Course {
	private int courseId;
	private String title;
	private String author;
	
	public Course(int courseId, String title, String author) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.author = author;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
