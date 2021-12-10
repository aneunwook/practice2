package ru.ssau.tk.kmaster.practice.StudyPractice.TryWithResources;

import java.io.*;
import java.nio.charset.StandardCharsets;

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

        try (FileInputStream fis = new FileInputStream("C:/Users/monster/Desktop/уник/Прога/4.txt");
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            int b;
            while ((b = isr.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String str = "AFBU@BPQGBQOGROPPONDGPWJNVPWU)@RU*JVN*@284h1nPNFWSG91mfpsdm)@!2131";
        String nL = "\n";
        FileWriter fw = null;
        File file = new File("C:/Users/monster/Desktop/уник/Прога/5fake.txt");

        try {
            fw = new FileWriter(file, true);
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fw.close();
        }
    }
}
