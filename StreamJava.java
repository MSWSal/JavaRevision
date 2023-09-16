import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJava {
    public static void main(String[] args) {
        List<Integer> numarray = Arrays.asList(1,2,3,4);

        List<Integer> even = numarray.stream()
                .filter(x -> x % 2==0)
                .collect(Collectors.toList());
    }
}
