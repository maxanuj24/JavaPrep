import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;
interface FunctionalInter{
	void show();
	default public void showa(){
		System.out.println("First aaShow");	
	}
	default public void showaa(){
		System.out.println("First aaaShow");	
	}
	static void display(){
	System.out.println("First display");		
	}	
}
class Lambda{
	public static void main(String[] args) {
				
			FunctionalInter fi =()->System.out.println("This is show()");
			fi.show();	

			Consumer c = (x)->System.out.println(x);
			c.accept(5);

			Supplier<String> s = ()-> {return "25";};
			System.out.println(s.get());

			Predicate<Integer> p = x->x%2==0;
			System.out.println(p.test(25));
			System.out.println(p.test(28));

			Function<Integer,String> f = (i)-> i+"";
			System.out.print(f.apply(22));

			FunctionalInter.display();
			}
}