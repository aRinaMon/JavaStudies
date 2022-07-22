package Task_1;

import java.io.IOException;
import java.net.URL;


public class Test {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://websailors.pro/en");
        Reader reader = new Reader();
        String text = reader.read(url);

        TextProcessing processing = new TextProcessing();
        String [] cleanText = processing.process(text);

        Counter counter = new Counter();
        System.out.println(counter.count(cleanText));


        }
    }
