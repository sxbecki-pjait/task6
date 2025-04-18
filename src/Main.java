import task1.Car;
import task2.Car_2;
import task3.*;
import task4.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================");
        task1();
        System.out.println("====================");
        task2();
        System.out.println("====================");
        task3();
        System.out.println("====================");
        task4();

    }
    public static void task1(){
        System.out.println("Task 1: ");
        System.out.println();
        Car c1 = new Car();
        c1.start();
        c1.stop();
    }
    public static void task2(){
        System.out.println("Task 2: ");
        System.out.println();
        Car_2 c1 = new Car_2();
        c1.start();
        c1.stop();
    }
    public static void task3(){
        System.out.println("Task 3: ");
        System.out.println();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        Lion lion = new Lion();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(wolf);
        animals.add(lion);

        for(Animal animal : animals){
            if(animal instanceof Cat){
                System.out.println("This is Cat!");
            }
            if(animal instanceof Dog){
                System.out.println("This is Dog!");
            }
            if(animal instanceof Wolf){
                System.out.println("This is Wolf!");
            }
            if(animal instanceof Lion){
                System.out.println("This is Lion!");
            }
            animal.makeNoise();
            System.out.println();
        }
    }
    public static void task4(){
        System.out.println("Task 4: ");
        System.out.println();

        Cat_2 cat = new Cat_2();
        Dog_2 dog = new Dog_2();
        Wolf_2 wolf = new Wolf_2();
        Lion_2 lion = new Lion_2();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(wolf);
        animals.add(lion);
        for(Animal animal : animals){
            animal.makeNoise();
            animal.roam();
            System.out.println();
        }
    }

}