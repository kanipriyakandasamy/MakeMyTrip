package testConstructor;

import java.awt.desktop.SystemEventListener;

public class MyClass {
  int id;
  String name;
  int age;
  public MyClass(int i,String n,int ag) {
	id=i;
	name=n;
	age=ag;
  }
  public void display(String name) {
	   System.out.println(id +" "+name+" "+age);
	   System.out.println(name);
  }
  public static void main(String[] args) {
	  MyClass aa=new MyClass(1,"silambu",30);
	  aa.display("zaheer");
  }
}

