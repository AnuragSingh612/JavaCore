package Inheritence;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10, 20,30));
        System.out.println(calculator.add(20.34,45.68));
    }
}
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}
