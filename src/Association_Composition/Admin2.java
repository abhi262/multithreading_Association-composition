package Association_Composition;

public class Admin2 {
  private int admin2_id;
  private String admin2_nam3;
  private Variable_user user;
public int getAdmin2_id() {
	return admin2_id;
}
public String getAdmin2_nam3() {
	return admin2_nam3;
}
public Variable_user getUser() {
	return user;
}
public void setAdmin2_id(int admin2_id) {
	this.admin2_id = admin2_id;
}
public void setAdmin2_nam3(String admin2_nam3) {
	this.admin2_nam3 = admin2_nam3;
}
public void setUser(Variable_user user) {
	this.user = user;
}
/**
 * @param admin2_id
 * @param admin2_nam3
 * @param user
 */
public Admin2(int admin2_id, String admin2_nam3, Variable_user user) {
	super();
	this.admin2_id = admin2_id;
	this.admin2_nam3 = admin2_nam3;
	this.user = user;
}
  
}
