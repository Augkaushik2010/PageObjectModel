/*
Given two int values, return their sum. 
Unless the two values are the same, then return double their sum.
 */
package session1;

public class Example3 {

	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			int Result = sumDouble(10,10);
			System.out.println("The end result is: "+Result);
		}
	public static int sumDouble(int a, int b) {
		  if(a!=b)
		  {
		    return a+b;
		  }
		    return (a+b)*2;
		}
}






