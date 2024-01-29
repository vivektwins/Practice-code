package Test.Integer;

public class addingallnumbers {
	
	
	//adding all numbers (5+5 =10, 1+0=1)
	static int fina =0;
    int last =0;
	 //Input = 9991 = 28 = 10 =1 
    public static void main (String[] args) {
        int a[] = {450,600};
        int sum = 0;
        int value=0;
        
        for(int i=0;i<=a.length-1;i++)
        {
            
            
             sum+= a[i];
             
            
        }
        
        
        if(sum>=10 && sum<=9999)
        {
         value = addition(sum);
            while (value>=10)
            {
               value=  addition(value);
            }
        }
        
        System.out.println(value);
    }
        
    public static int addition(int number){
             
             fina = 0;
                 while(number>0)
                 {
                 
                 int b1 = number%10;
                 number = number/10;
                 fina+= b1;
                 //System.out.println(fina);
                 }
            
             return fina;
        
    }

}
