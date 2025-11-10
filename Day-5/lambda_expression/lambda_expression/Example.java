package lambda_expression;

public class Example{

		
	public static void main(String[] args) {
		
		Printable f = (a,b) -> {return a+b;};
		System.out.println(f.print(2,3));
		
		StringJoiner sj = (s1,s2)-> "Hello" +s1+ " " +s2;
		
		//Taxable t= (d) ->{return d;};
		//Taxable t= d -> {return d;};
		Taxable t = d -> d; //recommended way, cause shorter.
		
		//Searchable s = (String data) -> {return true;};
		//Searchable s = (data) -> {return true;};
		//Searchable s = data -> {return true;};
		Searchable s = data -> true;
	}

}
