import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    pluralize("dog", 1);
    pluralize("cat", 2);
    pluralize("turtle", 0);

    flipNHeads(3);

    clock();

  }

  public static void pluralize(String str, int num) {
    if (num == 0 || num > 1) {
      System.out.println("I own " + num + " " + str + "s.");
    } else
      System.out.println("I own " + num + " " + str + ".");
  }

  public static void flipNHeads(int n) {
    Random rand = new Random();
    int flips = 0;
    int heads = 0;
    while (heads < n) {
      flips++;
      if (rand.nextFloat() >= 0.5) {
        heads++;
        System.out.println("heads");
      } else {
        heads = 0;
        System.out.println("tails");
      }
    }
    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
  }

  public static void clock() {
    LocalDateTime now = LocalDateTime.now();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    while (true) {
      now = LocalDateTime.now();
      if (!now.format(DateTimeFormatter.ofPattern("HH:mm:ss")).equals(time)){
        System.out.println(time);
        time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      }
    }
  }

}
