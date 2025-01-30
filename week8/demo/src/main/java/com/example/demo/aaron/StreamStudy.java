package aaron;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamStudy {

    List<Integer> list = Arrays.asList(1, 2, 3);
    Stream<Integer> stream = list.stream();
    Stream<Integer> filtered_stream = stream.filter((each) -> each > 2);
    Stream<Integer> mapped_stream = filtered_stream.map((filtered) -> filtered * 100);
//        mapped_stream.forEach(System.out::println);
//
//        list.stream()
//            .filter((each) -> each > 2)
//        .map((filtered) -> filtered * 100)
//        .forEach((filtered) -> System.out.println(filtered));

}
