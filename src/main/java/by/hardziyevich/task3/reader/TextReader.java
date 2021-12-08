package by.hardziyevich.task3.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TextReader {

    private final Path path;
    private static final String EMPTY_STRING = "";
    private static final Logger log = LoggerFactory.getLogger(TextReader.class);

    public TextReader(Path path) {
        this.path = path;
    }

    public String readerFile() {
        StringBuilder sb = new StringBuilder();
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(sb::append);
        } catch (IOException e) {
            log.warn("Something happened ", e);
            return EMPTY_STRING;
        }
        return sb.toString();
    }
}
