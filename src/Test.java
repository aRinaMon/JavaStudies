import opennlp.tools.tokenize.SimpleTokenizer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("https://en.wikipedia.org/wiki/Palamedes_(mythology)");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        InputStream info = null; //Возвращает поток входных данных URL для считывания из ресурса.
        try {
            info = url.openStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        byte[] b = new byte[0]; //Возвращает все содержимое файла в виде массива байт
        try {
            b = info.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String str = new String(b);

        Document doc = Jsoup.parse(str);
        String text = doc.body().text();


    }
}


