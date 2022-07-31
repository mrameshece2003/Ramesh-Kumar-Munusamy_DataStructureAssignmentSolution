package com.gl.dsa.gradedassignment2;

import java.util.Scanner;

public class BuildingConstruction {

	static int floors;
	static int floorSize;

	public static void main(String[] args) {
		int noOfFloors=0;
		int n=noOfFloors;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		noOfFloors=scan.nextInt() ;

		int floorSize1[]= new int[noOfFloors];

		System.out.println("enter the floor size given on day : " );

		for (int i=0; i<noOfFloors; i++) {
			floorSize1[i]=scan.nextInt();
			

			/*
			int temp=0;
			for (int k = 0; k <floorSize1.length; k++) {     
				for (int j = i+1; j < floorSize1.length; j++) {     
					if(floorSize1[k] <floorSize1[j]) {    
						temp = floorSize1[k];    
						floorSize1[k] = floorSize1[j];    
						floorSize1[j] = temp;    
					}		
				}
			}
			 System.out.println("The order of construction is as follows:  ");    
		        for (int k = 0; k < floorSize1.length; i++) {     
		            System.out.print(floorSize1[k] + " ");    
		}
	}
	*/
}
}
}