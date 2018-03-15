import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	People p1 = new People(22, "Jeff", "Code");
	People p2 = new People(23, "Bob", "Chef");
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	
	ArrayList<People> peoplelist = new ArrayList<People>();
	
	peoplelist.add(p1);
	peoplelist.add(p2);
	
	System.out.println(peoplelist);
	
	for(People people: peoplelist) {
		
		System.out.println(people.toString());
		
	}
		
	for(People people : peoplelist){
	        if(people.getName().contains("Bob"))
	        
	        System.out.println(people.getName()); //searches for person object by name
	}
	
	// garage task starts here
	
	
	}
	
	}

