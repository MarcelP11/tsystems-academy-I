package cars;

public class PersonalCar extends Car{
    private final int numberOfSeats;

    public PersonalCar(int numberOfSeats, String brand){
        super(brand);
        this.numberOfSeats=numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
