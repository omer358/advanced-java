import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Genrics {

    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(new Integer(1));
        list.add(new String("omer"));
        Integer i = (Integer) list.iterator().next();
        System.out.println(i);
    }

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }
}
