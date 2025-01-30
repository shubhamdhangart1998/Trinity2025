package com.tnsif.daytwo.controlstat;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		char userinput='g';
		
		switch(userinput)
		{
		case 'l':
		case 'L':
			System.out.println(userinput + " is a Leader");
			break;
			
		case 'a':
		case 'A':
			System.out.println(userinput + " is a Apple");
			break;
			
		case 'b':
		case 'B':
			System.out.println(userinput + " is a Box");
			break;	
			
		case 'z':
		case 'Z':
			System.out.println(userinput + " is a Zero");
			break;
			
			default :
				System.out.println(userinput + " is other than letters provide");
				break;
		}

	}

}
