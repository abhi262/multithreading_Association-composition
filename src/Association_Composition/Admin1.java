package Association_Composition;

public class Admin1 {
	private int admin1id;
	private String admin1_name;
	private Variable_user user;

	public int getAdmin1id() {
		return admin1id;
	}

	@Override
	public String toString() {
		return "Admin1 [admin1id=" + admin1id + ", admin1_name=" + admin1_name + ", user=" + user + "]";
	}

	public String getAdmin1_name() {
		return admin1_name;
	}

	public Variable_user getUser() {
		return user;
	}

	public void setAdmin1id(int admin1id) {
		this.admin1id = admin1id;
	}

	public void setAdmin1_name(String admin1_name) {
		this.admin1_name = admin1_name;
	}

	public void setUser(Variable_user user) {
		this.user = user;
	}

	/**
	 * @param admin1id
	 * @param admin1_name
	 * @param user
	 */
	public Admin1(int admin1id, String admin1_name, Variable_user user) {
		super();
		this.admin1id = admin1id;
		this.admin1_name = admin1_name;
		this.user = user;
		
	}

}
