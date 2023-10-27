package Task_3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class XMLParser {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("src/main/java/Task_3/plants.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);

            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("*");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String textContent = element.getTextContent().trim();
                System.out.println(textContent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}