import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static List<Person> persons = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("TSV Log");
        parseLogByType(FileType.TSV);

    }
    private static void parseLogByType(FileType fileType) {
        LogParser parser = LogParserFactory.getParser(fileType);
        String path = "logs\\logs." + fileType.name().toLowerCase();

        LogStatistic stat = new LogStatistic(parser, path);
        System.out.println("Normal print");
        stat.print();
        System.out.println("Sorted print");
        stat.sortedPrint();
    }
    private static void filterByLetter(char letter)
    {
        persons.stream().filter(s->s.getName().charAt(0) == letter).map(Person::getName).forEach(System.out::println);
    }
    private static void printHausStark(){
        persons.stream().filter(s -> s.getHaus() == Haus.Stark).map(Person::getDate).sorted().forEach(System.out::println);
    }



}
