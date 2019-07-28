/*
Given an int n, return the absolute difference between n and 21, 
except return double the absolute difference if n is over 21.
 */
package session1;

public class Example4 {

	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			int Result = diff21(31);
			System.out.println("The end result is: "+Result);
		}
	public static int diff21(int n) {
		  if(n<=21)
		  {
		    return 21-n;
		  }
		  else
		  {
		    return (n-21)*2;
		  }
		}
}






