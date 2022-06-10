package com.syntax.reviewclass4;

public class NestedLoopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//with WHILE
		int c=1;
    while(c<=2) {
    	System.out.println(c);
    	c++;
    	    }
    while(c<=2) {// since c was incremented to 3 in first loop (1(c++), 2(c++0),3( c++.. but it terminates on three)
    	System.out.println(c);// and dont go to loop 2 , where c<=2
    	c++;
    }
    System.out.println("--------------------------------");
    //With Nested LOOP
    
    int f=1;
    while(f<=3) {
    	System.out.println("g");
    	f++;
    	int c1=1;
    while(c1<=2) {
    	System.out.println(c1);
    	c1++;
    	    }
    }
    
    
    
    
    
    
	}

}
