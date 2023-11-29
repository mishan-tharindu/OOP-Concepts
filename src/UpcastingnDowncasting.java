public class UpcastingnDowncasting {

    public static void main(String[] args) {

//        upCasting
        SuperA a = new SubB();

//        DownCasting
        SubB b = (SubB) a;


    }

}

class SuperA
{
    SuperA()
    {
        System.out.println("SuperA Class Constructor");
    }
}

class SubB extends SuperA
{

    SubB()
    {
        super();
        System.out.println("SubB Class Constructor");
    }

}
