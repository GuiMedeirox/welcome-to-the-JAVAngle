import java.util.ArrayList;
import java.util.Comparator;
import java.util.List; 

class meetingStreams{
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>(List.of("John", "Timmy", "Tony", "Jess", "Saxon", "Soprano"));
        List<Integer> list2 = new ArrayList<>(List.of(new Integer(1), new Integer(2), 
                                                        new Integer(3), new Integer(4), 
                                                        new Integer(5), new Integer(6), 
                                                        new Integer(7), new Integer(8), 
                                                        new Integer(9), new Integer(10) ));

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        //[Jess, John, Saxon, Soprano, Timmy, Tony]

        list.stream()
        .limit(4)
        .filter(s -> s.indexOf('J') == 0 || s.indexOf('T') == 0)
        .map(String::toLowerCase)
        .sorted()
        .forEachOrdered(System.out::println);


        System.out.println("-------------------------------");
        list2.stream().filter(s -> s%2==0).forEach(System.out::println);
        
    }
}