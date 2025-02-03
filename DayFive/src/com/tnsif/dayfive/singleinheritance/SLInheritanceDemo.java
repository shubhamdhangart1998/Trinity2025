package com.tnsif.dayfive.singleinheritance;

public class SLInheritanceDemo {

	public static void main(String[] args) {
	
		//create and object of student
		Student s=new Student("Riza", "12345", "Pune", 9876543210l, 1001, "Trinity");
		
		System.out.println(s);
		
		Student s1=new Student();
		s1.setAddress("Mumbai");
		s1.setAdharNo("32145");
		s1.setCollegeName("KJ");
		s1.setName("Zeel");
		s1.setPhoneNo(876542190l);
		s1.setRollNo(1002);
		
		System.out.println(s1.getName());
		System.out.println(s1.getRollNo());

	}

}
