package com.company;

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

        aprat fr = new aprat(123,12);
        aprat rf = new aprat(140,12);




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



    }
}
