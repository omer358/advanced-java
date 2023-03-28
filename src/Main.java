import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    static Character[] charArray = {'h','w','e','o','m','l'};
    static Integer[] intArrays = {1,2,3,4,5};
    static Boolean[] boolArray = {true, false,true,true,false};
    public static <T>List<T> arrayToList(T[] array, List<T> list){
        for(T object: array){
            list.add(object);
        }
        return list;
    }
    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> booleanList  = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArrays, new ArrayList<>());
        System.out.println(intList.get(0));

//        System.out.println("Example without generics");
//        List names = new ArrayList();
//        names.add("Kelly");
//        String name = (String) names.get(0);
//        System.out.println("First Name: "+ name);
//
//        System.out.println("Example with Generics");
//        List<String> names2 = new ArrayList();
//        names2.add("Kelly");
//        String name2 = names2.get(0);
//        System.out.println("First Name: "+names2);
    }
}