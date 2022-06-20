import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;

public class Develop {
    public static void main(String[] args) throws Exception {
        try {
            while (true){
                System.out.println("please enter your GuessNumber : ");
                Integer myRandomNumber = Integer.valueOf(RandomNumber(50));
                System.out.println(myRandomNumber);
                Scanner input = new Scanner(System.in);
                Integer health = 5;
                while (health > 0){
                    Integer guessNumber = input.nextInt();
                    if (guessNumber == myRandomNumber){
                        System.out.println("You are win!!:) ");
                        System.exit(0);
                        health = 0;
                    }else if (guessNumber > myRandomNumber){
                        System.out.println("Go Down!");
                        health--;
                    }else if (guessNumber < myRandomNumber){
                        System.out.println("Go Up!");
                        health--;
                    }
                }
                System.out.println("you are lose!!");
                System.out.println("if you want to play again Click to '1' or for Exit Click to '0' ");
                Integer menu = input.nextInt();
                if (menu == 0){
                    System.out.println("Have Nice Day bro!!");
                    System.exit(0);
                }
            }
        } catch (Exception e){
            System.out.println("Error!!");
        }
        System.out.println();
    }
    private static Integer RandomNumber(int bound) throws Exception {
        Random random = new Random();
        Integer rand = random.nextInt(bound);
        return rand;
    }
}