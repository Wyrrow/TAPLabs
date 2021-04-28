package com.company;

public class ComplexFraction extends Fraction{

    double numerator_Im;
    double denomerator_Im;

    public double getNumerator_Im() {
        return numerator_Im;
    }

    public void setNumerator_Im(double numerator_Im) {
        this.numerator_Im = numerator_Im;
    }

    public double getDenomerator_Im() {
        return denomerator_Im;
    }

    public void setDenomerator_Im(double denomerator_Im) {
        this.denomerator_Im = denomerator_Im;
    }


    public ComplexFraction(){}

    public ComplexFraction(double num_r, double num_im, double denum_r, double denum_im)
    {
        numerator=num_r;
        denominator = denum_r;
        numerator_Im = num_im;
        denomerator_Im = denum_im;
    }

    @Override
    public String toString() {
        char sign, sign_d;
        if (numerator_Im < 0)
            sign = '-';
        else
            sign = '+';

        if (denomerator_Im < 0)
            sign_d = '-';
        else
            sign_d = '+';


        return "(" + String.valueOf(numerator) + sign + String.valueOf(Math.abs(numerator_Im)) + "i) /" +
                "(" + String.valueOf(denominator) + sign_d + String.valueOf(Math.abs(denomerator_Im)) + "i)";
    }

    @Override
    public String multiply(Fraction _fraction) {
        double nr, ni, dr, di;

        nr = numerator* _fraction.numerator;
        ni = numerator_Im* _fraction.numerator;

        dr = denominator* _fraction.denominator;
        di = denomerator_Im*_fraction.denominator;

        ComplexFraction tmpFrac = new ComplexFraction(nr,ni,dr,di);

        return tmpFrac.toString();

    }

    public String multiply(ComplexFraction _cfraction)
    {
        double nr, ni, dr, di;
        nr = numerator * _cfraction.numerator - numerator_Im * _cfraction.numerator_Im;
        ni = numerator * _cfraction.numerator_Im + numerator_Im * _cfraction.numerator;

        dr = denominator * _cfraction.denominator - denomerator_Im * _cfraction.denomerator_Im;
        di = denominator * _cfraction.denomerator_Im + denomerator_Im * _cfraction.denominator;

        ComplexFraction tmpFrac = new ComplexFraction(nr,ni,dr,di);

        return tmpFrac.toString();

    }
    @Override
    public String divide(Fraction _fraction)
    {
        double nr, ni, dr, di;

        nr = numerator* _fraction.denominator;
        ni = numerator_Im* _fraction.denominator;

        dr = denominator* _fraction.numerator;
        di = denomerator_Im*_fraction.numerator;

        ComplexFraction tmpFrac = new ComplexFraction(nr,ni,dr,di);

        return tmpFrac.toString();
    }

    public String divide(ComplexFraction _cfraction)
    {
        double nr, ni, dr, di;
        nr = numerator * _cfraction.denominator - numerator_Im * _cfraction.denomerator_Im;
        ni = numerator * _cfraction.denomerator_Im + numerator_Im * _cfraction.denominator;

        dr = denominator * _cfraction.numerator - denomerator_Im * _cfraction.numerator_Im;
        di = denominator * _cfraction.numerator_Im+ denomerator_Im * _cfraction.numerator;

        ComplexFraction tmpFrac = new ComplexFraction(nr,ni,dr,di);

        return tmpFrac.toString();


    }

}


