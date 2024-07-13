package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Samplestream {
	
	public static void main(String args[]){
		List<String> list = (List) Arrays.asList("Madurai","Mumbai","Chennai");
		for(String str : list){
			System.out.println(str);
		}
		
		System.out.println(list.stream()
//				.map( str -> str.toLowerCase())
		.collect(Collectors.groupingBy(str -> str.charAt(0))));
		display();
		}
	
	public static void display(){
			int[] a = {1, 3, 6,8, 2};
			int min = 0, max =0;
			for(int i =0 ; i < a.length-1; i++){
				if(a[i] < a[i+1]){
					min = a[i];
					max = a[i+1];
				} else continue;
			}
			System.out.println(min +" "+max);
		
		Arrays.sort(a);
	}
}
