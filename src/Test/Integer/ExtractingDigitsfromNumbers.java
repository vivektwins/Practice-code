package Test.Integer;

public class ExtractingDigitsfromNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 31022024;
		String day ="";
		String month ="";
		int count =0;
		String year ="";
		String temp="";
		
		String s = String.valueOf(n);
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			count++;
			
			temp+= String.valueOf(c[i]);
			if(count ==2)
			{
				day =temp;
				temp="";
				
			}
			if(count ==4)
			{
				month =temp;
				temp="";
			}
			if(count ==8)
			{
				year =temp;
				temp="";
			}
		}
		
		System.out.println(day + " "+ month+ " "+ year);
		
		int day1 = Integer.parseInt(day);
		int month1 = Integer.parseInt(month);
		int year1 = Integer.parseInt(year);
		
		
		if((day1!=0 && day1<=31)  && (month1!=0 && month1<12) && (year1>=2024))
		{
			
			int next = day1+1;
			int previous = day1-1;
			
			System.out.println(next+"-"+month1+"-"+year1 + " " + previous+"-"+month1+"-"+year1);
		}
		
	}

}
