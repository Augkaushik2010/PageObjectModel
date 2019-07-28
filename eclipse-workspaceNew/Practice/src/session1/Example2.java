/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
 */
package session1;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean AreWeInTrouble = monkeyTrouble(true, true);
		if (AreWeInTrouble)
		{
		System.out.println("Hey!We are in a trouble.");
		}
		else
		{
			System.out.println("We are not in trouble.");
		}
		

	}
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) 
	{

	  if((aSmile&&bSmile)||(!aSmile&&!bSmile))
		 {
			return true;
		 }
	 
	  else
	  {
			 return false;
		}

	}
}






