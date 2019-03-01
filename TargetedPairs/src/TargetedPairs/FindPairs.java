package TargetedPairs;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;



public class FindPairs {

	public static void main(String[] args) {
		
		//generates an ordered list of 25 integers between -12 and 50, & with no repeats
				TreeSet<Integer> numbers =  new TreeSet<Integer>();
				Random rand = new Random();
				while(numbers.size() < 25)
				    numbers.add(rand.nextInt(62) + (-12));
				
				System.out.println("Numbers Generated: " + numbers);
				System.out.println();
				System.out.println("After converting array to int: ");

				int[] ret = new int[numbers.size()];
			    Iterator<Integer> iterator = numbers.iterator();
			    for (int i = 0; i < ret.length; i++)
			    {
			        ret[i] = iterator.next().intValue();
			        System.out.print(ret[i] + " ");
			    }
			    System.out.println();
			    System.out.println();
			    int targetNumber = 0;
			    System.out.println("Enter a target number: ");
			    Scanner sc = new Scanner(System.in);
			    targetNumber = sc.nextInt();
			    int ans = 0;
			   
			    System.out.println();
			    System.out.println("Pairs whose sum equal " + targetNumber + " are: ");
			    System.out.println();
		        for (int i = 0; i < 25; i++) {
		            for (int j = i+1; j < 25; j++) {
		                int sum = ret[i] + ret[j];
		                if (sum == targetNumber) {
		                	System.out.println(ret[i] + "," + ret[j]);
		                    ans++;
		                }
		            }
		        }
		        System.out.println();
		        System.out.println("Total number of pairs whose sum equal " + targetNumber + " are: " + ans);
			    
	}
}