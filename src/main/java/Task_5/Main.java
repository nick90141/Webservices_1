package Task_5;

import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.util.ValidationEventCollector;
import java.io.File;


// Варіанти на вибір: 1. Оранжерея.

public class Main {
    public static void main(String[] args) {
//        try {
//            JAXBContext context = JAXBContext.newInstance(Flower.class);
//
//            Unmarshaller unmarshaller = context.createUnmarshaller();
//
//            ValidationEventCollector validationEventCollector = new ValidationEventCollector();
//            unmarshaller.setEventHandler(validationEventCollector);
//
//            Flower flower = (Flower) unmarshaller.unmarshal(new File("D:\\КУРС ПО JAVA\\Web-services\\№1. Software setup, web services, XML\\src\\main\\java\\Task_5\\plants.xml"));
//
//            if (validationEventCollector.hasEvents()) {
//                System.out.println("Помилки валідації:");
//                for (ValidationEvent event : validationEventCollector.getEvents()) {
//                    System.out.println(event.getMessage());
//                }
//            } else {
//                System.out.println("XML відповідає XSD-схемі.");
//            }
//
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
        try {
            Flower flower = FlowerManager.unmarshal("D:\\КУРС ПО JAVA\\Web-services\\№1. Software setup, web services, XML\\src\\main\\java\\Task_5\\plants.xml");

            System.out.println("Розібраний XML:");
            System.out.println(flower);


            FlowerManager.marshal(flower, "D:\\КУРС ПО JAVA\\Web-services\\№1. Software setup, web services, XML\\src\\main\\java\\Task_5\\new_plants.xml");

            System.out.println("Новий XML-документ збережено.");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}