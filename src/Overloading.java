public class Overloading {

    public static void main(String[] args) {

        method();

    }

    static void method()
    {
        System.out.println("Method without parameters");
    }

    static void method(int x)
    {
        System.out.println("Method with parameters");
    }

}
