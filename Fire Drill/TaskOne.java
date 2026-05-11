import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){

    Scanner input = new Scanner (System.in);

        int[] array = new int[10];
        int count = 0;

    for(int score = 0; score < array.length; score++){
            System.out.print("Enter Score: ");

             int scores = input.nextInt();
            
            array[score] = scores;
            
           }
            
      for( count = 0; count < array.length; count++){
      System.out.print(array[count] + "  ");
         }
        }
       }

