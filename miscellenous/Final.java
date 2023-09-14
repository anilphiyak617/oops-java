// makiing the class as Final i.e not extendable
// final class Vehicle{
class Vehicle{

    int id;
    String name;
    int numWheels;

    Vehicle() {    }
    Vehicle(int id, String name) {
        this.id = id;
        this.name = name;
        final int numWheels = 32;
        this.numWheels = numWheels;
    }
    // cannot be overwritten when declared as final
    // final public String getName() {
    public String getName() {
        return this.name;
    }
    

};


class Car extends Vehicle {

    String name;

    Car() {
        this.name = "Default";
    }

    Car(int id, String name) {
        super(id, name);
        super.name = "Default Parent";
        this.name = "Default Child";
    }

    @Override
    public String getName() {
        return "#" + super.name;
    }
}


public class Final {
    public static void main(String[] args) {
        Car audi = new Car(2323,"Audi-32");
        System.out.println(audi.getName());
    }
}