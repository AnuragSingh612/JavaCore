package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface add{
    int add(int a,int b);
}
public class lambda {
    public static void main(String[] args) {
        add add = (a,b)->a+b;
        System.out.println(add.add(1,2)); //Adding two numbers using functional interface

        List<int[]> list = Arrays.asList(new int[]{1,2},new int[]{3,4});
        list.stream().map(i->i[0]+i[1]).forEach(sum->System.out.println(+sum));
        List<Pair> list2=Arrays.asList(new Pair(1,2),new Pair(3,4),new Pair(5,6));
        list2.stream().map(i->i.a+i.b).forEach(sum->System.out.println("Pair Sum --> "+sum));
        List<Product> list3=Arrays.asList(new Product(1,"fruti",10),new Product(2,"Sprite",20));
        list3.stream().mapToInt(product-> product.price).forEach(price->System.out.println(price));
    }
}
class Pair{
    int a;
    int b;
    public Pair(int a,int b){
        this.a = a;
        this.b = b;
    }
}
class Product {
    int id;
    String name;
    int price;
    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
