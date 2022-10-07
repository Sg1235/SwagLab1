

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int NumbertoCheck= 371;
		int temp= NumbertoCheck;
		int remainder=0;
		int result =0;
		
		while (temp !=0) {
			
			remainder = temp%10;
			
			result = result +(remainder*remainder*remainder);
			
			
			temp=temp/10;
		
		}
		
		if (NumbertoCheck==result)
		{
			System.out.println(NumbertoCheck+"-"+"is an Armstrong Number ");
			
		}
		
		else {
			System.out.println(NumbertoCheck+"  "+"is Not Armstrong Number ");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
