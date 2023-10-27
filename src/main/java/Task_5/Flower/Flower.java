package Task_5.Flower;

import Task_5.PlantModel.Plant;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Flower {
    private Plant plant;

    public Plant getPlant() {
        return plant;
    }

    @XmlElement
    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "plant=" + plant +
                '}';
    }
}