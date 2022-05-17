import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int dogCount = 2;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 1;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    
    flipNHeads(1);
    clock();
  }
  
  public static  String pluralize(String word, int counter) {
    if (counter == 0 || counter > 1 ){
      return word + "s";
    } else {
      return word;
    }
  }
  public static void flipNHeads(int n) {

    Random rand = new Random();
    int flips = 0;
    int headcount = 0;
    while (headcount != n){
      float rando = rand.nextInt(10);
      rando /= 10;
      flips++;
      if (rando < 0.5){
        continue;
      } else{
        System.out.println("Heads");
        headcount++;
      }
      System.out.println("It took " + flips + " flips to flip " + n + " heads in a row. \n");
    }

  }

  public static void clock() {
    int tempSeconds= 0;
    while(true){
    LocalDateTime now = LocalDateTime.now();
    int second = now.getSecond();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    if(tempSeconds != second) {
      System.out.println(time);
    }
    tempSeconds = second;
  }
  }
}