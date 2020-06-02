package com.project.JPA;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class users {
	

	@Id
	private int Id;
	private String Name;
	private int Age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "users [Id=" + Id + ", Name=" + Name + ", Age=" + Age + "]";
	}
	
	

}
