package session1;

public class Example7 {

}
/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 The value of n will be a valid index of a char in the original string 
 (i.e. n will be in the range 0..str.length()-1 inclusive).
 missingChar("kitten", 1) = "ktten"
missingChar("kitten", 0) ="itten"
missingChar("kitten", 4) = "kittn"

public String missingChar(String str, int n) {
  int strLen = str.length();
  String newString="";
  int i=0;
  if(strLen>n){
    if((n>=0)&&(n<=strLen-1)){
      for(i=0;i<strLen;i++){
        if(i!=n){
          newString =newString+str.charAt(i);
        }
      }
      return newString;
    }
    return "enter valid number for n";
  }
  return "Please pass a valid string";
}

*/

/*
 Given a string, return a new string where the first and last chars have been exchanged.
frontBack("code") = "eodc"
frontBack("a") = "a"
frontBack("ab") = "ba"
 
 public String frontBack(String str) {
  int strLen=str.length();
  int i=0;
  String newString = "";
  String blankStr="";
  if(strLen==1){
    return str;
  }
  else if(strLen==0){
    return blankStr;
    
  }
  else{
     char strFirstChar= str.charAt(0);
    char strLastChar= str.charAt(strLen-1);
    for(i=1;i<strLen-1;i++){
     newString = newString + str.charAt(i); 
    }
    return strLastChar+newString+strFirstChar;
  }
}

*/