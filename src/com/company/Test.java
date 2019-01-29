package com.company;


public class Test {

    public static void main(String[] args) {

        aprat ggg = new aprat(123.3);
        System.out.println(ggg);

        apint a = new apint('+',"10000");
        apint b = new apint('+',"200");

        apint aa = new apint(-10110);
        apint bb = new apint(-100);

        apint c = new apint('+',"123456789");
        apint d = new apint('+', "987654321");
        apint e = new apint(-100000000);
        apint f = new apint(1234.5678);

        apint ab = new apint('+',"87");
        apint ba = new apint('+',"93");

        apint ca = new apint('-',"90");
        apint ac = new apint('+', "30");

        apint cac = new apint('+',"90");
        apint aca = new apint('-', "30");

        apint cc = new apint('+',"91");
        apint aba = new apint('-', "39");

        apint cca = new apint('+',"20");
        apint bba = new apint('-', "19");

        apint cd = new apint('+',"20");
        apint bbc = new apint('-', "21");

        apint acd = new apint('-',"123");
        apint basc = new apint('+', "456");

        apint m1 = new apint('-',"111");
        apint m2 = new apint('-',"222");

        apint zro = new apint(0);

        aprat fr = new aprat(123,12);
        aprat rf = new aprat(140,12);

        System.out.println("Testing out print out apint...");
        b.print();
        c.print();
        d.print();
        e.print();
        f.print();


        System.out.println();
        System.out.println("Testing out comparison function for apints...");
        System.out.printf("%s compared to %s = %s",a.num,b.num,a.compareTo(b));
        System.out.println();
        System.out.printf("%s compared to %s = %s",b.num,a.num,b.compareTo(a));
        System.out.println();
        System.out.printf("%s compared to %s = %s",cca.num,cd.num,cca.compareTo(cd));
        System.out.println();
        System.out.printf("%s compared to %s = %s",cd.num,zro.num,cd.compareTo(zro));
        System.out.println();
        System.out.printf("-%s compared to %s = %s",aba.num,zro.num,aba.compareTo(zro));
        System.out.println();
        System.out.printf("%s compared to %s = %s",zro.num,zro.num,zro.compareTo(zro));
        System.out.println();

        apint arg1 = new apint(20020);
        apint arg2 = new apint(2);
        apint result = arg1.divide(arg2);
        arg1 = new apint(20);
        arg2 = new apint(2);

        System.out.println();
        System.out.println("Testing various functions for various numbers...");
        apint res = a.add(b);
        System.out.printf("%s + %s = %s\n", a, b, res);

        a = new apint('+', "121932631112635269");
        res = a.divide(c);
        System.out.printf("%s / %s = %s\n", a, c, res);

        res = aa.add(bb);
        System.out.printf("%s + %s = %s\n", aa, bb, res);


         res = c.add(d);
        System.out.printf("%s + %s = %s\n", c, d, res);


        res = ab.add(ba);
        System.out.printf("%s + %s = %s\n", ab, ba, res);

         res = ca.subtract(ac);
        System.out.printf("%s - %s = %s\n", ca, ac, res);

         res = cac.subtract(aca);
        System.out.printf("%s - %s = %s\n", cac, aca, res);

         res = cac.add(aca);
        System.out.printf("%s + %s = %s\n", cac, aca, res);

         res = cc.add(aba);
        System.out.printf("%s + %s = %s\n", cc, aba, res);

         res = cca.add(bba);
        System.out.printf("%s + %s = %s\n", cca, bba, res.num);

         res = cd.add(bbc);
        System.out.printf("%s + %s = %s\n", cd, bbc, res);

        res = acd.multiply(basc);
        System.out.printf("%s * %s = %s\n", acd, basc, res);

        res = a.multiply(b);
        System.out.printf("%s * %s = %s\n", a, b, res);

        res = m1.multiply(m2);
        System.out.printf("%s * %s = %s\n", m1, m2, res);

        res = c.multiply(d);
        System.out.printf("%s * %s = %s\n", c, d, res);

        apint f1 = new apint(15);
        apint f2 = new apint(51);
        res = f1.subtract(f2);
        System.out.printf("%s - %s = %s\n", f1, f2, res);

        apint t1 = new apint(117);
        res = t1.subtract(f2);
        System.out.printf("%s - %s = %s\n", t1, f2, res);

        apint d3 = new apint(100);
        apint d4 = new apint(5);
        res = d3.divide(d4);
        System.out.printf("%s / %s = %s\n", d3, d4, res);

        apint d5 = new apint(1000);
        apint d6 = new apint(25);
        res = d5.divide(d6);
        System.out.printf("%s / %s = %s\n", d5, d6, res);


        apint ss1 = new apint(100);
        apint ss2 = new apint(25);
        res = ss1.subtract(ss2);
        System.out.printf("%s - %s = %s\n", ss1, ss2, res);

        apint ss3 = new apint(100);
        apint ss4 = new apint(20);
        res = ss3.subtract(ss4);
        System.out.printf("%s - %s = %s\n", ss3, ss4, res);

        apint sf1 = new apint(1000);
        res = sf1.subtract(ss4);
        System.out.printf("%s - %s = %s\n", sf1, ss4, res);

        ss1 = new apint(10000);
        ss2 = new apint(21);
        res = ss2.subtract(ss1);
        System.out.printf("%s - %s = %s\n", ss2, ss1, res);

        res = ss1.divide(ss2);
        System.out.printf("%s / %s = %s\n", ss1, ss2, res);

        ss2 = new apint(-25);
        res = ss2.subtract(ss1);
        System.out.printf("%s - %s = %s\n", ss2, ss1, res);

        ss2 = new apint(-25);
        res = ss1.subtract(ss2);
        System.out.printf("%s - %s = %s\n", ss1, ss2, res);

        ss1 = new apint(25);
        ss2 = new apint(-99);
        res = ss1.subtract(ss2);
        System.out.printf("%s - %s = %s\n", ss1, ss2, res);

        apint ssf = new apint(-1000);
        res = ssf.subtract(ss1);
        System.out.printf("%s - %s = %s\n", ssf, ss1, res);

        System.out.println();
        System.out.println("Testing out divide and remainder calculations...");
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result,result.remainder);
        System.out.println();
        a = new apint(15);
        b = new apint(6);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        apint d1 = new apint(51);
        apint d2 = new apint(6789);
        res = d2.divide(d1);
        System.out.printf("%s / %s = %s; r : %s\n", d2, d1, res,res.remainder);

        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result,result.remainder);

        a = new apint(17);
        b = new apint(23);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(17);
        b = new apint(230);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(21);
        b = new apint(1);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(20);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(21);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(210);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(2100);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(22);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        aa = new apint(23);
        bb = new apint(2);
        res = aa.divide(bb);
        System.out.printf("%s / %s = %s; r : %s\n", aa, bb, res,res.remainder);

        a = new apint(24);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(25);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(26);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(30);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(31);
        b = new apint(2);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(31);
        b = new apint(3);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        a = new apint(34);
        b = new apint(3);
        res = a.divide(b);
        System.out.printf("%s / %s = %s; r : %s\n", a, b, res,res.remainder);

        arg1 = new apint(24);
        arg2 = new apint(21);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result,result.remainder);

        arg1 = new apint(24);
        arg2 = new apint(2);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result,result.remainder);

        arg1 = new apint(240);
        arg2 = new apint(2);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result,result.remainder);

        arg1 = new apint(241);
        arg2 = new apint(2);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result,result.remainder);

        arg1 = new apint(2020);
        arg2 = new apint(2);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result,result.remainder);

        arg1 = new apint(20020);
        arg2 = new apint(2);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result,result.remainder);

        arg1 = new apint(24);
        arg2 = new apint(12);
        result = arg1.divide(arg2);
        System.out.printf("%s / %s = %s; r : %s\n", arg1, arg2, result,result.remainder);

        aprat h = new aprat(3,7);
        aprat g = new aprat(5,3);
        aprat res1;


        System.out.println();
        System.out.println("Testing each aprat function and simplification...");
        h = new aprat(10, 27);
        g = new aprat(11,31);
        res1 = h.add(g);
        System.out.printf("(%s / %s) + (%s / %s) = %s/%s\n", h.numerator, h.denominator,g.numerator,g.denominator, res1.numerator,res1.denominator);

        res1 = fr.add(rf);
        System.out.printf("(%s / %s) + (%s / %s) = %s/%s\n", fr.numerator, fr.denominator,rf.numerator,rf.denominator, res1.numerator,res1.denominator);

        res1 = fr.multiply(rf);
        System.out.printf("(%s / %s) * (%s / %s) = %s/%s\n", fr.numerator, fr.denominator,rf.numerator,rf.denominator, res1.numerator,res1.denominator);

        res1 = fr.divide(rf);
        System.out.printf("(%s / %s) / (%s / %s) = %s/%s\n", fr.numerator, fr.denominator,rf.numerator,rf.denominator, res1.numerator,res1.denominator);

        res1 = fr.subtract(rf);
        System.out.printf("(%s / %s) - (%s / %s) = %s/%s\n", fr.numerator, fr.denominator,rf.numerator,rf.denominator, res1.numerator,res1.denominator);

        res1 = h.add(g);
        System.out.printf("(%s / %s) + (%s / %s) = %s/%s\n", h.numerator, h.denominator,g.numerator,g.denominator, res1.numerator,res1.denominator);

        res1 = h.subtract(g);
        System.out.printf("(%s / %s) - (%s / %s) = %s/%s\n", h.numerator, h.denominator,g.numerator,g.denominator, res1.numerator,res1.denominator);

        res1 = h.multiply(g);
        System.out.printf("(%s / %s) * (%s / %s) = %s/%s\n", h.numerator, h.denominator,g.numerator,g.denominator, res1.numerator,res1.denominator);

        res1 = h.divide(g);
        System.out.printf("(%s / %s) / (%s / %s) = %s/%s\n", h.numerator, h.denominator,g.numerator,g.denominator, res1.numerator,res1.denominator);

        System.out.println();
        System.out.println("Testing each aprat function but with negative numbers...");
        h = new aprat(-10, 27);
        g = new aprat(11,31);
        res1 = h.add(g);
        System.out.printf("(%s / %s) + (%s / %s) = %s/%s\n", h.numerator, h.denominator,g.numerator,g.denominator, res1.numerator,res1.denominator);

        res1 = h.subtract(g);
        System.out.printf("(%s / %s) - (%s / %s) = %s/%s\n", h.numerator, h.denominator,g.numerator,g.denominator, res1.numerator,res1.denominator);

        res1 = h.multiply(g);
        System.out.printf("(%s / %s) * (%s / %s) = %s/%s\n", h.numerator, h.denominator,g.numerator,g.denominator, res1.numerator,res1.denominator);

        res1 = h.divide(g);
        System.out.printf("(%s / %s) / (%s / %s) = %s/%s\n", h.numerator, h.denominator,g.numerator,g.denominator, res1.numerator,res1.denominator);

        System.out.println("Testing print out for aprat...");
        System.out.println(res1);
        System.out.println(h);
        System.out.println(g);
        System.out.println();

        System.out.println("Testing GCD calculation for some numbers...");
        res = apint.GreatestCommonDivisor(a,b);
        System.out.printf("GCD of %s and %s = %s",a,b,res);
        System.out.println();

        a = new apint(24);
        b = new apint(18);
        res = apint.GreatestCommonDivisor(a,b);
        System.out.printf("GCD of %s and %s = %s",a,b,res);
        System.out.println();

        a = new apint(27);
        res = apint.GreatestCommonDivisor(a,b);
        System.out.printf("GCD of %s and %s = %s",a,b,res);
        System.out.println();

        a = new apint(17);
        b = new apint(11);
        res = apint.GreatestCommonDivisor(a,b);
        System.out.printf("GCD of %s and %s = %s",a,b,res);
        System.out.println();


        a = new apint(1000024);
        b = new apint(23402380);
        res = apint.GreatestCommonDivisor(a,b);
        System.out.printf("GCD of %s and %s = %s",a,b,res);
        System.out.println();



    }
}
