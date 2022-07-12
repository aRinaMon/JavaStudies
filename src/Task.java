import java.io.*;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import opennlp.tools.tokenize.SimpleTokenizer;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://en.wikipedia.org/wiki/Palamedes_(mythology)");
        InputStream info = url.openStream(); //Возвращает поток входных данных URL для считывания из ресурса.
        byte[] b = info.readAllBytes(); //Возвращает все содержимое файла в виде массива байт
        String str = new String(b);

        Document doc = Jsoup.parse(str);
        String text = doc.body().text();

        SimpleTokenizer simpleTokenizer = SimpleTokenizer.INSTANCE;
        String[] tokens = simpleTokenizer.tokenize(text);
        String list = Arrays.toString(tokens);
        //String filteredList = list.replace("(", "");


//        for (String token : tokens) {
//            System.out.print(token + ' ');
//        }

//        String [] filtered;
//        String [] pun = new String[]{".", ",", "...", "!", ";", ":", "-", "/", " ,", "(", ")"};

//        for (int i=0; i< pun.length; i++){
//            if(list.contains(pun[i])){
//                list = list.replaceAll(pun[i] +"\\s+", " ");
//            }
//        }

                //int length = list.length();
                //for (int i=0; i<length; i++){
                //    for (String j: )
                // }

        list = list.toLowerCase();
        System.out.println(list);

//        for (String words: tokens){
//            if (list.contains(pun)){

//            }

//        }

            }
        }

        class Link{
        public URL url;

        public void setUrl(URL url){
            this.url = url;

        }

        }



