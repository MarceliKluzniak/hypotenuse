package pl.mkluzniak;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x;
        double y;
        double z;


        Scanner scanner = new Scanner(System.in); //declare new scanner to input in program numbers

        System.out.println("Enter side x: "); //program is asking for x siede lenght
        x = scanner.nextDouble();
        System.out.println("Enter side y: "); //program is asking for y siede lenght
        y = scanner.nextDouble();

        z = Math.sqrt(((x*x)+(y*y))); //its formula for hypoteneus
        System.out.println("The hypotenuse is : "+z);
        scanner.close(); //scanner is closed



    }
}
