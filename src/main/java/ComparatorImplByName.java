import java.util.Comparator;

public class ComparatorImplByName implements Comparator<Pig> {


    @Override
    public int compare(Pig o1, Pig o2) {
        return o1.owner.compareTo(o2.owner);
    }
}
