
public class HelloWorld {
	
	public static void main(String[] args) {

		System.out.println("HelloWorld!");  //HELLO WORLD
		String b = "HelloWorld!"; //ASSINGMANET
		System.out.println(b); //assignment
		System.out.println(Method1()); //return types - returns string from method1 when called
		printString("Im being called from a method"); //parameters - calls string from method
		System.out.print(Method2(0, 7, false)+ ", "); //parameters/operators, conditionals and conditionals 2
		
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(Method2(2, i, false)+ ", "); // Iteration
		}
		
		System.out.println();
		
		int num[] = {0,1,2,3,4,5,6,7,8,9};
		for(int i:num) {
			System.out.print(Method2(2, i, false)+ ", "); // Arrays - creates array of 10 integers
		}
		
		System.out.println();
		
		for(int i:num) {
			System.out.print(i+ ", "); // Arrays - populates array with values
		}
		
		System.out.println();
		
	    int[] arrayOfInts = new int[10];  // Iteration/Arrays - creates empty array
	    for (int i = 0; i < 10; i++) {
	    	
	    	arrayOfInts[i] = i;
	    	System.out.print(arrayOfInts[i]+ ", "); // Iteration/Arrays - for loop iterates through array and outputs each value
	    }
	    
	    System.out.println();
	    
	    int[] arrayOfInts2 = new int[10];
        for (int i = 0; i < 10; i++) {  //Iteration/arrays 2 - loop that populates empty array.
	    	
	    	arrayOfInts2[i] = arrayOfInts[i]*10;
	    	System.out.print(arrayOfInts2[i]+ ", "); // Iteration/arrays 2
        }
	   
	}
	
	static void printString(String s) {
		
	 System.out.println(s); //parameters
	}
	
	static String Method1(){
		
		 return "Im being returned from a method"; // return types
	}
	
	static int Method2(int a, int b, boolean c) {  //parameters/operators, conditionals and conditionals 2
		
		
        if(a == 0) {
			
			return b;
		}
					
		if(b == 0) {
			
			return a;
		}

		if(c == true) {
			
			return a + b;
		}
		
		else {
			
			return a * b;
		}
	
	}
	
}

