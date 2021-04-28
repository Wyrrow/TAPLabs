package com.company;

public class Fraction implements IFraction{

    double numerator;
    double denominator;


    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }



    public Fraction(){}

    public  Fraction(double _num, double _denom){
        numerator = _num;
        denominator = _denom;
    }



    @Override
    public String toString() {
        return String.valueOf(getNumerator()) + " / " + String.valueOf(getDenominator());
    }

    @Override
    public String multiply(Fraction _fraction) {
        Fraction result = new Fraction();
        double num;
        double denom;
        num = this.getNumerator() * _fraction.getNumerator();
        denom = this.getDenominator() * _fraction.getDenominator();

        result.setNumerator(num);
        result.setDenominator(denom);

        return result.toString();
    }

    @Override
    public String divide(Fraction _fraction) {
        Fraction result = new Fraction();
        double num;
        double denom = 0.0;
        num = this.getNumerator() * _fraction.getDenominator();
        denom = this.getDenominator() * _fraction.getNumerator();

        result.setNumerator(num);
        result.setDenominator(denom);

        return result.toString();
    }
}
