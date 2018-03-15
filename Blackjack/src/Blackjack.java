
public class Blackjack {

	public static void main(String[] args) {

		System.out.print(Method1(7, 22)); //blackjack
		
		System.out.println();
		
		System.out.print(Method2(2, 2, 2)); //unique sum
		
		System.out.println();
		
		System.out.print(Method3(95, true)); // too hot
	}
	
	
	
	static int Method1(int a, int b) { //blackjack
		 
		
		if(a >= b && a < 21) {
	        
	        return a;
	        		
		}
		
		else if (b >= a && b < 21) {
			
			return b;
		}
		
		else if (a > 21 && b < 21) {
			
			return b;
			
		}
		
		else if (b > 21 && a < 21) {
			
			return a;
		}
		
		else {
			
			return 0;
		}
	}
		
    static int Method2(int a2, int b2, int c) { //unique sum
    	
    	if (a2 == b2 && a2 == c && b2 == c) {
    		
    		return 0;
    	}
    	
    	else if(a2 == b2) {
    		
    		return c;
    	}
    	
    	else if(a2 == c) {
    		
    		return b2;
    	}
    	
    	else if (b2 == c) {
    		
    		return a2;
    	}
    	
    	else {
    		
    		return a2 + b2 + c;
    	}
    }
    
    static boolean Method3(int temperature, boolean isSummer) {  //too hot
    	
    	if(temperature >= 60 && temperature <= 90 && isSummer == false) {
    		
    		return true;
    	}
    	
    	else if(temperature >= 60 && temperature <= 100 && isSummer == true) {
    		
    		return true;
    	}
    	
    	else {
    		
    		return false;
    	}
    }
			
}

	