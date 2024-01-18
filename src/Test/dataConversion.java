package Test;

public class dataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		String s = String.valueOf(a);
		System.out.println(s +" "+ "Integer  to String");
		
		
		String i ="100";
		int b = Integer.parseInt(i);
		System.out.println(b +" "+ "String to Int");
		
		char d = 'a';
		//String c = String.valueOf(d);
		String c= Character.toString(d);
		
		System.out.println(c +" "+ "char to String");
		
		String e ="b";
		char f = e.charAt(0);
		System.out.println(f +" "+ "String to char");
		
	}

}
