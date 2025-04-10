import java.util.HashSet;

public class MainSet {
    public static void main(String[] args) throws Exception {

        var list1 = new HashSet<Integer>();

        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(2);

        list1.remove(2);

        System.out.println("SIZE: "+ list1.size());

            list1.forEach(value->{
                System.out.println(value);
       });
}
}