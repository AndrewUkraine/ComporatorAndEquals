

public class Car extends Pig{

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

        if (((Pig)(obj)).name == null)
        {
            return false;
        }

        return this.name.equals(((Pig)(obj)).name);
    }


    public static void main(String[] args) {
        Car car = new Car("Opel", "Black");


        Pig pig = new Pig("Opel", 21, "Black");



        System.out.println(car.equals(pig));

    }



}
