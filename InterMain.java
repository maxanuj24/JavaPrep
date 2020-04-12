interface First{
	default public void show(){
		System.out.println("First Show");	
	}
	default public void showa(){
		System.out.println("First aaShow");	
	}
	default public void showaa(){
		System.out.println("First aaaShow");	
	}
	static void display(){
	System.out.println("First display");		
	}	
	static void display2(){
	System.out.println("First display22");		
	}	
}

interface Second{
	default public void show(){
		System.out.println("Second Show");	
	}	
} 

class Third implements First,Second{

	public void show(){
		First.super.show();
		First.super.showa();
		First.super.showaa();
		Second.super.show();
		System.out.println("Third Show");
	}
	
	void display(){
	System.out.println("Third display");		
	}	
}

public class InterMain{
	public static void main(String[] args) {
		Third th = new Third();
		th.show();	
		First.display();
		th.display();
		First.display2();
	}
}