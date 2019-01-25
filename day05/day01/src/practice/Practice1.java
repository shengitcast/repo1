package practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) throws Exception {
        //通过类加载器获取path路径
        String path = Practice1.class.getClassLoader().getResource("practice/student1.xml").getPath();
        //载入jar包,通过path路径,获取一个document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //通过getElementsByTag()方法获取元素对象集合
        Elements elements = document.getElementsByTag("student");
        /*System.out.println(elements.size());
        System.out.println("-----------------");
        System.out.println(elements.get(0));*/
        //通过getElementsByAttribute()方法获取到属性为number的元素对象集合
        /*Elements elements1 = document.getElementsByAttribute("number");
        System.out.println(elements1.get(0));*/
        //通过getElementsByTag()方法获取到name元素的集合
        Elements name = document.getElementsByTag("name");
        //通过集合的get()方法获取一号索引上的元素.并且调用text()方法获取到文本内容
        String name1 = name.get(0).text();
        System.out.println(name1);
    }
}
