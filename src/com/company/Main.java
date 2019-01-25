package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {


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
        System.out.println();


        b.print();
        c.print();
        d.print();
        e.print();
        f.print();

        System.out.println();

        apint res = a.add(b);
        System.out.printf("%s + %s = %s\n", a, b, res);
        System.out.println();

        res = aa.add(bb);
        System.out.printf("%s + %s = %s\n", aa, bb, res);

        System.out.println();

         res = c.add(d);
        System.out.printf("%s + %s = %s\n", c, d, res);
        System.out.println();


        res = ab.add(ba);
        System.out.printf("%s + %s = %s\n", ab, ba, res);
        System.out.println();

         res = ca.subtract(ac);
        System.out.printf("%s - %s = %s\n", ca, ac, res);
        System.out.println();

         res = cac.subtract(aca);
        System.out.printf("%s - %s = %s\n", cac, aca, res);
        System.out.println();

         res = cac.add(aca);
        System.out.printf("%s + %s = %s\n", cac, aca, res);
        System.out.println();

         res = cc.add(aba);
        System.out.printf("%s + %s = %s\n", cc, aba, res);
        System.out.println();

         res = cca.add(bba);
        System.out.printf("%s + %s = %s\n", cca, bba, res.num);
        System.out.println();

         res = cd.add(bbc);
        System.out.printf("%s + %s = %s\n", cd, bbc, res);
        System.out.println();


        aprat res1;
        res1 = fr.add(rf);
        System.out.printf("(%s / %s) + (%s / %s) = %s/%s\n", fr.numerator, fr.denominator,rf.numerator,rf.denominator, res1.numerator,res1.denominator);
        res1 = fr.multiply(rf);
        System.out.printf("(%s / %s) * (%s / %s) = %s/%s\n", fr.numerator, fr.denominator,rf.numerator,rf.denominator, res1.numerator,res1.denominator);
        res1 = fr.divide(rf);
        System.out.printf("(%s / %s) / (%s / %s) = %s/%s\n", fr.numerator, fr.denominator,rf.numerator,rf.denominator, res1.numerator,res1.denominator);
        res1 = fr.subtract(rf);
        System.out.printf("(%s / %s) - (%s / %s) = %s/%s\n", fr.numerator, fr.denominator,rf.numerator,rf.denominator, res1.numerator,res1.denominator);

        System.out.println();

        res = acd.multiply(basc);
        System.out.printf("%s * %s = %s\n", acd, basc, res);
        System.out.println();

        res = a.multiply(b);
        System.out.printf("%s * %s = %s\n", a, b, res);
        System.out.println();

        res = m1.multiply(m2);
        System.out.printf("%s * %s = %s\n", m1, m2, res);
        System.out.println();

        res = c.multiply(d);
        System.out.printf("%s * %s = %s\n", c, d, res);
        System.out.println();

        apint f1 = new apint(15);
        apint f2 = new apint(51);
        res = f1.subtract(f2);
        System.out.printf("%s - %s = %s\n", f1, f2, res);
        System.out.println();

        apint t1 = new apint(117);
        res = t1.subtract(f2);
        System.out.printf("%s - %s = %s\n", t1, f2, res);
        System.out.println();


        apint d1 = new apint(51);
        apint d2 = new apint(6789);
        res = d2.divide(d1);
        System.out.printf("%s / %s = %s\n", d2, d1, res);
        System.out.println();

        apint d3 = new apint(100);
        apint d4 = new apint(5);
        res = d3.divide(d4);
        System.out.printf("%s / %s = %s\n", d3, d4, res);
        System.out.println();

        apint d5 = new apint(1000);
        apint d6 = new apint(25);
        res = d5.divide(d6);
        System.out.printf("%s / %s = %s\n", d5, d6, res);
        System.out.println();


        apint ss1 = new apint(100);
        apint ss2 = new apint(25);
        res = ss1.subtract(ss2);
        System.out.printf("%s - %s = %s\n", ss1, ss2, res);
        System.out.println();

        apint ss3 = new apint(100);
        apint ss4 = new apint(20);
        res = ss3.subtract(ss4);
        System.out.printf("%s - %s = %s\n", ss3, ss4, res);
        System.out.println();


        apint sf1 = new apint(1000);
        res = sf1.subtract(ss4);
        System.out.printf("%s - %s = %s\n", sf1, ss4, res);
        System.out.println();

        ss1 = new apint(10000);
        ss2 = new apint(21);
        res = ss2.subtract(ss1);
        System.out.printf("%s - %s = %s\n", ss2, ss1, res);
        System.out.println();

        res = ss1.divide(ss2);
        System.out.printf("%s / %s = %s\n", ss1, ss2, res);
        System.out.println();

        ss2 = new apint(-25);
        res = ss2.subtract(ss1);
        System.out.printf("%s - %s = %s\n", ss2, ss1, res);
        System.out.println();

        ss2 = new apint(-25);
        res = ss1.subtract(ss2);
        System.out.printf("%s - %s = %s\n", ss1, ss2, res);
        System.out.println();

        ss1 = new apint(25);
        ss2 = new apint(-99);
        res = ss1.subtract(ss2);
        System.out.printf("%s - %s = %s\n", ss1, ss2, res);
        System.out.println();

        apint ssf = new apint(-1000);
        res = ssf.subtract(ss1);
        System.out.printf("%s - %s = %s\n", ssf, ss1, res);
        System.out.println();


    }
}
