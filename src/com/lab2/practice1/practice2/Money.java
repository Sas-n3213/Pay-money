package com.lab2.practice2;

import java.util.Scanner;

public class Money {
public static void main (String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the size of currency denomination:");
	int size = sc.nextInt();
	int[] notes=new int [size];
	System.out.println("Enter the currency denomination value:");
	for(int i=0; i<size; i++) {
		notes[i]=sc.nextInt();
		
	}
	System.out.println("Enter the amount:");
	int amount = sc.nextInt();
	Money bs = new Money();
	bs.sort(notes);
	Money notesCount = new Money();
    notesCount.notesCountImplementation(notes,amount);
}

public void sort (int[]notes) {
	int n= notes.length;
	for (int i=0; i<n-1 ; i++) {
		for (int j=0; j<n-i-1 ; j++) {
			if (notes[j]<notes[j+1]) {
				int temp=notes[j];
				notes[j]=notes[j+1];
				notes[j+1]=temp;
			}
		}
	}
	
}
public void notesCountImplementation(int notes[],int amount) {
	int[] noteCounter = new int[notes.length];
	for (int i=0; i<notes.length; i++) {
		if (amount>=notes[i]) {
			noteCounter[i]= amount/notes[i];
			amount=amount-noteCounter[i]*notes[i];
		}
	}
	if (amount>0)
	{
		System.out.println("Exact amount cannot be given with the highest denomination");
	}
	else {
		System.out.println("Your payment approach in order to give min no of notes will be ");
		for (int i=0; i<notes.length;i++) {
			if (noteCounter[i]!=0) {
				System.out.println(notes[i]  +  ":"   + noteCounter[i]);
			}
		
			
		}
	}
	
	
}

}
