package com.gmail.agentup;

public class Cat {
	private int age;
	private double weigth;
	private String sex;
	private String color;
	private String voice;

	public Cat(int age, double weigth, String sex, String color, String voice) {
		super();
		this.age = age;
		this.weigth = weigth;
		this.sex = sex;
		this.color = color;
		this.voice = voice;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public String isSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", weigth=" + weigth + ", sex=" + sex + ", color=" + color + ", voice=" + voice
				+ "]";
	}

}
