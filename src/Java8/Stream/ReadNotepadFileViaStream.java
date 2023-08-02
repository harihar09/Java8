package Java8.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadNotepadFileViaStream {
    public static void main(String[] args) throws IOException {
        // Read notepad file and print the filtered strings
        // we can use Files.lines(Paths.get(file path))
        Stream<String> lines = Files.lines(Paths.get("C:\\Users\\rohin\\Desktop\\test.txt"));

        lines.filter(s->s.startsWith("t"))
                .forEach(System.out::println);
    }
}
