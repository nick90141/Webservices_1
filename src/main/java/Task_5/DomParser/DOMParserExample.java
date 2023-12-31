package Task_5.DomParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMParserExample {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            File file = new File("src/main/resources/plants.xml");
            Document document = builder.parse(file);

            NodeList plantNodes = document.getElementsByTagName("Plant");
            for (int i = 0; i < plantNodes.getLength(); i++) {
                Element plantElement = (Element) plantNodes.item(i);

                String name = plantElement.getElementsByTagName("Name").item(0).getTextContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}