/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 */
package session1;

public class Example6 {

	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			boolean Result = makes10(9,12);
			if(Result) {
				System.out.println("Either one of them is 10 or their sum is 10.");
			}
			else 
			{
				System.out.println("Neither one of them is 10 or their sum is not 10.");
			}
		}
	public static boolean makes10(int a, int b) {
		  if(a==10||b==10||(a+b==10))
		  {
		    return true;
		  }
		  return false;
		}

}

/*
 
Given an int n, return true if it is within 10 of 100 or 200. 
Note: Math.abs(num) computes the absolute value of a number.
 
 public boolean nearHundred(int n) 
{
  if(Math.abs(100-n)<=10 || Math.abs(200-n)<=10)
  {
    return true;
  }
    return false;
}

 Given 2 int values, return true if one is negative and one is positive. 
 Except if the parameter "negative" is true, then return true only if both are negative.
 
posNeg(1, -1, false)  true
posNeg(-1, 1, false)  true
posNeg(-4, -5, true)  true
 
 public boolean posNeg(int a, int b, boolean negative) {
  if(negative){
    if(a<0&&b<0){
      return true;
    }
    return false;
  }
  else
  {
   if((a<0&&b>0) ||(a>0&&b<0))
   {
     return true;
   }
   return false;
  }
}


Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. 
Note: use .equals() to compare 2 strings.
public String notString(String str) {
  if((str.length()>3) && (str.substring(0,3).equals("not")))
  {
    return str;
  }
  else if(str.equals("not"))
  {
    return str;
  }
  return "not "+str;
}

*/
