package com.smileintheworld.blog.dao;

import java.sql.Timestamp;

import javax.persistence.Id;

public class Comment extends BaseDao {
	@Id
	Integer id;
	String username;
	String content;
	Timestamp time;
	int blog_id;

	
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", username=" + username + ", content=" + content + ", time=" + time + ", blog_id="
				+ blog_id + "]";
	}
	
}
