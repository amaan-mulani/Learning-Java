package enum_demo;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenderType m = GenderType.MALE;
		System.out.println(m);
		
		GenderType f = GenderType.FEMALE;
		System.out.println(f);
		
		GenderType[] g = f.values();
	}

}
