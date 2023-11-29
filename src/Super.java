public class Super {

    Super()
    {
        System.out.println("Super Class Constructor");
    }

    void fly()
    {
        System.out.println("Super Class Fly Method");
    }

}

class Man extends Super
{

    Man()
    {
        super();
        System.out.println("Man Class Constructor");
    }

    @Override
    void fly() {
        super.fly(); //This is Called Super class Fly methode
        System.out.println("Subclass Override fly method");
    }

    public static void main(String[] args) {
        Man superman = new Man();
        superman.fly();
    }

}

