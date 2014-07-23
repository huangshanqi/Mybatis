package my.hsq.first.entity;

import java.sql.Date;

public class Student {
	private int id;
	private String name;
	private Date birth;
	private float score;
	
	
	public Student(int id, String name, Date birth, float score) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.score = score;
	}
	
	// 注意这里需要保证有一个无参构造方法，因为包括Hibernate在内的映射都是使用反射的，如果没有无参构造可能会出现问题
	public Student() {
		super();
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}
	/**
	 * @param birth the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	/**
	 * @return the score
	 */
	public float getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(float score) {
		this.score = score;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id = "+id+" ,name = "+name+" ,birth = "+birth.toString()+" ,score = "+score+" 。";
	}
	
	
	
	

}
