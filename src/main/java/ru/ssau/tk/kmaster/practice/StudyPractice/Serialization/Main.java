package ru.ssau.tk.kmaster.practice.StudyPractice.Serialization;

import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) {
        Serializator serializator = new Serializator();
        try {
            Cat cat = serializator.desiarization();
            System.out.println(cat.getName());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
