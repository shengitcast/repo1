package practice;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) throws Exception {
        String path = Practice3.class.getClassLoader().getResource("practice/student1.xml").getPath();
        Document document = Jsoup.parse(new File(path),"UTF-8");
        JXDocument jxDocument = new JXDocument(document);
        /*List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            Element element = jxNode.getElement();
            System.out.println(element.text());
        }*/

        JXNode jxNode = jxDocument.selNOne("//student[@number='heima_0001']/age");
        String text = jxNode.getElement().text();
        System.out.println(text);

        /*System.out.println(jxNode);
        *//*System.out.println(jxNode);*//*
        System.out.println("----------------");
        Element element = jxNode.getElement();
        System.out.println(element);
        System.out.println("-----------------");
        Elements elements = element.select("student>age");
        System.out.println(elements.text());
*/
    }
}
