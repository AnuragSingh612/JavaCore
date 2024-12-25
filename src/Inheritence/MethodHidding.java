/*
Definition:
Method hiding occurs when a subclass defines a static method with the same name and parameter
list as a static method in its superclass. In this case, the method in the superclass is hidden,
 not overridden, because static methods belong to the class rather than the instance.

Key Characteristics of Method Hiding:
Applies to Static Methods: Only static methods are subject to hiding.
 Instance methods follow the rules of overriding.
Class Binding: Method hiding is determined by the reference type, not the object type.
This is because static methods are associated with the class rather than any specific object.
No Runtime Polymorphism: Unlike overriding, method hiding does not support runtime polymorphism.
 The method to execute is determined at compile time based on the reference type.
Different from Overriding: Instance methods override the parent class method,
but static methods in the subclass hide the parent class method.

*/
package Inheritence;

public class MethodHidding {
    public static void main(String[] args) {
        parent p = new parent();
        parent p1 = new Child();
        Child c = new Child();
        p.display();
        p1.display();
        c.display();

    }
}
class parent{
    static void display() {
        System.out.println("Static method in Parent");
    }
}
class Child extends parent {
    static void display() {
        System.out.println("Static method in Child");
    }

}

