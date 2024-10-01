import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number");
        int answer = keyboard.hasNextInt();
        keyboard.nextLine();


        while (answer <= 0) {
            System.out.println("Please enter a number higher than 0");
            answer = keyboard.hasNextInt();
            keyboard.nextLine();
        }


        int sum = 0;
        for(int i = 1; i <= answer; i++){
            
            sum += i;
        }

    System.out.println(sum);

        

}



}
