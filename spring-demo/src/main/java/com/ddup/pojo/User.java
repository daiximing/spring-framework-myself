package com.ddup.pojo;

/**
 * @author Dai Ximing
 * @create 2023-05-15 9:15
 */
public class User {

	private Long id;
	private int age;
	private String name;

	public User() {
	}

	public User(Long id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
