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

        aprat fr = new aprat(123,12);
        aprat rf = new aprat(140,12);
        aprat frr = fr.add(rf);
        frr.print(frr);
        System.out.println();


        b.print(b);
        c.print(c);
        d.print(d);
        e.print(e);
        f.print(f);


        System.out.println();

        apint g = a.add(b);
        g.print(g);

        System.out.println();

        apint gg = aa.add(bb);
        gg.print(gg);

        System.out.println();

        apint af = c.add(d);
        af.print(af);

        System.out.println();


        apint abc = ab.add(ba);
        abc.print(abc);
        System.out.println();

        apint acc = ca.subtract(ac);
        acc.print(acc);
        System.out.println();

        apint acca = cac.subtract(aca);
        acca.print(acca);
        System.out.println();

        apint bacc = cac.add(aca);
        bacc.print(bacc);
        System.out.println();

        apint bac = cc.add(aba);
        bacc.print(bac);
        System.out.println();

        apint bcc = cca.add(bba);
        bacc.print(bcc);
        System.out.println();

        apint bccs = cd.add(bbc);
        bacc.print(bccs);
        System.out.println();

        apint bsccs = acd.multiply(basc);
        bacc.print(bsccs);
        System.out.println();


    }
}
