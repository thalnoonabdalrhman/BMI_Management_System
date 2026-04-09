/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi_project;

/**
 *
 * @author a
 */
public class bmi_oop extends person{
       
    // Private variables (Encapsulation)
    // متغيرات خاصة معرف private  للحماية
    private double minwidthe;
    private double maxwidthe;
    private double bmi;
    private String status;

    // Constructor calls parent constructor
    // استدعاء constructor من الكلاس الأب
    public bmi_oop(String name, int age, double widthe, double heigh) {
        super(name, age, widthe, heigh);
    }

    // Calculate BMI
    // حساب مؤشر كتلة الجسم
    public void calculateBMI() {
        bmi = getWidthe() / (getHeigh() * getHeigh());
    }

    // Calculate min and max weight
    // حساب الوزن الأدنى والأعلى
    public void calculateMaxwidthe_Minwidthe() {
        minwidthe = 18.5 * (getHeigh() * getHeigh());
        maxwidthe = 24.9 * (getHeigh() * getHeigh());
    }

    // Determine status
    // تحديد الحالة الصحية
    public void determinstatus() {
        if (bmi < 18.5) status = "Thin";
        else if (bmi <= 24.9) status = "Natural";
        else status = "Fat";
    }

    // Convert object to string
    // تحويل الكائن إلى نص للطباعة
    @Override
    public String toString() {
        return "\n======== bmi result ======="
                + "\nname :" + getName()
                + "\nage :" + getAge()
                + "\nbmi: " + Math.floor(bmi * 100) / 100
                + "\nstatus: " + status
                + "\nmin-max weight  " + Math.round(minwidthe) + "-" + Math.round(maxwidthe)
                + "\n===========================";
    }


}
