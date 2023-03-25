package org.Seminar002;

import org.Seminar002.child.Cat;
import org.Seminar002.child.Dog;
import org.Seminar002.child.Duck;
import org.Seminar002.child.HumanExtendsAnimal;
import org.Seminar002.parent.Animal;
import org.Seminar002.parent.Speakable;
import org.Seminar002.parent.VeterinaryClinic;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        clinic
                .addAnimal(new Cat("Барсик", "серый"))
                .addAnimal(new Duck("Дональд", "пёстрый", 2))
                .addAnimal(new Dog("Барбос", "белый"))
                .addAnimal(new HumanExtendsAnimal("Брэд", 2));

        for (Animal animal: clinic.getANIMALS()) {
            animal.getIll();
        }

        System.out.println(clinic.getSpeakable());
        clinic.getSpeakable().forEach(Speakable::speak);
    }
}