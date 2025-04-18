package task2;

public class Car_2 extends Vehicle_2 {
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start(){
        System.out.println("Started by override method");
    }

    @Override
    public void stop(){
        System.out.println("Stopped by override method");
    }
}
