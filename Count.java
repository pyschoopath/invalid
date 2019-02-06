import java.util.*;
import java.lang.*;
import java.io.*;
class VowelOrConsonant 
{
  public static void main(String args[])
   {
      
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
      {
         System.out.println("vowel");
      }
      else
      {
         System.out.println("consonant");
      }
   }
}
