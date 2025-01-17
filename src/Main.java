import java.util.*;
public class Main {

    //table of a number
    public static void table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }

    //number is prime or not
    public static void checkPrime(int a){
        int count = 1;
        if(a<=0){
            System.out.println("Invalid");
        }
        else if(a==1){
            System.out.println("Not prime");
        }
        else{
            if(a==2){
                System.out.println("Prime");
            }
            else {

                for (int i = 2; i < Math.sqrt(a); i++) {
                    if (a % i == 0) {
                        count = count+1;
                    }

                }
            }
            if (count ==1) {
                System.out.println(a + " is Prime");
            } else {
                System.out.println("not prime");
            }

        }
    }

    //factorial of a number
    public static void Factorial(int n){

        int fact =1;
        for(int i =1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }

    //write a program to get all the armstrong numbers between two numbers
    public static void Armstrong(int a , int b){
        //armstrong number = the sum of its digits raised to
        //                   the power of the number of digits equals the number itself.

        for(int i= a; i<=b; i++){
            int sum = 0, temp = i, digit;
            int digits = String.valueOf(i).length();

            while(temp!=0){
                digit = temp%10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if(sum== i){
                System.out.println(i);
            }
        }
    }

    //pattern
    public static void Pattern(int rows) {
        for(int i = 1; i<=rows; i++){
            for(int j = 1;j<=i; j++){
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    //logical && and || operations on boolean values
    public static void Values(boolean a, boolean b){
        System.out.println("Logical and: " +(a && b));
        System.out.println("Logical or: "+(a||b));
    }

    //marks and grades
    public static void Grade(int marks){
        if(marks>90 && marks<=100){
            System.out.println("A");
        }
        else if(marks>80 && marks<=90){
            System.out.println("B");
        }
        else if(marks>70 && marks<=80){
            System.out.println("C");
        }
        else if(marks>60 && marks<=70){
            System.out.println("D");
        }
        else if(marks<=60 && marks>=0){
            System.out.println("F");
        }
        else{
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number to print table: ");
        int n = sc.nextInt();
        table(n);


        System.out.println("Enter a number to check prime: ");
        int a = sc.nextInt();
        checkPrime(a);

        System.out.println("Enter a number to get it's factorial: ");
        int b = sc.nextInt();
        Factorial(b);

        System.out.println("Enter two numbers to get all the armstrong number between them: ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        Armstrong(c,d);

        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();
        Pattern(row);

        System.out.println("Enter two boolean values: ");
        boolean e = sc.nextBoolean();
        boolean f = sc.nextBoolean();
        Values(e,f);

        System.out.println("Enter marks of a student: ");
        int marks = sc.nextInt();
        Grade(marks);

        // keep printing the value until user enters 0
        System.out.println("Enter value: ");
        while(true) {

            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            else {
                System.out.println(x);
            }
        }
    }
}
