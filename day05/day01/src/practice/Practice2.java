package practice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.naming.Name;

public class Practice2 {
    public static void main(String[] args) throws Exception {
        String path = Practice2.class.getClassLoader().getResource("practice/student1.xml").getPath();
        String str="<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                "<students   xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "  \t\t\t xmlns=\"http://www.itcast.cn/xml\"\n" +
                "  \t\t   xsi:schemaLocation=\"http://www.itcast.cn/xml  student.xsd\"\n" +
                "  \t\t    >\n" +
                "\n" +
                "    <student number=\"heima_0001\">\n" +
                "        <name>张三</name>\n" +
                "        <age>20</age>\n" +
                "        <sex>male</sex>\n" +
                "    </student>\n" +
                "    <student number=\"heima_0002\">\n" +
                "        <name>李四</name>\n" +
                "        <age>18</age>\n" +
                "        <sex>female</sex>\n" +
                "    </student>\n" +
                "</students>";
        Document document = Jsoup.parse(str);
        Elements ele_stu = document.getElementsByTag("student");
        String number = ele_stu.attr("number");
        Elements number1 = ele_stu.attr("number", number);
        System.out.println(number1);
        System.out.println("------------------------");
        System.out.println(number);
        /*String name = ele_stu.get(0).getElementsByTag("Name").text();
        System.out.println(name);*/
        /*String s = document.text();
        System.out.println(s);*/
        /*Elements allElements = document.getAllElements();
        System.out.println(allElements.size());
        for (Element element : allElements) {
            System.out.println(element);
            System.out.println("-------------------");*/
        }
    }

