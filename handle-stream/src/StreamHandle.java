import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamHandle {


    public static void main(String[] args) {
        //1- Stream()
        List<String> fruits = Arrays.asList( new String[]{"Pomme","Bananas","Frise","ananas","amlou"});
        Stream<String> fruitsStreams = fruits.stream();
        //2- stream.of(T ..)
        Stream<String> fruitsSteamOf = Stream.of("Bananas","Frise");
        //3- Arrays.stram
        Stream<String> fruitsSteamArrays = Arrays.stream( new String[]{"Pomme","Bananas","Frise"});
        //4 Stream Builder
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> fruitsBuilder = builder.add("Citron").build();
       //Intermediate operations

        List<String> filtredlist =fruitsStreams.filter((elm)->elm.startsWith("a")).collect(Collectors.toList());
        filtredlist.forEach(e-> System.out.println(e));
        List<String> mapedlist = fruitsSteamArrays.map(String::toLowerCase).collect(Collectors.toList());
        mapedlist.forEach(e-> System.out.println(e));

        //Terminal operations
        // collect()
        //count
        //foreach
    }
}
