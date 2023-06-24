package com.sa2.Instructor.Entity;
public class Course {
    private int id;
    private String name;
    private int creditHours;


    public Course(String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
    }

    public Course(int id){
        this.id = id;
    }

    public Course() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", creditHours=" + creditHours +
                '}';
    }
}
