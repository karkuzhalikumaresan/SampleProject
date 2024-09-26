package org.arr;

public class Long {
	public static void main(String[] args) {
		String s = "Welcome to javawelcome Welcome javawelcome";
		String longest="";
		String[] split = s.split(" ");
		for (String s1:split) {
			try {
				if(s.equals(null)) {
					System.out.println("Empty");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			} if(s1.length()>longest.length()) {
				longest=s1;	
			}
			
		}System.out.println(longest);
		
	}

}
