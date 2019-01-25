package com.company;


import java.util.ArrayList;

class apint {
    char sign;
    String num;
    ArrayList<Integer> apNum;


    apint() {
        this.sign = '+';
        this.num = "";
    }

    apint(char sign, String digits) {
        this.sign = sign;
        this.num = digits;
        this.apNum = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            char c = digits.charAt(i);
            int a = Character.getNumericValue(c);
            this.apNum.add(a);

        }
    }

    apint(int number) {
        String s = Integer.toString(number);
        char c = s.charAt(0);
        if (c == '+' || c == '-') {
            s = s.substring(1, s.length());
            this.sign = c;
        } else {
            this.sign = '+';
        }

        this.num = s;
        this.apNum = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            int a = Character.getNumericValue(b);
            this.apNum.add(a);
        }
    }

    apint(double number) {
        String num = String.format("%.0f", number);
        this.apNum = new ArrayList<>();
        this.num = num;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int a = Character.getNumericValue(c);
            this.apNum.add(a);
        }
    }

    void print() {
        if (this.num.charAt(0) == '0') {
            String newNum = "";
            for (int i = 0; i < this.num.length(); i++) {
                if (this.num.charAt(i) == '0') {
                    continue;
                } else {
                    newNum += this.num.charAt(i);
                }
            }
            this.num = newNum;
        }

        if (this.sign == '-') {
            System.out.println('-' + this.num);
        } else {
            System.out.println(this.num);
        }
    }


    void trimZero() {
        boolean noMoreLeadingZeros = false;
        if (this.num.charAt(0) == '0') {
            String newNum = "";
            for (int i = 1; i < this.num.length(); i++) {
                if (this.num.charAt(i) == '0' && !noMoreLeadingZeros) {
                    continue;
                }
                newNum += this.num.charAt(i);
                noMoreLeadingZeros = true;
            }
            this.num = newNum;
        }
    }

    apint add(apint that) {

        apint firstNum = this;
        apint secondNum = that;
        char sign = '+';
        if ((this.sign == '+' && that.sign == '-') || (this.sign == '-' && that.sign == '+')) {
            firstNum = new apint();
            firstNum.apNum = this.apNum;
            firstNum.num = this.num;

            secondNum = new apint();
            secondNum.apNum = that.apNum;
            secondNum.num = that.num;

            firstNum.sign = '+';
            secondNum.sign = '+';
            return firstNum.subtract(secondNum);
        }

        if (this.sign == '-' && that.sign == '-') {
            sign = '-';
        }
        if (this.apNum.size() < that.apNum.size()) {
            secondNum = this;
            firstNum = that;
        }

        ArrayList<Integer> placeHolderList = new ArrayList<>();
        int carryout = 0;
        int counter = 0;
        for (int i = firstNum.apNum.size() - 1; i >= 0; i--) {
            int addVal;
            if (counter > secondNum.apNum.size() - 1) {
                addVal = 0;
            } else {
                addVal = secondNum.apNum.get((secondNum.apNum.size()) - counter - 1);
            }
            int val = (firstNum.apNum.get(i) + addVal) + carryout;
            if ((val / 10) > 0) {
                placeHolderList.add(val % 10);
                carryout = val / 10;
            } else {
                placeHolderList.add(val);
                carryout = 0;
            }
            counter++;
        }
        if (carryout > 0) {
            placeHolderList.add(carryout);

        }
        ArrayList<Integer> answer = new ArrayList<>();

        String s = "";
        int idx = 0;
        for (int i = placeHolderList.size() - 1; i >= 0; i--) {
            answer.add(placeHolderList.get(i));
            s = s + answer.get(idx);
            idx++;
        }

        apint returnVal = new apint();
        returnVal.apNum = answer;
        returnVal.num = s;
        returnVal.sign = sign;
        returnVal.trimZero();
        return returnVal;

    }


    apint subtract(apint that) {
        apint firstNum = this;
        apint secondNum = that;
        char sgn = '+';
        if (firstNum.compareTo(secondNum) == -1) {
            sgn = '-';
            firstNum = that;
            secondNum = this;
        }
        if (firstNum.compareTo(secondNum) == 0) {
            return new apint(0);
        }

        if (firstNum.sign == '-' && secondNum.sign == '+') {
            apint placeHoldNumOne = new apint('-', firstNum.num);
            apint placeHoldNumTwo = new apint('-', secondNum.num);
            placeHoldNumOne.apNum = firstNum.apNum;
            placeHoldNumTwo.apNum = secondNum.apNum;
            apint returnVal = placeHoldNumOne.add(placeHoldNumTwo);
            return returnVal;
        }

        if (firstNum.sign == '+' && secondNum.sign == '-') {
            apint placeHoldNumOne = new apint('+', firstNum.num);
            apint placeHoldNumTwo = new apint('+', secondNum.num);
            placeHoldNumOne.apNum = firstNum.apNum;
            placeHoldNumTwo.apNum = secondNum.apNum;
            apint returnVal = placeHoldNumOne.add(placeHoldNumTwo);
            returnVal.sign = sgn;
            return returnVal;
        }


        ArrayList<Integer> placeHolderList = new ArrayList<>();

        int carryout = 0;
        int counter = 0;
        for (int i = firstNum.apNum.size() - 1; i >= 0; i--) {
            int subval;
            if (counter > secondNum.apNum.size() - 1) {
                subval = 0;
            } else {
                subval = secondNum.apNum.get((secondNum.apNum.size()) - counter - 1);
            }
            int place = firstNum.apNum.get(i);
            int val = place - subval - carryout;

            if (place < subval || val < 0) {
                val = (place + 10) - subval - carryout;
                carryout = 1;
            } else {
                carryout = 0;
            }
            placeHolderList.add(val);
            counter++;
        }

        ArrayList<Integer> answer = new ArrayList<>();
        String s = "";
        int idx = 0;
        for (int i = placeHolderList.size() - 1; i >= 0; i--) {
            answer.add(placeHolderList.get(i));
            s = s + answer.get(idx);
            idx++;
        }

        apint returnVal = new apint(sgn, s);
        returnVal.trimZero();

        return new apint(returnVal.sign, returnVal.num);
    }


    apint multiply(apint that) {

        apint firstnum = this;
        apint secondnum = that;
        char sign;
        if (firstnum.apNum.size() < secondnum.apNum.size()) {
            apint ph = firstnum;
            firstnum = secondnum;
            secondnum = ph;
        }

        if (firstnum.sign == secondnum.sign) {
            sign = '+';
        } else {
            sign = '-';
        }


        ArrayList<ArrayList> placeHolderList = new ArrayList<>();
        int place = 0;
        for (int i = secondnum.apNum.size() - 1; i >= 0; i--) {
            ArrayList<Integer> currentPlaceInReverse = new ArrayList<>();
            int carryout = 0;
            for (int p = 0; p < place; p++) {
                currentPlaceInReverse.add(0);
            }
            for (int j = firstnum.apNum.size() - 1; j >= 0; j--) {
                int product = (firstnum.apNum.get(j) * secondnum.apNum.get(i)) + carryout;
                int currentPoint = product % 10;
                carryout = product / 10;
                currentPlaceInReverse.add(currentPoint);
            }
            if (carryout > 0) {
                currentPlaceInReverse.add(carryout);
            }
            ArrayList<Integer> currentPlace = new ArrayList<>();

            for (int l = currentPlaceInReverse.size() - 1; l >= 0; l--) {
                currentPlace.add(currentPlaceInReverse.get(l));

            }
            placeHolderList.add(currentPlace);
            place++;
        }
        ArrayList<ArrayList> separatedList = new ArrayList<>();

        for (int i = placeHolderList.size() - 1; i >= 0; i--) {
            separatedList.add(placeHolderList.get(i));
        }

        ArrayList<String> stringList = new ArrayList<>();

        for (int i = 0; i < separatedList.size(); i++) {
            String num = "";
            for (int j = 0; j < separatedList.get(i).size(); j++) {
                num += separatedList.get(i).get(j);
            }
            stringList.add(num);
        }
        apint summedProduct = new apint('+', "0");

        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);
            apint temp = new apint('+', s);
            summedProduct = summedProduct.add(temp);
        }
        summedProduct.trimZero();
        summedProduct.sign = sign;
        return summedProduct;

    }

    apint divide(apint that) throws IllegalArgumentException {
        apint numerator = this;
        apint divisor = that;
        char sign;
        if (numerator.sign == divisor.sign) {
            sign = '+';

        } else {
            sign = '-';

        }

        if (divisor.apNum.size() == 0) {
            throw new IllegalArgumentException("Divisor is zero");
        }
        ArrayList<Integer> placeholderList = new ArrayList<>();
        apint res = new apint();
        apint tmp1 = new apint();
        tmp1.apNum = new ArrayList<>();
        apint tmp2 = new apint();
        apint zero = new apint(0);
        String s = "";

        for (int i = 0; i < numerator.apNum.size(); i++) {
            int digit = numerator.apNum.get(i);
            tmp1.apNum.add(digit);
            tmp1.num += digit;
            if (tmp1.compareTo(divisor) >= 0) {
                int counter = 0;
                while (true) {
                    tmp2 = new apint(tmp1.sign, tmp1.num);
                    tmp1 = tmp1.subtract(divisor);
                    if (tmp1.compareTo(zero) == -1) {
                        break;
                    }
                    counter++;
                }

                if (tmp2.compareTo(zero) == 0) {
                    placeholderList.add(counter);
                    s += counter;
                    for (int j = i + 1; j < numerator.apNum.size(); j++) {
                        placeholderList.add(0);
                        s += 0;
                    }
                    break;
                }
                tmp1 = new apint(tmp2.sign, tmp2.num);
                placeholderList.add(counter);
                s += counter;
            }
        }


        res.apNum = placeholderList;
        res.num = s;
        res.sign = sign;
        return res;

    }

    public String toString() {
        if (this.sign == '-') {
            return '-' + this.num;
        } else {
            return this.num;
        }
    }

    int compareTo(apint that) {
        if (this.sign == '-' && that.sign == '+') {
            return -1;
        } else if (this.sign == '+' && that.sign == '-') {
            return 1;
        } else if (this.sign == '-' && that.sign == '-') {
            if (this.apNum.size() > that.apNum.size()) {
                return -1;
            } else if (this.apNum.size() < that.apNum.size()) {
                return 1;

            } else {

                for (int i = 0; i < this.apNum.size(); i++) {
                    if (this.apNum.get(i) > that.apNum.get(i)) {
                        return -1;
                    } else if (this.apNum.get(i) < that.apNum.get(i)) {
                        return 1;
                    }
                }
                return 0;
            }
        } else {
            if (this.apNum.size() > that.apNum.size()) {
                return 1;
            } else if (this.apNum.size() < that.apNum.size()) {
                return -1;

            } else {

                for (int i = 0; i < this.apNum.size(); i++) {
                    if (this.apNum.get(i) > that.apNum.get(i)) {
                        return 1;
                    } else if (this.apNum.get(i) < that.apNum.get(i)) {
                        return -1;
                    }
                }
                return 0;
            }
        }
    }
}
