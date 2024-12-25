package Inheritence;

class ConstructorOverloading {
    String name;
    int age;
    void Person(){
        this.name = "Unknown";
        this.age = 0;
    }
    void Person(String name) {
        this.name = name;
        this.age = 0;
    }

    void Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
class Overloading{
    public static void main(String[] args) {
        ConstructorOverloading c = new ConstructorOverloading();
        c.Person();
        c.Person("Anurag");
        c.Person("Anurag", 10);
    }
}


