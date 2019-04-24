package net;


public class TwoGen<T, V> {

    T ob;

    V ob2;


    TwoGen(T o1, V o2) {

        this.ob = o1;

        this.ob2 = o2;

    }


    void showТypes() {

        System.out.println("Tип Т: " + ob.getClass().getName());

        System.out.println("Tип V: " + ob2.getClass().getName());

    }


    public T getOb() {

        return ob;

    }


    public V getOb2() {

        return ob2;

    }

}