public class Overridding {

    public static void main(String[] args) {
    JavaProgrammer mt = new JavaProgrammer();
    mt.code();
    }

}

class Programmer {
    public void code() {
        System.out.println("Coding in C++");
    }
}

 class JavaProgrammer extends Programmer {
    @Override
    public void code() {
        System.out.println("Coding in Java");
    }
}


