package session1;

public class Example8 {

}
/*

Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


front3("Java")  "JavJavJav"
front3("Chocolate")  "ChoChoCho"
front3("abc")  "abcabcabc"

public String front3(String str) {
  int strLen=str.length();
  String newString="";
  String newString1="";
  if(strLen<3){
    newString= str+str+str;
    return newString;
  }

  else{
    newString1 = str.substring(0,3);
    newString = newString1+newString1+newString1;
    return newString;
  }
  
}

Given a string, take the last char and return a new string with the 
last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") = "tcatt"
backAround("Hello") = "oHelloo"
backAround("a") = "aaa"

public String backAround(String str) {
  int strLen=str.length();
  String newstring="";
  if(strLen>0){
    char lastchar = str.charAt(strLen-1);
    newstring = lastchar+str+lastchar;
    return newstring;
  }
  return "Please enter a valid string with atleast one character in it.";
}


Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 Use the % "mod" operator
 
 public boolean or35(int n) {
  if(n>0){
    if((n%3==0)||(n%5==0)){
      return true;
    }
    return false;
  }
  return false;
}

Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
 If the string length is less than 2, use whatever chars are there.
 
 public String front22(String str) {
  int strLen=str.length();
  String newstring="";
  
  if(strLen<2){
    return str+str+str;
  }
  else{
    String first2chars = str.substring(0,2);
    newstring = first2chars+str+first2chars;
    return newstring;
  }
}

Given a string, return true if the string starts with "hi" and false otherwise.
public boolean startHi(String str) {
  if(str.startsWith("hi")){
    return true;
  }
  return false;
}

Given two temperatures, return true if one is less than 0 and the other is greater than 100.
public boolean icyHot(int temp1, int temp2) {
  if((temp1<0)&&(temp2>100)){
    return true;
  }
  else if((temp1>100)&&(temp2<0)){
    return true;
  }
  else{
    return false;
  }
}
*/
