import task1.Car;
import task2.Car_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================");
        task1();
        System.out.println("====================");
        task2();
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
        System.out.println("Task 2: ");
        System.out.println();
    }

}