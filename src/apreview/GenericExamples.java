package apreview;
import java.util.Arrays;
import java.util.List;

class Operations {

    private static <T> void readAll(List<T> collection) {
        // application of stream API
        collection.stream().map(e -> e.toString()).forEach(System.out::println);
    }

    private static <T> T[] reverse(T[] arr) {
        T[] temp = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            temp[arr.length - 1 - i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        List<Customer> work = Arrays.asList(new Customer("John", "Chicago", "IL"),
                new Customer("Stacy", "Brookfield", "WI"), new Customer("Abdul", "Richmond", "VA"));
        Double[] nums = { 2.0, 4.5, -3.2, 0.0, -0.6, 8.4 };
        
        readAll(work);
        System.out.println(reverse(nums));
    }
}