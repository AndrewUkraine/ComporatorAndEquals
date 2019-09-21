import java.util.Comparator;

public class ComparatorImplByWeight implements Comparator<Pig> {


    @Override
    public int compare(Pig o1, Pig o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}
