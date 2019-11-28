package hw_15.task_1;

import hw_15.entity.Student;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserMain {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();

        SAXHandler handler = new SAXHandler();

        InputStream resource = ClassLoader.getSystemResourceAsStream("hw_15/task_1/students.xml");
        parser.parse(resource, handler);

        List<Student> studentList = handler.getStudents();
        studentList.forEach(System.out::println);
    }
}

class SAXHandler extends DefaultHandler {
    private List<Student> students = new ArrayList<>();
    private Student student = null;
    private String content = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if ("student".equals(qName)) {
            student = new Student();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        switch (qName) {
            case "student":
                students.add(student);
                break;
            case "firstName":
                student.setFirstName(content);
                break;
            case "secondName":
                student.setSecondName(content);
                break;
            case "group":
                student.setGroup(content);
                break;
            case "faculty":
                student.setFaculty(content);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public List<Student> getStudents() {
        return students;
    }
}
