package Test.oops;

class constructorOverloading {
	
		//instance variables of the class  
		int id,passoutYear;  
		String name,contactNo,collegeName;  
		  
		
		
		constructorOverloading(String contactNo, String collegeName, int passoutYear){  
		this.contactNo = contactNo;  
		this.collegeName = collegeName;  
		this.passoutYear = passoutYear;  
		System.out.println("1");
		}  
		  
		constructorOverloading(int id, String name){  
		this("9899234455", "IIT Kanpur", 2018);  
		this.id = id;  
		this.name = name;  
		System.out.println("2");
		}  
		 
		
		private constructorOverloading()
		{
			System.out.println("private");
		}
		  
		public static void main(String[] args) {  
		//object creation  
			constructorOverloading cos = new constructorOverloading(101, "John");
			constructorOverloading cos1 = new constructorOverloading();
			System.out.println("Printing Student Information: \n");  
		System.out.println("Name: "+cos.name+"\nId: "+cos.id+"\nContact No.: "+cos.contactNo+"\nCollege Name: "
		+cos.contactNo+"\nPassing Year: "+cos.passoutYear);  
		}  
		

}
