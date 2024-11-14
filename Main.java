import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    public static int countSub(String word, String target)
    {
      int count = 0;
      for (int i = 0; i < word.length()-(target.length()-1); i++){
        String L = word.substring(i, i+target.length());
        if (L.equals(target)){
          count++;
        }
      }
      return count;
    }

    public static int countProperContains(String word, String target)
    {
      int count = 0;
      int N = target.length();
      for (int i = 0; i < word.length() - (N-1); i++){
        String sub = word.substring(i,i+N);
        boolean beginOrSpaceBefore;
        int endOfTarget = i + target.length();
        boolean endOrSpaceAfter = (endOfTarget == word.length() || word.substring(endOfTarget1, endOfTarget+1).equals(" "));
        boolean properlyContained = beginOrSpaceBefore && endOrSpaceAfter;
        if (sub.equals(target) && properlyContained){
          count++;
        }
      }
      return count;
    }

    public static String deleteSub(String word, String target)
    {
      
      return null;
    }
  }
}