import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Magic8{
  public static void main(String[] args) throws Exception{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    System.out.println(tellMyFuture(s));
  }

  public static String tellMyFuture(String s){
    Random randomAnswer = new Random();
    int holdingValue = randomAnswer.nextInt(3);
    String response;
    switch(holdingValue){
      case 0:
      response = "yes";
      break;
      case 1:
      response = "no";
      break;
      case 2:
      response = "maybe";
      break;
      default:
      response = "null";
    }
    return response;
    }
    }
