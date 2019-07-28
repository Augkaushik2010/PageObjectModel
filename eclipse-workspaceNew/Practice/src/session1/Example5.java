/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
Return true if we are in trouble.
 */
package session1;

public class Example5 {

	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			boolean Result = parrotTrouble(true,22);
			if(Result) {
				System.out.println("We are in trouble.");
			}
			else 
			{
				System.out.println("We are safe.");
			}
		}
	public static boolean parrotTrouble(boolean talking, int hour) {
		  if(!talking)
		  {
		    return false;
		  }
		  else if(hour>23 || hour<0)
		  {
		    return false;
		  }
		  else
		  {
		    if((hour<7 || hour>20) && talking)
		    {
		      return true;
		    }
		    return false;
		  }
		}
}






