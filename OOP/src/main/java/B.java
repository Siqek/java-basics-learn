public class B extends A {
//    @Override
//    void finalMethodInA() {
//        System.out.println("Disallowed to override final methods");
//    }

    @Override
    void someMethod() {
        System.out.println("--- Call someMethod from B. ---");
        super.someMethod();
        System.out.println("--- End of someMethod in B. ---");
    }
}
