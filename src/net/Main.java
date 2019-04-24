package net;


public class Main {


    public static void main(String[] args) {

        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getob();

        System.out.println(" Знaчeниe : " + v);

        System.out.println();

        Gen<String> strOb = new Gen<String>("Тест обобщений ");

        strOb.showType();

        String str = strOb.getob();

        System.out.println(" Знaчeниe : " + str);


        NonGen iob;

        iob = new NonGen(88);

        iob.showТype();

        v = (Integer) iob.getObj();

        System.out.println(" Знaчeниe : " + v);

        System.out.println();

        NonGen nonGen = new NonGen("Tecт без обобщений");

        nonGen.showТype();

        str = (String) nonGen.getObj();

        System.out.println("Знaчeниe : " + str);


        TwoGen<Integer, String> tgObj =

                new TwoGen<Integer, String>(88, "Обобщения");

        tgObj.showТypes();

        v = tgObj.getOb();

        System.out.println(" Знaчeниe : " + v);

        str = tgObj.getOb2();

        System.out.println(" Знaчeниe : " + str);


    }


}