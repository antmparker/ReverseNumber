import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

                int userNum;
                int revNum = 0;
                System.out.println("Enter your number: "); //Ask user to enter numbers
                Scanner input = new Scanner(System.in);
                userNum=input.nextInt();
                while (userNum !=0) { // Loops until userNum is 0
                    revNum = revNum * 10;
                    revNum = revNum + (userNum % 10); // Formula to reverse number
                    userNum = userNum / 10;
                }
                System.out.println("Your number in reverse is " + revNum + "."); //Prints out number in reverse

            }

        }

