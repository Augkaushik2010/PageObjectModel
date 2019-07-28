/*
 The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
 We sleep in if it is not a weekday or we're on vacation. 
 Return true if we sleep in.
 */
package session1;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean AreWeSleepIn = sleepIn(true, false);
		if (AreWeSleepIn)
		{
		System.out.println("yeah! we are sleep in.");
		}
		else
		{
			System.out.println("Either this is a weekday or We are on not in vacation.");
		}
		

	}
	public static boolean sleepIn(boolean weekday, boolean vacation) 
	{

	  if(!weekday||vacation)
	    {
	    return true;
	    }
	  else
	  {
	    return false;
	  }
	  
	}

}






