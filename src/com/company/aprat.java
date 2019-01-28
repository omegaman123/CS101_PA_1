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
//      apint lcm = apint.LeastCommonMultiple(this.denominator,that.denominator);
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




    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    void print(){
        System.out.println(this);
    }
}

