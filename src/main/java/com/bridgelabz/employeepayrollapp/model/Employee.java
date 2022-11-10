package com.bridgelabz.employeepayrollapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class Employee {
    @Id
    @GeneratedValue
   private int id;
   public String firstName;
   private String lastName;
   private String profilePic;
   private String note;
   private long salary;
   private String startDate;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String profilePic, String note, long salary, String startDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePic = profilePic;
        this.note = note;
        this.salary = salary;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String  startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", note='" + note + '\'' +
                ", salary=" + salary +
                ", startDate=" + startDate +
                '}';
    }
}
