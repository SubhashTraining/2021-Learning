package StringQuestions;


public class Armstrong {

 public static void main(String args[])
 {
	 
	 System.out.println(armstrong(134));
	 
 }
	
 public static boolean armstrong(int n)
 {
	 
	 int temp =n;
	 int digits=0;
	 while(temp>0)
	 {
		 temp=temp/10;
		 digits++;
	 }
	 
	 temp =n;
	 int sum =0; 
	 while(temp>0)
	 {
		 
		 sum=(int) (sum+(Math.pow(temp%10, digits)));
		 temp=temp/10;
	 }
	 
	 
	 if(sum==n) return true;
	 else return false;
		 
	 
	 
	 
 }
 
}
