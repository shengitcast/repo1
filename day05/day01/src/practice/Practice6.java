package practice;

import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*标签就是元素,元素就是标签*/
public class Practice6 {
    public static void main(String[] args) throws Exception {
        String path = Practice6.class.getClassLoader().getResource("practice/student1.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        //通过getElementsByTag()方法获得Elements集合对象
        //Elements elements = document.getElementsByTag("student");
        //通过id获取,语法:[id='id对应的值']
        //Elements elements1 = elements.select("[id='zhang']");
        //通过number属性并且通过子一级标签查询[属性名='属性值']>子一级标签
        //Elements elements1 = elements.select("[number='heima_0001']>name");
        //查询所有子集元素"父标签 子标签"
        //Elements elements1 = elements.select("student name");
        //查询文本text()方法,查询文本形式
        //Elements elements1 = elements.select("student[number='heima_0001']");
        //String text = elements1.text();
        //html可以查询出元素下所有内容的字符串表现形式
        //String html = elements1.html();
        //通过new JXDocument()方法获取到JXDocument对象,是一个地址值
        JXDocument jxDocument = new JXDocument(document);
        //通过selN()方法获取到jxNodes集合
        JXNode jxNode1 = jxDocument.selNOne("//student[@number='heima_0002']//name");
        String text = jxNode1.getElement().text();
        System.out.println(text);
        /*for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }*/



        //System.out.println(elements);



    }
}
