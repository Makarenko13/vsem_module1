package mak.edu.module2;/*
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  Student
  @version  1.0.0
  @since 23.03.2021 - 23.25
*/

import java.util.Objects;

public class Student extends Person{
    private String university;
    private String faculty;
    private String chair;
    private String specialization;
    private int course;
    private String group;
    private String fieldOfStudy;
    private String headman;
    private String shift;
    private boolean freeEntrance;
    private boolean isHavingJob;
    private boolean fullTime;
    private boolean bachelor;
    private boolean master;

    public Student(String firstName, String lastName, String nationality,
                   String passportID, String address, double height, double weight,
                   String maritalStatus, String isHavingChildren, String email,
                   String phoneNumber, String education) {
        super(firstName, lastName, nationality, passportID, address, height,
                weight, maritalStatus, isHavingChildren, email, phoneNumber,
                education);
    }

    public Student(String university, String faculty, String chair,
                   String specialization, int course, String group,
                   String fieldOfStudy, String headman, String shift,
                   boolean freeEntrance, boolean isHavingJob, boolean fullTime,
                   boolean bachelor, boolean master) {
        this.university = university;
        this.faculty = faculty;
        this.chair = chair;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.fieldOfStudy = fieldOfStudy;
        this.headman = headman;
        this.shift = shift;
        this.freeEntrance = freeEntrance;
        this.isHavingJob = isHavingJob;
        this.fullTime = fullTime;
        this.bachelor = bachelor;
        this.master = master;
    }

    public Student(String firstName, String lastName, String nationality,
                   String passportID, String address, double height,
                   double weight, String maritalStatus, String isHavingChildren,
                   String email, String phoneNumber, String education,
                   String university, String faculty, String chair,
                   String specialization,int course, String group,
                   String fieldOfStudy, String headman, String shift,
                   boolean freeEntrance, boolean isHavingJob,
                   boolean fullTime, boolean bachelor, boolean master) {
        super(firstName, lastName, nationality, passportID, address, height,
                weight, maritalStatus, isHavingChildren, email, phoneNumber,
                education);
        this.university = university;
        this.faculty = faculty;
        this.chair = chair;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.fieldOfStudy = fieldOfStudy;
        this.headman = headman;
        this.shift = shift;
        this.freeEntrance = freeEntrance;
        this.isHavingJob = isHavingJob;
        this.fullTime = fullTime;
        this.bachelor = bachelor;
        this.master = master;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getHeadman() {
        return headman;
    }

    public void setHeadman(String headman) {
        this.headman = headman;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public boolean isFreeEntrance() {
        return freeEntrance;
    }

    public void setFreeEntrance(boolean freeEntrance) {
        this.freeEntrance = freeEntrance;
    }

    public boolean isHavingJob() {
        return isHavingJob;
    }

    public void setHavingJob(boolean havingJob) {
        isHavingJob = havingJob;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public boolean isBachelor() {
        return bachelor;
    }

    public void setBachelor(boolean bachelor) {
        this.bachelor = bachelor;
    }

    public boolean isMaster() {
        return master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                ", chair='" + chair + '\'' +
                ", specialization='" + specialization + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", headman='" + headman + '\'' +
                ", shift='" + shift + '\'' +
                ", freeEntrance=" + freeEntrance +
                ", isHavingJob=" + isHavingJob +
                ", fullTime=" + fullTime +
                ", bachelor=" + bachelor +
                ", master=" + master +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return getCourse() == student.getCourse() && isFreeEntrance()
                == student.isFreeEntrance() && isHavingJob()
                == student.isHavingJob() && isFullTime() == student.isFullTime()
                && isBachelor() == student.isBachelor() && isMaster()
                == student.isMaster() && getUniversity().equals(student.getUniversity())
                && getFaculty().equals(student.getFaculty()) && getChair().equals(student.getChair())
                && getSpecialization().equals(student.getSpecialization())
                && getGroup().equals(student.getGroup())
                && getFieldOfStudy().equals(student.getFieldOfStudy())
                && getHeadman().equals(student.getHeadman())
                && getShift().equals(student.getShift());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUniversity(), getFaculty(),
                getChair(), getSpecialization(), getCourse(), getGroup(),
                getFieldOfStudy(), getHeadman(), getShift(), isFreeEntrance(),
                isHavingJob(), isFullTime(), isBachelor(), isMaster());
    }
}
