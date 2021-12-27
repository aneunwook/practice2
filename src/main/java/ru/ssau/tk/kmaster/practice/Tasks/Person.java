package ru.ssau.tk.kmaster.practice.Tasks;

public class Person {

    private String firstName;
    private String secondName;
    private int passportId;
    Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person() {
        this.firstName = "Unknown";
        this.secondName = "Unknown";
        this.passportId = 0;
        this.gender = Gender.MALE;
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String secondName, int passportId, Gender gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.passportId = passportId;
        this.gender = gender;
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