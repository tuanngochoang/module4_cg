package com.codegym.di.setter;

public class Clazz {
    private int id;
    private String name;
    private Student studentBinh;
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
    public Student getStudentBinh() {
        return studentBinh;
    }
    public void setStudentBinh(Student studentBinh) {
        this.studentBinh = studentBinh;
    }

    @Override
    public String toString() {
        return "Clazz [id=" + id + ", name=" + name + ", student=" + studentBinh.toString() + "]";
    }
}
