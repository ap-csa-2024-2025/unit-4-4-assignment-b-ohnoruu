import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    String sentence = "gagagigo the giga risen";
    String target = "gaga";
    int count = 0;
    for (int i = 0; i < sentence.length()-(target.length()-1); i++){
      String L = sentence.substring(i, i+target.length());
      if (L.equals(target)){
        count++;
      }
    }
    System.out.println(count);
  }

  public static int countSub(String word, String target)
  {
    return 0;
  }

  public static int countProperContains(String word, String target)
  {
    return 0;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
