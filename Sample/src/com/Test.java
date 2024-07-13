package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


class A{
	public void display(){
		System.out.println("Parent");
	}
}

class B extends A{
	public void display(){
		System.out.println("Child");
	}
}


public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		int i =0;
		// TODO Auto-generated method stub
//		File jarPath=new File("C:\\Users\\VIN000\\Sample.txt");
//        String propertiesPath=jarPath.getParentFile().getAbsolutePath();
//        InputStream xml = new FileInputStream(new File(propertiesPath));
//        System.out.println("XML:"+xml.toString());
		
		
		A a = new A();
		a.display();
		
		B b = new B();
		b.display();
		
		A aa = new B();
		aa.display();
		
//		B bb = new A();

	}

}
