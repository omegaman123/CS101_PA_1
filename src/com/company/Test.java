package com.company;


public class Test {

    public static void main(String[] args) {

        apint a = new apint('+', "10000");
        apint b = new apint('+', "200");
        apint aa = new apint(-10110);
        apint bb = new apint(-100);
        apint c = new apint('+', "123456789");
        apint d = new apint('+', "987654321");
        apint e = new apint(-100000000);
        apint f = new apint(1234.5678);
        apint ab = new apint('+', "87");
        apint ba = new apint('+', "93");
        apint ca = new apint('-', "90");
        apint ac = new apint('+', "30");
        apint cac = new apint('+', "90");
        apint aca = new apint('-', "30");
        apint cc = new apint('+', "91");
        apint aba = new apint('-', "39");
        apint cca = new apint('+', "20");
        apint bba = new apint('-', "19");
        apint cd = new apint('+', "20");
        apint bbc = new apint('-', "21");
        apint acd = new apint('-', "123");
        apint basc = new apint('+', "456");
        apint m1 = new apint('-', "111");
        apint m2 = new apint('-', "222");
        apint zro = new apint(0);
        aprat fr = new aprat(123, 12);
        aprat rf = new aprat(140, 12);
        System.out.println();

        System.out.println("Testing out print out apint...");
        b.print(); //200
        c.print(); //123456789
        d.print(); //987654321
        e.print(); //-100000000
        f.print(); //1235
        System.out.println();

        System.out.println("Testing printout for  aprat constructors...");
        aprat ggg = new aprat(123.3);
        System.out.println(ggg); // 1233/10

        ggg = new aprat(44.44);
        System.out.println(ggg); // 1111/25

        ggg = new aprat(ab,ba);
        System.out.println(ggg); // 29/31

        ggg = new aprat(cca,bba);
        System.out.println(ggg); // -20/19

        a = new apint(2);
        b = new apint(4);
        ggg = new aprat(a,b);
        System.out.println(ggg); // 1/2

        System.out.println();
        System.out.println("Testing out comparison function for apints...");
        System.out.printf("%s compared to %s = %s", a.num, b.num, a.compareTo(b)); // 10000 ct 200 = 1
        System.out.println();
        System.out.printf("%s compared to %s = %s", b.num, a.num, b.compareTo(a)); // 200 ct 10000 = -1
        System.out.println();
        System.out.printf("%s compared to %s = %s", cca.num, cd.num, cca.compareTo(cd)); // 20 ct 20 = 0
        System.out.println();
        System.out.printf("%s compared to %s = %s", cd.num, zro.num, cd.compareTo(zro)); // 20 ct 0 = 1
        System.out.println();
        System.out.printf("%s compared to %s = %s", aba, zro, aba.compareTo(zro)); // -39 ct 0 = -1
        System.out.println();
        System.out.printf("%s compared to %s = %s", zro.num, zro.num, zro.compareTo(zro)); // 0 ct 0 = 0
        System.out.println();

        apint arg1 = new apint(20020);
        apint arg2 = new apint(2);
        apint result = arg1.divide(arg2); // 20020 / 2 = 10010
        arg1 = new apint(20);
        arg2 = new apint(2);

        System.out.println();
        System.out.println("Testing various functions for various numbers...");
        apint res = a.add(b);
        System.out.printf("%s + %s = %s\n", a, b, res); // 1000 + 200 = 10200

        a = new apint('+', "121932631112635269");
        res = a.divide(c);
        System.out.printf("%s / %s = %s\n", a, c, res); // 121932631112635269 / 123456789 = 987654321

        res = aa.add(bb);
        System.out.printf("%s + %s = %s\n", aa, bb, res); // -10110 + -100 = -10210


        res = c.add(d);
        System.out.printf("%s + %s = %s\n", c, d, res); // 123456789 + 987654321 = 1111111110


        res = ab.add(ba);
        System.out.printf("%s + %s = %s\n", ab, ba, res); // 87 + 93 = 180

        res = ca.subtract(ac);
        System.out.printf("%s - %s = %s\n", ca, ac, res); // -90 - 30 = -120

        res = cac.subtract(aca);
        System.out.printf("%s - %s = %s\n", cac, aca, res); // 90 - -30 = -120

        res = cac.add(aca);
        System.out.printf("%s + %s = %s\n", cac, aca, res); // 90 + -30 = 60

        res = cc.add(aba);
        System.out.printf("%s + %s = %s\n", cc, aba, res); // 91 + -39 = 52

        res = cca.add(bba);
        System.out.printf("%s + %s = %s\n", cca, bba, res.num); // 20 + -19 = 1

        res = cd.add(bbc);
        System.out.printf("%s + %s = %s\n", cd, bbc, res); // 20 + -21

        res = acd.multiply(basc);
        System.out.printf("%s * %s = %s\n", acd, basc, res); //-123 * 456 = -56088

        res = a.multiply(b);
        System.out.printf("%s * %s = %s\n", a, b, res); // 121932631112635269 * 200 = 24386526222527053800

        res = m1.multiply(m2);
        System.out.printf("%s * %s = %s\n", m1, m2, res); // -111 * -222 = 24642

        res = c.multiply(d);
        System.out.printf("%s * %s = %s\n", c, d, res); // 123456789 * 987654321 = 121932631112635269

        apint f1 = new apint(15);
        apint f2 = new apint(51);
        res = f1.subtract(f2);
        System.out.printf("%s - %s = %s\n", f1, f2, res); // 15 - 51 = -36

        apint t1 = new apint(117);
        res = t1.subtract(f2);
        System.out.printf("%s - %s = %s\n", t1, f2, res); // 117 - 51 = 66

        apint d3 = new apint(100);
        apint d4 = new apint(5);
        res = d3.divide(d4);
        System.out.printf("%s / %s = %s\n", d3, d4, res); // 100 / 5 = 20

        apint d5 = new apint(1000);
        apint d6 = new apint(25);
        res = d5.divide(d6);
        System.out.printf("%s / %s = %s\n", d5, d6, res); // 1000 / 25 = 40


        apint ss1 = new apint(100);
        apint ss2 = new apint(25);
        res = ss1.subtract(ss2);
        System.out.printf("%s - %s = %s\n", ss1, ss2, res); // 100 - 25 = 75

        apint ss3 = new apint(100);
        apint ss4 = new apint(20);
        res = ss3.subtract(ss4);
        System.out.printf("%s - %s = %s\n", ss3, ss4, res); // 100 - 20 = 80

        apint sf1 = new apint(1000);
        res = sf1.subtract(ss4);
        System.out.printf("%s - %s = %s\n", sf1, ss4, res); // 1000 - 20 = 980

        ss1 = new apint(10000);
        ss2 = new apint(21);
        res = ss2.subtract(ss1);
        System.out.printf("%s - %s = %s\n", ss2, ss1, res); // 21 - 10000 = -9979

        res = ss1.divide(ss2);
        System.out.printf("%s / %s = %s\n", ss1, ss2, res); // 10000 / 21 = 476

        ss2 = new apint(-25);
        res = ss2.subtract(ss1);
        System.out.printf("%s - %s = %s\n", ss2, ss1, res); // -25 - 10000 = -10025

        ss2 = new apint(-25);
        res = ss1.subtract(ss2);
        System.out.printf("%s - %s = %s\n", ss1, ss2, res); // 10000 - -25 = 10025

        ss1 = new apint(25);
        ss2 = new apint(-99);
        res = ss1.subtract(ss2);
        System.out.printf("%s - %s = %s\n", ss1, ss2, res); // 25 - -99 = 124

        apint ssf = new apint(-1000);
        res = ssf.subtract(ss1);
        System.out.printf("%s - %s = %s\n", ssf, ss1, res); //  -1000 - 25 = -1025

        System.out.println();
        System.out.println("Testing out divide and remainder calculations...");
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); // 20 / 2 = 10010; r : 0
        a = new apint(15);
        b = new apint(6);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 15 / 6 = 2; r : 3

        apint d1 = new apint(51);
        apint d2 = new apint(6789);
        res = d2.divide(d1);
        System.out.printf("%s / %s = %s; r : %s\n", d2, d1, res, res.remainder); // 6789 / 51 = 133; r : 6

        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); // 20 / 2 = 10; r : 0

        a = new apint(17);
        b = new apint(23);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 17 / 23 = 0; r : 17

        a = new apint(17);
        b = new apint(230);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 17 / 230 = 0; r : 17

        a = new apint(21);
        b = new apint(1);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 21 / 1 = 21; r : 0

        a = new apint(20);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 20 / 2 = 10; r : 0


        a = new apint(21);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 21 / 2 = 10; r : 1

        a = new apint(210);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 210 / 2 = 105; r : 0

        a = new apint(2100);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 2100 / 2 = 1050; r : 0

        a = new apint(22);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 22 / 2 = 11; r : 0

        aa = new apint(23);
        bb = new apint(2);
        res = aa.divide(bb);
        System.out.printf("%s / %s = %s; r : %s\n", aa, bb, res, res.remainder); // 23 / 2 = 11; r : 1


        a = new apint(24);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 24 / 2 = 12; r : 0

        a = new apint(25);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 25 / 2 = 12; r : 1

        a = new apint(26);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 26 / 2 = 13; r : 0

        a = new apint(30);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 30 / 2 = 15; r : 0

        a = new apint(31);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 31 / 2 = 15; r : 1

        a = new apint(31);
        b = new apint(3);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 31 / 3 = 10; r : 1

        a = new apint(34);
        b = new apint(3);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res, res.remainder); // 34 / 3 = 11; r : 1

        arg1 = new apint(24);
        arg2 = new apint(21);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); // 24 / 21 = 1; r : 3

        arg1 = new apint(24);
        arg2 = new apint(2);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); // 24 / 2 = 12; r : 0

        arg1 = new apint(240);
        arg2 = new apint(2);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); // 240 / 2 = 120; r : 0

        arg1 = new apint(241);
        arg2 = new apint(2);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); //241 / 2 = 120; r : 1

        arg1 = new apint(2020);
        arg2 = new apint(2);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); // 2020 / 2 = 1010; r : 0

        arg1 = new apint(20020);
        arg2 = new apint(2);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); // 20020 / 2 = 10010; r : 0

        arg1 = new apint(24);
        arg2 = new apint(12);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); // 24 / 12 = 2; r : 0

        arg1 = new apint(-24);
        arg2 = new apint(-12);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); // -24 / -12 = 2; r : 0

        arg1 = new apint(24);
        arg2 = new apint(-12);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result, result.remainder); // 24 / -12 = -2; r : 0

        aprat h = new aprat(3, 7);
        aprat g = new aprat(5, 3);
        aprat res1;


        System.out.println();
        System.out.println("Testing each aprat function and simplification...");
        h = new aprat(10, 27);
        g = new aprat(11, 31);
        res1 = h.add(g);
        System.out.printf("(%s / %s) + (%s / %s) = %s/%s\n", h.numerator, h.denominator, g.numerator, g.denominator, res1.numerator, res1.denominator);
        // (10 / 27) + (11 / 31) = 607/837

        res1 = fr.add(rf);
        System.out.printf("(%s / %s) + (%s / %s) = %s/%s\n", fr.numerator, fr.denominator, rf.numerator, rf.denominator, res1.numerator, res1.denominator);
        // (123 / 12) + (140 / 12) = 263/12

        res1 = fr.multiply(rf);
        System.out.printf("(%s / %s) * (%s / %s) = %s/%s\n", fr.numerator, fr.denominator, rf.numerator, rf.denominator, res1.numerator, res1.denominator);
        // (123 / 12) * (140 / 12) = 1435/12

        res1 = fr.divide(rf);
        System.out.printf("(%s / %s) / (%s / %s) = %s/%s\n", fr.numerator, fr.denominator, rf.numerator, rf.denominator, res1.numerator, res1.denominator);
        // (123 / 12) / (140 / 12) = 123/140

        res1 = fr.subtract(rf);
        System.out.printf("(%s / %s) - (%s / %s) = %s/%s\n", fr.numerator, fr.denominator, rf.numerator, rf.denominator, res1.numerator, res1.denominator);
        // (123 / 12) - (140 / 12) = -17/12

        res1 = h.add(g);
        System.out.printf("(%s / %s) + (%s / %s) = %s/%s\n", h.numerator, h.denominator, g.numerator, g.denominator, res1.numerator, res1.denominator);
        // (10 / 27) + (11 / 31) = 607/837

        res1 = h.subtract(g);
        System.out.printf("(%s / %s) - (%s / %s) = %s/%s\n", h.numerator, h.denominator, g.numerator, g.denominator, res1.numerator, res1.denominator);
        // (10 / 27) - (11 / 31) = 13/837

        res1 = h.multiply(g);
        System.out.printf("(%s / %s) * (%s / %s) = %s/%s\n", h.numerator, h.denominator, g.numerator, g.denominator, res1.numerator, res1.denominator);
        // (10 / 27) * (11 / 31) = 110/837

        res1 = h.divide(g);
        System.out.printf("(%s / %s) / (%s / %s) = %s/%s\n", h.numerator, h.denominator, g.numerator, g.denominator, res1.numerator, res1.denominator);
        // (10 / 27) / (11 / 31) = 310/297

        System.out.println();
        System.out.println("Testing each aprat function but with negative numbers...");
        h = new aprat(-10, 27);
        g = new aprat(11, 31);
        res1 = h.add(g);
        System.out.printf("(%s / %s) + (%s / %s) = %s/%s\n", h.numerator, h.denominator, g.numerator, g.denominator, res1.numerator, res1.denominator);
        // (-10 / 27) + (11 / 31) = 13/837

        res1 = h.subtract(g);
        System.out.printf("(%s / %s) - (%s / %s) = %s/%s\n", h.numerator, h.denominator, g.numerator, g.denominator, res1.numerator, res1.denominator);
        // (-10 / 27) - (11 / 31) = -607/837

        res1 = h.multiply(g);
        System.out.printf("(%s / %s) * (%s / %s) = %s/%s\n", h.numerator, h.denominator, g.numerator, g.denominator, res1.numerator, res1.denominator);
        // (-10 / 27) * (11 / 31) = -110/837

        res1 = h.divide(g);
        System.out.printf("(%s / %s) / (%s / %s) = %s/%s\n", h.numerator, h.denominator, g.numerator, g.denominator, res1.numerator, res1.denominator);
        // (-10 / 27) / (11 / 31) = -310/297

        System.out.println();
        System.out.println("Testing print out for aprat...");
        System.out.println(res1); // -310/297
        System.out.println(h);    // -10/27
        System.out.println(g);    // 11/31
        g.print();                // 11/31
        rf.print();               // 140 / 12
        System.out.println();

        System.out.println("Testing GCD calculation for some numbers...");
        res = apint.GreatestCommonDivisor(a, b);
        System.out.printf("GCD of %s and %s = %s", a, b, res); // gcd of 34, 3 = 1
        System.out.println();

        a = new apint(24);
        b = new apint(18);
        res = apint.GreatestCommonDivisor(a, b);
        System.out.printf("GCD of %s and %s = %s", a, b, res); // gcd of 24, 18 = 6
        System.out.println();

        a = new apint(27);
        res = apint.GreatestCommonDivisor(a, b);
        System.out.printf("GCD of %s and %s = %s", a, b, res); // gcd of 27, 18 = 9
        System.out.println();

        a = new apint(17);
        b = new apint(11);
        res = apint.GreatestCommonDivisor(a, b);
        System.out.printf("GCD of %s and %s = %s", a, b, res); // gcd of 17, 11 = 1
        System.out.println();


        a = new apint(1000024);
        b = new apint(23402380);
        res = apint.GreatestCommonDivisor(a, b);
        System.out.printf("GCD of %s and %s = %s", a, b, res); // gcd of 1000024, 23402380 = 4
        System.out.println();


    }
}
