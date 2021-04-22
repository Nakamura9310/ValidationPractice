package com.example.demo.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.User;


@Mapper
public interface UMapper {
	
	//select１件
	public User findOne(String id);
	
	//全件表示
	public List<User> find();
	
	//insert
	public void insertOne(User u);
	
	//update
	public void updateOne(@Param("id") int id, @Param("name") String name, @Param("age") int age);
	
	//delete
	public void deleteOne(User u);
	
}
