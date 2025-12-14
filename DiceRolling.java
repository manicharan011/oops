
import java.util.Random;
public class DiceRolling {
public static void main(String[] args) throws InterruptedException {
Random random = new Random();
int successfulAttempts = 0;
System.out.println("Rolling a pair of dice 10 times...");
for (int i = 1; i <= 10; i++) {

int dice1 = random.nextInt(6) + 1; 
int dice2 = random.nextInt(6) + 1;
System.out.println("Attempt " + i + ": Dice 1 = " + dice1 + ", Dice 2 = " + dice2);
if(dice1==dice2){
    System.out.println("result : successful attempt");
    successfulAttempts++;
}
else{
    System.out.println("result : not successful attempt");
}

if (i<10) { 
Thread.sleep(10000);
}}
System.out.println("\nTotal Successful Attempts: " + successfulAttempts);
}
}