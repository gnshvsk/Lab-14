package net;


public class NonGen {

    Object obj; // объект оЬ теперь имеет тип Object


    public NonGen(Object obj) {

        this.obj = obj;

    }


    public Object getObj() {

        return obj;

    }


    void showТype() {

        System.out.println("Oбъeкт obj относится к типу " + obj.getClass().getName());

    }

}