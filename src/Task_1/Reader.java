package Task_1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Reader {
    public String read(URL url) throws IOException {
        String string;
        try(InputStream info = url.openStream()) {

            byte[] b = info.readAllBytes();
            string = new String(b);
        }

        Document doc = Jsoup.parse(string);

        return doc.body().text();
    }
}
