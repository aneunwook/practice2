package ru.ssau.tk.kmaster.practice.StudyPractice.TryWithResources;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("C:/Users/monster/Desktop/уник/Прога/Оксимирон.txt");
             FileOutputStream fos = new FileOutputStream("C:/Users/monster/Desktop/уник/Прога/WhoKilledMark.txt");
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            int b;
            while ((b = fis.read()) != -1) {
                baos.write(b);
            }
            baos.writeTo(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
