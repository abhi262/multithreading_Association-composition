package Association_Composition;

public class Variable_user {
	private int id;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Variable_user [id=" + id + ", name=" + name + "]";
	}

	/**
	 * @param id
	 * @param name
	 */
	public Variable_user(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private String name;

}
