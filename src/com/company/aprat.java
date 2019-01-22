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

        char sign = '+';
        if (this.denominator.num.compareTo(that.denominator.num)==0){
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
        return returnVal;
    }


    aprat subtract(aprat that){
        if (this.denominator.num.compareTo(that.denominator.num)==0){
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
        return returnVal;

    }


   void print(aprat rat){
       rat.numerator.print(rat.numerator);
       for (int i = 0; i < rat.numerator.apNum.size(); i ++){
           System.out.print("-");
       }
       System.out.println();
       rat.denominator.print(rat.denominator);
    }

    aprat simplify(aprat rat){
       return new aprat();
    }
}
