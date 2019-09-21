import java.util.Comparator;

public class Car {

    String name;

    String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        final  Car otherCar = (Car) obj;

        if (this.name == null || otherCar.name == null)
        {
            return false;
        }

        return this.name.equals(otherCar.name) && this.color.equals(otherCar.color);
    }




    public static void main(String[] args) {
        Car car = new Car("Opel", "Black");
        Car car1 = new Car("Opel", "Black");
        Car car2 = new Car("Opel", "Red");

        System.out.println(car.equals(car1));
        System.out.println(car.equals(car2));
    }



}
