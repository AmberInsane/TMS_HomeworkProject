package hw_15.task_1;

import hw_15.entity.Student;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DomParserMain {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        InputStream resource = ClassLoader.getSystemResourceAsStream("hw_15/task_1/students.xml");
        Document document = documentBuilder.parse(resource);

        List<Student> students = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        // стоит все же выносить в отдельные методы куски логики
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Student employee = new Student();

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);

                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().
                                getTextContent().trim();
                        switch (cNode.getNodeName()) {
                            case "firstName":
                                employee.setFirstName(content);
                                break;
                            case "secondName":
                                employee.setSecondName(content);
                                break;
                            case "group":
                                employee.setGroup(content);
                                break;
                            case "faculty":
                                employee.setFaculty(content);
                                break;
                        }
                    }
                }
                students.add(employee);
            }
        }

        // students.forEach(System.out::println); твой способ не ошибка
        students.forEach(employee -> System.out.println(employee));
    }
}
