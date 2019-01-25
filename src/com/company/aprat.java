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


    aprat add(aprat that) {

        if (this.denominator.num.compareTo(that.denominator.num) == 0) {
            apint newNumerator = this.numerator.add(that.numerator);
            aprat returnVal = new aprat();
            returnVal.sign = newNumerator.sign;
            returnVal.numerator = newNumerator;
            returnVal.denominator = this.denominator;
            return returnVal;

        }
        apint lcm = apint.LeastCommonMultiple(this.denominator,that.denominator);
        apint newDenominator = this.denominator.multiply(that.denominator);

        apint firstNumerator = this.numerator.multiply(that.denominator);
        apint secondNumerator = that.numerator.multiply(this.denominator);

        apint newNumerator = firstNumerator.add(secondNumerator);

        aprat returnVal = new aprat();
        returnVal.numerator = newNumerator;
        returnVal.denominator = newDenominator;
        returnVal.sign = newNumerator.sign;
        returnVal.simplify();
        return returnVal;
    }


    aprat subtract(aprat that) {
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
        returnVal.simplify();
        return returnVal;

    }

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
        returnVal.simplify();
        return returnVal;
    }


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
        returnVal.simplify();
        return returnVal;
    }


    void print() {
        this.numerator.print();
        for (int i = 0; i < this.numerator.apNum.size(); i++) {
            System.out.print("-");
        }
        System.out.println();
        this.denominator.print();
    }

    void simplify() {
        apint gcd = apint.GreatestCommonDivisor(this.numerator, this.denominator);
        this.numerator = this.numerator.divide(gcd);
        this.denominator = this.denominator.divide(gcd);
    }

}

