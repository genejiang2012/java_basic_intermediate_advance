import java.util.Scanner;

public class FunctionTest2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number:");
        int number = scanner.nextInt();
        printNineNineTable(number);

    }

    public static void printNineNineTable(int number){
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }    
}