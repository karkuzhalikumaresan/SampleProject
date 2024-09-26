package org.arr;

public class Twoarr {
	public static void main(String[]args) {
	int marks[][]=new int[2][5] ;
	marks[0][0]=88;
	marks[0][1]=90;
	marks[0][2]=100;
	marks[0][3]=70;
	marks[0][4]=85;
	
	marks[1][0]=58;
	marks[1][1]=69;
	marks[1][2]=50;
	marks[1][3]=77;
	marks[1][4]=91;
	
	for(int i=0;i<marks.length;i++) {
		for(int j=0;j<marks[i].length;j++) {
			System.out.println(marks[i][j]);
		}
	}
	}
}
