import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Car("Toyota","c"));
        listOfCars.add(new Car("Apel","b"));
        listOfCars.add(new Car("Yaguar","a"));

        listOfCars.stream().sorted(Comparator.comparing(Car::getName).thenComparing(Car::getColor)).collect(Collectors.toList()).forEach(System.out::println);

        /********************************************************************************/
        System.out.println("/********************************************************************************/");
        /********************************************************************************/

        List<Pig> listOfPigs = new ArrayList<>();
        listOfPigs.add(new Pig("Galina",40, "Cupara"));
        listOfPigs.add(new Pig("Ivanna",50, "Andrii"));
        listOfPigs.add(new Pig("Alga",60, "Banan"));

        Collections.sort(listOfPigs, new ComparatorImplByName());

        System.out.println(ComparatorImplByName.class.getName());

        for (Object o : listOfPigs)
        {
            System.out.println(o);
        }

        /********************************************************************************/
        System.out.println("/********************************************************************************/");
        /********************************************************************************/

        System.out.println(ComparatorImplByWeight.class.getName());

        Collections.sort(listOfPigs, new ComparatorImplByWeight());

        for (Object o : listOfPigs)
        {
            System.out.println(o);
        }

    }





}
