package in.ashokit.bean;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {

		Class<?> clz = Class.forName("in.ashokit.bean.User");

		Object object = clz.newInstance();


		Field ageField = clz.getDeclaredField("age"); // loading variable
		ageField.setAccessible(true); // making variable accessible
		ageField.set(object, 50); // setting value to variable
		
		
		User u = (User) object;
		int age = u.getAge();
		System.out.println("User Age :: " + age);

	}

}
