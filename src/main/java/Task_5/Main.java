package Task_5;

import Task_5.Flower.Flower;
import Task_5.FlowerManager.FlowerManager;

import javax.xml.bind.JAXBException;


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
//            Flower flower = (Flower) unmarshaller.unmarshal(new File("src/main/resources/plants.xml"));
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
            Flower flower = FlowerManager.unmarshal("src/main/resources/plants.xml");

            System.out.println("Розібраний XML:");
            System.out.println(flower);


            FlowerManager.marshal(flower, "src/main/resources/new_plants.xml");

            System.out.println("Новий XML-документ збережено.");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}