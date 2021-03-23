package mak.edu.module2;/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  Person
  @version  1.0.0
  @since 23.03.2021 - 23.24
*/

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String nationality;
    private String passportID;
    private String address;
    private double height;
    private double weight;
    private String maritalStatus;
    private String isHavingChildren;
    private String email;
    private String phoneNumber;
    private String education;


    public Person() {
    }

    public Person(String firstName, String lastName, String nationality,
                  String passportID, String address, double height,
                  double weight, String maritalStatus, String isHavingChildren,
                  String email, String phoneNumber, String education) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.passportID = passportID;
        this.address = address;
        this.height = height;
        this.weight = weight;
        this.maritalStatus = maritalStatus;
        this.isHavingChildren = isHavingChildren;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.education = education;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getIsHavingChildren() {
        return isHavingChildren;
    }

    public void setIsHavingChildren(String isHavingChildren) {
        this.isHavingChildren = isHavingChildren;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", passportID='" + passportID + '\'' +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", isHavingChildren='" + isHavingChildren + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", education='" + education + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.getHeight(), getHeight()) == 0
                && Double.compare(person.getWeight(), getWeight()) == 0
                && getFirstName().equals(person.getFirstName())
                && getLastName().equals(person.getLastName())
                && getNationality().equals(person.getNationality())
                && getPassportID().equals(person.getPassportID())
                && getAddress().equals(person.getAddress())
                && getMaritalStatus().equals(person.getMaritalStatus())
                && getIsHavingChildren().equals(person.getIsHavingChildren())
                && getEmail().equals(person.getEmail())
                && getPhoneNumber().equals(person.getPhoneNumber())
                && getEducation().equals(person.getEducation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getNationality(),
                getPassportID(), getAddress(), getHeight(), getWeight(),
                getMaritalStatus(), getIsHavingChildren(), getEmail(), getPhoneNumber(),
                getEducation());
    }
}
