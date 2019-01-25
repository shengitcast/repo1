package practice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Practice4 {
    public static void main(String[] args) throws Exception {
        String path = Practice4.class.getClassLoader().getResource("practice/student1.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements.get(1).select("student[number='heima_0002']>age"));
        /*for (Element element : elements) {
            System.out.println(element.select("student[number='heima_0001']>age"));
            System.out.println("-----------------");
        }*/
    }
}
