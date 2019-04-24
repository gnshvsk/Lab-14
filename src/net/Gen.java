package net;


public class Gen<T> {

    T ob; // объявить объект типа Т


    Gen(T o) {

        this.ob = o;

    }


    T getob() {

        return ob;

    }


    void showType() {

        System.out.println("Tипoм Т является " + ob.getClass().getName());

    }

}