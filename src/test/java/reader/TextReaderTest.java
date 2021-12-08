package reader;

import by.hardziyevich.task3.reader.TextReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;
import java.net.URL;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TextReaderTest {
    private File file;

    @BeforeAll
    void init(){
        URL is = getClass().getClassLoader().getResource("text.txt");
        file = new File(is.getFile());
    }

    @Test
    void testReader(){
        TextReader test = new TextReader(file.toPath());
        System.out.println(test.readerFile());
    }
}
