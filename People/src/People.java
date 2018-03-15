
public class People {
	
	public int age;
	public String name;
	public String jobtitle;
	
	//variables
	
	public People (int age, String name, String jobtitle) {
		
		this.age = age;
		this.name = name;
		this.jobtitle = jobtitle;
		
		//constructor method
	}
	
	public String toString() {
		
		return "Age: " + age + " Name: " + name + " Job Title: " + jobtitle;
	}
	
	public String getName() {
	    return name;
	}

} // methods
