public class Main {
    static void main(String[] args) {
        A a = new A();
        B b = new B();
        A bAsA = new B();

        System.out.println("--- class A as class A ---");
        System.out.print("finalMethodInA(): ");
        a.finalMethodInA();

        System.out.print("someMethod(): ");
        a.someMethod();

        System.out.println("--- class B as class B ---");
        System.out.print("finalMethodInA(): ");
        b.finalMethodInA();

        System.out.print("someMethod(): ");
        b.someMethod();

        System.out.println("--- class B as class A ---");
        System.out.print("finalMethodInA(): ");
        bAsA.finalMethodInA();

        System.out.print("someMethod(): ");
        bAsA.someMethod();


    }
}
