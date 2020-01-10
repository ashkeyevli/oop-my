package lab1_1;

import java.util.Scanner;
public class lab1_5 {
 public static void main(String[] args) {
 double balance, rate;
 double NewBalance;
 Scanner scan = new Scanner(System.in);
 balance = scan.nextInt();
 rate = scan.nextInt();
 scan.close();
 NewBalance = ((rate/100)+1)*balance;
 System.out.print(NewBalance);
}
}
