package session1;

public class Example9 {

}
/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
public boolean in1020(int a, int b) {
 
 if((a >= 10 && a <= 20)||(b >=10 && b <= 20)){
   return true;
 }
 return false;
}

We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 2 int values, return true if one or the other is teen, but not both.

public boolean loneTeen(int a, int b) {
  if((a >=13 && a <= 19) && (b >=13 && b <=19)){
    return false;
  }
  else if((a >=13 && a <= 19) || (b >=13 && b <=19)){
    return true;
  }
  else{
    return false;
  }
}


Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
Otherwise, return the string unchanged.
public String delDel(String str) {
  int strLen= str.length();
  String newString="";
  
  if((strLen>=4) && (str.substring(1, 4).equals("del"))){
    char firstchar = str.charAt(0);
    String remainchars = str.substring(4);
    newString = firstchar+remainchars;
    return newString;
    
  }
  return str;
}

Given a string, return a string made of the first 2 chars (if present),
 however include first char only if it is 'o' and include the second
 only if it is 'z', so "ozymandias" yields "oz".

public String startOz(String str) {
   String result = "";
  
  if (str.length() >= 1 && str.charAt(0)=='o') {
    result = result + str.charAt(0);
  }
  
  if (str.length() >= 2 && str.charAt(1)=='z') {
    result = result + str.charAt(1);
  }
  
  return result;
}


Given three int values, a b c, return the largest.
public int intMax(int a, int b, int c) {
  int max=0;
  if(a>b){
    max = a;
  }
  else{
    max = b;
  }
  
  if(max<c){
    max = c;
  }
  return max;
}


Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
Note that Math.abs(n) returns the absolute value of a number.

public int close10(int a, int b) {
  int x=Math.abs(10-a);
  int y=Math.abs(10-b);
  
  if(x<y){
    return a;
  }
  else if(x==y){
    return 0;
  }
  else{
    return b;
  }
}
*/