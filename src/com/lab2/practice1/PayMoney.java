package com.lab2.practice1;

import java.util.Scanner;

public class PayMoney {

                public static void main (String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int arr [] = new int [size];
		System.out.println("Enter the elements of array:");
		
		for (int i =0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
System.out.println("Enter the total no of targets that needs to be achieved:");

         int t =sc.nextInt();
	 for (int i =1; i<=t; i++) {
	 System.out.println("Enter the value of target:");
	 int target =sc.nextInt();
		
	 int sum=0;
	 for (int j =0; j<size; j++) {
				
	 sum = sum + arr[j];
			

	if (sum >= target) {
			System.out.println("Target achieved after"  +(j+1)+   "transactions");
			break;
				}
			}
	if(sum<target) {
			System.out.println("Target cannot be achieved");
				}
					
			}
			
		
		
		
		
	
		
		
	
		
}

}
