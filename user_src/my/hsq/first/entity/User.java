package my.hsq.first.entity;


public class User {
	private int id;
	private String username;
	private int userage;
	private String useraddress ;
	
	
	
	public User() {
		super();
	}
	public User(int id, String username, int userage, String useraddress) {
		super();
		this.id = id;
		this.username = username;
		this.userage = userage;
		this.useraddress = useraddress;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the userage
	 */
	public int getUserage() {
		return userage;
	}
	/**
	 * @param userage the userage to set
	 */
	public void setUserage(int userage) {
		this.userage = userage;
	}
	/**
	 * @return the useraddress
	 */
	public String getUseraddress() {
		return useraddress;
	}
	/**
	 * @param useraddress the useraddress to set
	 */
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	
	
	
}
