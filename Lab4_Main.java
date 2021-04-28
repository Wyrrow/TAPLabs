package com.company;

public class Main {

    public static void main(String[] args) {
	    Fraction f1 = new Fraction(2,3);
	    Fraction f2 = new Fraction(5,7);

        System.out.println("F1 * F2 = " + f1.multiply(f2));
        System.out.println("F1 / F2 = " + f1.divide(f2));

        ComplexFraction c1 = new ComplexFraction(4,5,7,-9);
        System.out.println(c1);
        System.out.println("F1 * c1 = " + c1.multiply(f1));
        System.out.println("c1 / f1 = " + c1.divide(f1));
        System.out.println("F1 * c1 = " + f1.multiply(c1));

        ComplexFraction c2 = new ComplexFraction(2,-3,1,4);
        System.out.println("c1 * c2 = " + c1.multiply(c2));
        System.out.println("c1 / c2 = "+ c1.divide(c2));

    }
}
