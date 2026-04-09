/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi_project;

/**
 *
 * @author a
 */
public class person {
 
    // الكلاس الأب يحتوي على البيانات الأساسية

    // Private variables (Encapsulation)
    // متغيرات خاصة للحماية
    private String name;
    private int age;
    private double widthe;
    private double heigh;

    // Constructor
    // دالة البناء لتهيئة القيم
    public person(String name, int age, double widthe, double heigh) {
        this.name = name;
        this.age = age;
        this.widthe = widthe;
        this.heigh = heigh;
    }

    // Setters (modify values)
    // دوال لتعديل القيم
    public void setName(String name) 
    { this.name = name; }
    public void setAge(int age) 
    { this.age = age; }
    public void setWidthe(double widthe) 
    { this.widthe = widthe; }
    public void setHeigh(double heigh)
    { this.heigh = heigh; }

    // Getters (read values)
    // دوال للحصول على القيم
    public String getName() 
    { return name; }
    public int getAge()
    { return age; }
    public double getWidthe() 
    { return widthe; }
    public double getHeigh()
    { return heigh; }

    // Display basic info
    // عرض البيانات الأساسية
    public void displayinf() {
        System.out.println("name :" + getName() + " age:" + getAge());
    }


}
