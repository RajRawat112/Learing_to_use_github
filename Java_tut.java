import java.util.Scanner;
import java.util.Random;
public class Java_tut{
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);
        /* 
        System.out.println("X: ");
        String x = Sc.nextLine();
        System.out.println("Y: ");
        String y = Sc.nextLine();
        String Temp_con = null;

        Temp_con = x;
        x = y;
        y = Temp_con;
        
        System.out.println("x: " + x );
        System.out.println("y: " + y);
     
    Random random = new Random();
    System.out.println("Press any key to roll a dice:");
    String space = Sc.next();
    int dice = random.nextInt(6)+1;
    System.out.println("So the result of the dice is : " + dice);
    

    System.out.print("Enter the no. of rows: ");
    int rows = Sc.nextInt();
    System.out.print("Enter the no. of columns: ");
    int column = Sc.nextInt();
    System.out.print("Enter the symbol you want to use: ");
    String sym = Sc.next();

    for(int a=1; a<=rows; a++ ){
        System.out.println();
        for(int b=1; b<=column; b++){
            System.out.print(sym);
        }
    }

    String [] animals = {"Cat","Dog","rat","bird"};
    for (String i : animals){
        System.out.print(" "+i);
    }

    System.out.print("Enter no. 1: "+" ");
    int num1 = Sc.nextInt();
    System.out.print("Enter no. 2: "+" ");
    int num2 = Sc.nextInt();
    int sum = cal_sum(num1, num2);
    System.out.println(sum);
    }

    static int cal_sum(int a, int b){
        return a+b;

    String Raj = "Hello";
    System.out.printf("Hello my name is %s",Raj);*/
    human human_1 = new human("Raj",18,67.89);      // Here human_1 and human_2 is an obejct that refers to human.
    human human_2 = new human("Dev",15,58.9);
    human_1.drink();
    human_2.eat();
    human_1.sleep();
    human_2.sleep();
    }
}