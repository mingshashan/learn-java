package com.build.mingshashan.learnjava.base;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		ArrayList b = new ArrayList();
		Class c1 = a.getClass();
		Class c2 = b.getClass();
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(a == b);
		System.out.println(a.equals(b));
	
		
		ArrayList<String> a1 = new ArrayList<String>();  
		a1.add("CSDN_SEU_Cavin");  
		
		a1.add("TEST");
		Class c = a1.getClass();  
		try{  
		    Method method = c.getMethod("add",Object.class);  
		    method.invoke(a1,100);  
		    System.out.println(a1);  
		}catch(Exception e){  
		    e.printStackTrace();  
		}  
		
	}
}
