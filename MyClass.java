
//Method with parameters & access modifiers

public class MyClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.sayHello("Adiba");
    }

    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}