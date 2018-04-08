package control;

import java.security.acl.Permission;

import sun.security.acl.PermissionImpl;

public class TestClass {

	public static void main(String[] args) {
		Person per = new Person();//创建新的对象
		//对象.属性
		//对象.方法
		per.name = "gholamidin";
		per.age = 23;
		per.tell();
	}

}
