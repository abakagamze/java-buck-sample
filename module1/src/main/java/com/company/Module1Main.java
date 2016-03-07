package com.company;

public class Module1Main {

    public static void main(String[] args) {
        Module2Main module2Main = new Module2Main();
        System.out.println("Hello I'm " + new Module1Main().toString()  + " I depend on " + module2Main.toString());
    }

    @Override
    public String toString() {
        return "Module1Main";
    }
}
