package arrays;

import java.util.Scanner;

public class SingleDarray {

	public static void main(String[] args) 
	{
		
		//Scanner s1 = new Scanner(System.in);
		//System.out.println("Enter name :");
		//String name = s1.next();
		//Scanner s2 = new Scanner(System.in);
		//System.out.println("Enter id :");
		//int id = s2.nextInt();
		//.out.println("id is"+id+" name is"+name);
		/*
		 * int[] a = {10,20,30,40}; for(int i=0;i<a.length;i++) {
		 * System.out.println("a["+i+"]="+a[i]); }
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size :");
		int asize = sc.nextInt();
		
		int[] a = new int[asize];	
		int sum = 0;
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum + a[i];
		}
		System.out.println("Sumof the array is : " + sum);
	}

}
