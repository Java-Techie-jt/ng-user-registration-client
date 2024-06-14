package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sample {
	
	public static void main(String ars[]){
		String str = "Vijayakumar Vij j";
		
		HashMap<Character, Integer> hm = new HashMap();
		char[] chars = str.toCharArray();
		int maxOccurance = 0;
		
		for(int i =0 ; i <chars.length; i++){
			if(chars[i]==' ') continue;
			if(hm.containsKey(chars[i])){
				hm.put(chars[i], hm.get(chars[i])+1);
			} else{
				hm.put(chars[i], 1);
			}
			
			maxOccurance = (maxOccurance < hm.get(chars[i]) ? hm.get(chars[i]) : maxOccurance);
		}
		
		for(Map.Entry<Character, Integer> m : hm.entrySet()){
			if(maxOccurance == m.getValue()){
				System.out.println("MaxOccurance Char:"+m.getKey() + "Occurance:"+ m.getValue());
			}
		}
		
//		System.out.println(str.chars()
//        .mapToObj(x -> (char) x)                  // box to Character
//        .collect(groupingBy(x -> x, counting()))  // collect to Map<Character, Long>
//        .entrySet().stream()
//        .max(comparingByValue())                  // find entry with largest count
//        .get()                                    // or throw if source string is empty
//        .getKey());
//	}
	
		List<String> number = new ArrayList();
		Collections.addAll(number, "Vijay","Kumar","Leshwanth");
		List<String> list = Collections.unmodifiableList(number);
		System.out.println(number);
		number.add("Leshwanth");
		System.out.println(number);
		System.out.println(list);
		list.add("Maha");
		System.out.println(number);
		System.out.println(list);
		
		
//		int sum = (int) number.stream().filter(x -> x%2==0).reduce(0,(ans,i)-> ans+i);
		
		
		}
	
//
	
}
