import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;

public class MainTest extends Thread implements Callable<String>  {

    @Override
    public void run() {
            System.out.println(currentThread().getName());
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        FinalClassImmutebl finalClassImmutebl = new FinalClassImmutebl(5, "YES");

        System.out.println(finalClassImmutebl.getA());
        System.out.println(finalClassImmutebl.getB());

        MainTest mainTest ;

        //launch thread
        for (int i =0; i<10; i++)
        {
            mainTest = new MainTest();
            mainTest.start();
        }

        //singleton
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());

        //example not singleton
        Pig pig = new Pig("1", 2, "n");
        System.out.println(pig.hashCode());
        Pig pig2 = new Pig("1", 2, "n");
        System.out.println(pig2.hashCode());


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


        //count via stream if mas of mas
        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        lists.add(list);

        int a = lists.stream().flatMap(List :: stream).mapToInt(i -> i).sum();

        System.out.println(a);


        //add Thread future

        Callable<String> callable = new MainTest();
        FutureTask<String> future = new FutureTask<>(callable);
        new Thread(future).start();



        List<List<List>> listsList = new ArrayList<>();



        List <String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");




    }



    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }
}
