abstract class A {
    abstract void show();
}

class B extends A {
    void show() {
        System.out.println("Hello");
    }
}

class abstraction {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
