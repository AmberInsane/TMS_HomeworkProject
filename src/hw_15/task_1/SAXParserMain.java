package hw_15.task_1;

import hw_15.entity.Student;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserMain {
    private static String DIR_PATH = "/resources/hw_15/task_2/studentLena.json";

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();

        SAXHandler handler = new SAXHandler();
        InputStream resource = ClassLoader.getSystemResourceAsStream("hw_15/task_1/students.xml");
        parser.parse(resource, handler);

        List<Student> studentList = handler.getStudents();

        studentList.forEach(student -> System.out.println(student));
    }
}

class SAXHandler extends DefaultHandler {
    private List<Student> students = new ArrayList<>();
    private Student student = null;
    private String content = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            //Create a new Employee object when the start tag is found
            case "student":
                student = new Student();
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            //Add the employee to list once end tag is found
            case "student":
                students.add(student);
                break;
            //For all other end tags the employee has to be updated.
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
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public List<Student> getStudents() {
        return students;
    }
}
