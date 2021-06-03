package com.ty.project;

import java.util.*;

public class Aptitude {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> l=new LinkedList<String>();
		l.add("What is the national bird???");
		l.add("What is the capital of karnataka???");
		l.add("Which is the longest river???");
		l.add("Which is the largest desert in India???");
		l.add("What is the currency in India called???");
		
		List<String> l1=new LinkedList<String>();
		l1.add("1)Peacock 2)Eagle");
		l1.add("1)Bangalore 2)Mysore");
		l1.add("1)Ganga 2)Nile");
		l1.add("1)Sahara 2)Thar");
		l1.add("1)Dollars 2)Rupees");
		int count=0;
		int[] a= {1,1,2,1,2};
	
		for(int i=0;i<l.size();i++) {
			System.out.println(i+1+")"+l.get(i));
			System.out.println(l1.get(i));
			System.out.println("Enter the option");
			int ans=sc.nextInt();
	
			if(ans==a[i]) {
				count++;
			}
			else if(ans!=1 || ans!=2) {
				System.out.println("Not a valid oprion");
			}
		}
		System.out.println("U have answered "+count+" out of 5 questions correctly");
		if(count==5) {
		System.out.println("Excellent Performance");
		System.out.println("Eligible for next round");
		}
		else if(count==3 || count==4) {
			System.out.println("Good Performance");
			System.out.println("Eligible for next round");
		}
		else if(count <=2) {
			System.out.println("Poor Performance");
			System.out.println("Not Eligible for next Round");
		}
		
	}

}
