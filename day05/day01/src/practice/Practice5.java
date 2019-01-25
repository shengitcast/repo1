package practice;

import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*通过类选择器进行筛选*/
public class Practice5 {
    public static void main(String[] args) throws Exception {
        String path = Practice5.class.getClassLoader().getResource("practice/student1.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        JXDocument jxDocument = new JXDocument(document);
        List<JXNode> jxNodes = jxDocument.selN("//student[@number='heima_0001']/name");
        Element element = jxNodes.get(0).getElement();
        Elements xing = element.getElementsByTag("xing");
        Element text = xing.get(0).text("123");
        System.out.println(text);
        /*for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode.isText());
        }*/
        //通过标签名(元素)获取element对象
        /*Elements elements = document.select("student");
        //遍历elements集合
        *//*for (Element element : elements) {
            System.out.println(element);
            System.out.println("--------------");
        }*//*
        //通过select("name>xing")获取name下的xing,得到<xing>张</xing>
        //并且通过text()方法获取到文本
        String text = elements.get(0).select("name>xing").text();
        System.out.println(text);*/
        /*Elements elements1 = document.select("student[id='zhang']>name");
        System.out.println(elements1);*/
        /*//通过.class名获取element对象
        Elements elements1 = document.select(".Yi");
        System.out.println(elements);*/
        //通过#id
    }
}
