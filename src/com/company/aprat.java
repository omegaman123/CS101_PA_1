package com.company;

public class aprat {

    apint numerator;
    apint denominator;
    char sign;
    String err;


    aprat() {
        this.numerator = new apint();
        this.denominator = new apint();
        this.sign = '+';
    }

    aprat(apint numerator, apint denominator){

        this.numerator = new apint('+',numerator.num);
        this.denominator = new apint('+',denominator.num);
        if (numerator.sign == denominator.sign){
            this.sign = '+';
        } else {
            this.sign = '-';
        }
        this.simplify();

    }

    // Constructer that takes in two integers to be a numerator and denominator.
    aprat(int numerator, int denominator) {
        this.numerator = new apint(numerator);
        this.denominator = new apint(denominator);
        if (numerator < 0 && denominator > 0) {
            this.sign = '-';
        } else if (numerator > 0 && denominator < 0) {
            this.sign = '-';
        } else {
            this.sign = '+';
        }
        if (numerator == 0 || denominator == 0) {
            this.err = "Denominator or numerator given is 0";
            return;
        }
    }

    // Constructor that takes in a double and converts in to a rational number by first, counting how many decimal places
    // it has. Then, multiplying the original by 10 times the number of decimal places to get rid of the decimal
    // and finally, dividing by 10 times the number of decimal places
    aprat(double d) {
        char sgn;
        String s = String.valueOf(d);
        int decIdx = s.indexOf(".");
        String deciString = s.substring(decIdx + 1);
        if (s.charAt(0) == '-') {
            sgn = '-';
            s = s.substring(1);
        } else {
            sgn = '+';
        }
        s = s.substring(0, decIdx);

        int places = deciString.length();
        s += deciString;
        apint topPart = new apint('+', s);
        int mag = 1;
        for (int i = 0; i < places; i++) {
            mag *= 10;
        }
        apint placeVal = new apint(mag);
        this.numerator = topPart;
        this.denominator = placeVal;
        this.simplify();
        this.numerator.sign = sgn;

    }

    //Subtract two aprats by changing their bases to be equal, and calling apint add on the top two numbers
    //Simplify the result.
    aprat add(aprat that) {
        //If the denominators are the same, there is no need to change bases
        if (this.denominator.num.compareTo(that.denominator.num) == 0) {
            apint newNumerator = this.numerator.add(that.numerator);
            aprat returnVal = new aprat();
            returnVal.sign = newNumerator.sign;
            returnVal.numerator = newNumerator;
            returnVal.denominator = this.denominator;
            return returnVal;

        }
        apint newDenominator = this.denominator.multiply(that.denominator);
        apint firstNumerator = this.numerator.multiply(that.denominator);
        apint secondNumerator = that.numerator.multiply(this.denominator);
        apint newNumerator = firstNumerator.add(secondNumerator);

        aprat returnVal = new aprat();
        returnVal.numerator = newNumerator;
        returnVal.denominator = newDenominator;
        returnVal.sign = newNumerator.sign;

        char sgn1 = returnVal.numerator.sign;
        char sgn2 = returnVal.denominator.sign;
        returnVal.numerator.sign = '+';
        returnVal.denominator.sign = '+';
        returnVal.simplify();
        returnVal.denominator.sign = sgn2;
        returnVal.numerator.sign = sgn1;
        return returnVal;
    }


    //Subtract two aprats by changing their bases to be equal, and calling apint subtract on the top
    //Simplify the result.
    aprat subtract(aprat that) {
        //If the denominators are the same, there is no need to change bases
        if (this.denominator.num.compareTo(that.denominator.num) == 0) {
            apint newNumerator = this.numerator.subtract(that.numerator);
            aprat returnVal = new aprat();
            returnVal.sign = newNumerator.sign;
            returnVal.numerator = newNumerator;
            returnVal.denominator = this.denominator;
            return returnVal;
        }
        apint newDenominator = this.denominator.multiply(that.denominator);
        apint firstNumerator = this.numerator.multiply(that.denominator);
        apint secondNumerator = that.numerator.multiply(this.denominator);
        apint newNumerator = firstNumerator.subtract(secondNumerator);

        aprat returnVal = new aprat();
        returnVal.numerator = newNumerator;
        returnVal.denominator = newDenominator;
        returnVal.sign = newNumerator.sign;

        char sgn1 = returnVal.numerator.sign;
        char sgn2 = returnVal.denominator.sign;
        returnVal.numerator.sign = '+';
        returnVal.denominator.sign = '+';
        returnVal.simplify();
        returnVal.denominator.sign = sgn2;
        returnVal.numerator.sign = sgn1;
        return returnVal;

    }


    //Divide two aprats by multiplying one by the reciprocal of the other and simplify the result
    aprat divide(aprat that) {
        aprat reciprocal = new aprat();
        reciprocal.numerator = that.denominator;
        reciprocal.denominator = that.numerator;
        reciprocal.sign = that.sign;

        apint numProduct = this.numerator.multiply(reciprocal.numerator);
        apint denProduct = this.denominator.multiply(reciprocal.denominator);

        aprat returnVal = new aprat();
        returnVal.numerator = numProduct;
        returnVal.denominator = denProduct;
        if (returnVal.denominator.sign == returnVal.numerator.sign) {
            returnVal.sign = '+';
        } else {
            returnVal.sign = '-';
        }

        char sgn1 = returnVal.numerator.sign;
        char sgn2 = returnVal.denominator.sign;
        returnVal.numerator.sign = '+';
        returnVal.denominator.sign = '+';
        returnVal.simplify();
        returnVal.denominator.sign = sgn2;
        returnVal.numerator.sign = sgn1;
        return returnVal;
    }

    //Multiplying two aprats entails multiplying the numerators with eachother, than the denominators with eachother.
    //Finally, simplify the results.
    aprat multiply(aprat that) {
        apint newNumerator = this.numerator.multiply(that.numerator);
        apint newDenominator = this.denominator.multiply(that.denominator);

        aprat returnVal = new aprat();
        returnVal.numerator = newNumerator;
        returnVal.denominator = newDenominator;

        if (returnVal.denominator.sign == returnVal.numerator.sign) {
            returnVal.sign = '+';
        } else {
            returnVal.sign = '-';
        }
        char sgn1 = returnVal.numerator.sign;
        char sgn2 = returnVal.denominator.sign;
        returnVal.numerator.sign = '+';
        returnVal.denominator.sign = '+';
        returnVal.simplify();
        returnVal.denominator.sign = sgn2;
        returnVal.numerator.sign = sgn1;
        return returnVal;
    }


    //simplify finds the GCD of the numerator and the denominator, then divide both by that number.
    void simplify() {
        apint gcd = apint.GreatestCommonDivisor(this.numerator, this.denominator);
        this.numerator = this.numerator.divide(gcd);
        this.denominator = this.denominator.divide(gcd);
    }

    // aprats are printed in form : n/d
    public String toString() {
        if (this.sign == '-'){
            return "-" + this.numerator + "/" + this.denominator;
        }
        return this.numerator + "/" + this.denominator;
    }

    // Print out for aprat in the form of : numerator/denominator
    void print() {
        if (this.sign == '-') {
            System.out.println("-" + this);
        } else {
            System.out.println(this);
        }
    }
}

