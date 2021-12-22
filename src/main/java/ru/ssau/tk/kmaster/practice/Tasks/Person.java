package ru.ssau.tk.kmaster.practice.Tasks;

public class Person {

    private String firstName;
    private String secondName;
    private int passportId;

    public Person() {
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String secondName, int passportId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }
}