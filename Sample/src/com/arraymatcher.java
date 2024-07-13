package com;

public class arraymatcher {
	
	public static void main(String args[]){
		int[] a ={1,2,3,4};
		int[] b ={1,2,3,5,5};
		
		boolean isSame = true;
		if(a.length == b.length){
		for(int i = 0 ; i < a.length; i++){
			System.out.println(i);
			if(a[i] == b[i]) continue;
			else {
				isSame = false;
				break;
			}
		} 
		}else {
		isSame = false;
		}
		System.out.println(isSame);
//		if(a==b){
//		System.out.println("Same");
//		} else {
//			System.out.println("false");
//		}
//		for(int i=0;i<a.len)
	}

}
