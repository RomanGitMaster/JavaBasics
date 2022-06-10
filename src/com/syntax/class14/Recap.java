package com.syntax.class14;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str="I never forget about recording";
		System.out.println(str.replace("never","always"));// can call replace twice in one statement <--meter chaining
		str="647457249jasndf*^7893kw0";
		System.out.println(str.replaceAll("[0-9]",""));
		
		String str2="Batch 13 is Great. Batch 13 is Best. Batch 13 is excellent";
		String[] arr=str2.split(" ");//<---- split at dot("[.]") into different arrays within arr
		System.out.println(arr[0]);    //<----- or we can split on any other symbol, like space" "
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	}

}
