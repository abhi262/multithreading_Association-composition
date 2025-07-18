package Association_Composition;

public class Launch {
public static void main(String[] args) {
	Variable_user variable_user = new Variable_user(1, "variable user");
	Admin1 admin1 = new Admin1(1, "abhi",variable_user );
	System.out.println(admin1.getUser());
}
}
