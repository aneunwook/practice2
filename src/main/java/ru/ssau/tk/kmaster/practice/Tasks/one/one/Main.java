package ru.ssau.tk.kmaster.practice.Tasks.one.one;

public class Main {
    public static void main(String[] args) {

        Person first = new Person();
        Person second = new Person();
        Person third = new Person();

        first.setFirstName("Сергей");
        second.setFirstName("Кирилл");
        third.setFirstName("Алексей");
        first.setSecondName("Кривцов");
        second.setSecondName("Крылов");
        third.setSecondName("Яров");
        first.setPassportId(2143);
        second.setPassportId(9213);
        third.setPassportId(1932);

        String f_1 = first.getFirstName();
        String s_1 = first.getSecondName();
        int p_1 = first.getPassportId();
        String f_2 = second.getFirstName();
        String s_2 = second.getSecondName();
        int p_2 = second.getPassportId();
        String f_3 = third.getFirstName();
        String s_3 = third.getSecondName();
        int p_3 = third.getPassportId();
    }
}
