package org.example;

import org.example.child.Cat;
import org.example.child.Dog;
import org.example.child.Duck;
import org.example.child.HumanExtendsAnimal;
import org.example.parent.Animal;
import org.example.parent.Speakable;
import org.example.parent.VeterinaryClinic;

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