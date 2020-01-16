package com.company;
import java.util.Scanner;
public class SquareDriver {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the side length of the square");
        double num = input.nextDouble();
        Square sq = new Square(num);
        System.out.println(sq);
        System.out.println(sq.calculateArea());
    }
}
