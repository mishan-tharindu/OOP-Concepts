public class Polymorphism {

}

class A
{
    void print()
    {
        System.out.println("Print A");
    }
}

class B extends A
{
    @Override
    void print() {
        System.out.println("Print B");
    }

    public static void main(String[] args) {

        B b = new B();
        b.print();

        A a = new A();
        a.print();

        A a1 = new B();
        a1.print();

        // Polymorphism is Super Class ekaka method ekaka sub class aken override krla Super class reference ekakin sub class ake override methode eka call karna eka ,


    }

}

