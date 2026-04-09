
package bmi_project;


// استيراد الكلاسات الخاصة بالإدخال ومعالجة الأخطاء
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Bmi_project {

      public static void main(String[] args) {
  // ================= Project Description =================
// 
// This program calculates Body Mass Index (BMI) using two approaches:
// 1- Procedural programming
// 2- Object-Oriented Programming (OOP) using inheritance
// It also validates user input and prevents invalid values

//
// هذا البرنامج يقوم بحساب مؤشر كتلة الجسم (BMI) باستخدام طريقتين:
// 1- البرمجة الإجرائية (Procedural)
// 2- البرمجة الكائنية (OOP) باستخدام الوراثة
// كما يقوم بالتحقق من صحة إدخال المستخدم ومنع القيم الخاطئة
// =======================================================
   
          
 
 
 
        // Create Scanner object to read user input from keyboard
        // إنشاء كائن Scanner لقراءة الإدخال من المستخدم
        Scanner input = new Scanner(System.in);

        // Set locale to US to allow decimal numbers with dot (e.g., 1.75)
        // ضبط النظام ليقرأ الأرقام العشرية باستخدام النقطة
        input.useLocale(Locale.US);

        // Boolean flag to check if input is valid
        // متغير منطقي للتحقق من صحة الإدخال
        boolean vaild = false;

        // Variables to store user data
        // متغيرات لتخزين بيانات المستخدم
        String name = null;
        int age = 1;
        double weight = 0.5; // weight
        double height = 0.5;  // height

        // Variables for BMI range
        // متغيرات لحساب أقل وأعلى وزن طبيعي
        double minwidthe;
        double maxwidthe;

        // ================= Sample Data Section =================
        // بيانات جاهزة للعرض بدون إدخال المستخدم
        String[] name1 = {"thalnoon", "ahmed", "ali"};
        int age1[] = {20, 13, 15};
        double widthe1[] = {40.5, 70.5, 80.5};
        double hight1[] = {1.60, 1.85, 1.10};

        // Loop to process sample data
        // حلقة لمعالجة البيانات الثابتة
        for (int i = 0; i < 3; i++) {

            // Calculate BMI using formula: weight / (height^2)
            // حساب BMI باستخدام القانون
            double bmi1 = widthe1[i] / (hight1[i] * hight1[i]);

            // Calculate minimum and maximum healthy weight
            // حساب أقل وأعلى وزن صحي
            double minwidthe1 = 18.5 * (hight1[i] * hight1[i]);
            double maxwidthe1 = 24.9 * (hight1[i] * hight1[i]);

            // Determine status using shorthand condition
            // تحديد الحالة باستخدام الشرط المختصر
            String status = (bmi1 < 18.5) ? "Thin"
                    : (bmi1 < 25) ? "Natural"
                    : "Fat";

            // Print formatted result
            // طباعة النتيجة بشكل منظم
            System.out.println("\n"
                    + "======== bmi result ======="
                    + "\nname :" + name1[i]
                    + "\nage :" + age1[i]
                    + "\nbmi: " + Math.floor(bmi1 * 100) / 100 // تقريب لرقمين
                    + "\nstatus: " + status
                    + "\nmin-max weight  " + Math.round(minwidthe1) + "-" + Math.round(maxwidthe1)
                    + "\n===========================");
        }

        // Control variable for main loop
        // متغير للتحكم في استمرار البرنامج
        boolean coles = true;

        // Main program loop
        // الحلقة الرئيسية للبرنامج
        while (coles) {

            // Display menu
            // عرض الخيارات للمستخدم
            System.out.println("==================================");
            System.out.println("1-Enter the input procedural");
            System.out.println("2-Enter the input oop");
            System.out.println("3-Exit");
            System.out.println("==================================");

            // Read user choice
            //  اختيار المستخدم
            byte option = input.nextByte();

            // If not exit, ask for input
            // إذا اختار الخيار رقم ثلاثة  
            if (option != 3 ) {

                // ================= Name Validation =================
                // التحقق من الاسم
                while (!vaild) {

                    System.out.print("Enter The Name :");

                    // Clear buffer issue after nextByte
                    // تنظيف الذاكرة المؤقتة
                   // input.nextLine();

                    name = input.nextLine();

                    // Check if name contains only letters
                    // التحقق أن الاسم يحتوي حروف فقط
                    if (!name.matches("[a-zA-Zأ-ي]+")) {
                        System.out.println("Name يحتوي على ارقام");
                    } else {
                        vaild = true;
                    }
                }

                vaild = false;

                // ================= Age Validation =================
                // التحقق من العمر
                while (!vaild) {
                    try {
                        System.out.print("Enter the age :");

                        age = input.nextInt();

                        // Reject negative or zero values
                        // رفض القيم السالبة أو الصفر
                        if (age <= 0) {
                            System.out.println("العمر لا يمكن يكون سالب");
                        } else {
                            vaild = true;
                        }

                    } catch (InputMismatchException e) {
                        // Handle non-numeric input
                        // معالجة إدخال نص بدل رقم
                        System.out.println("ادخل رقم صحيح");
                        input.nextLine();
                    }
                }

                vaild = false;

                // ================= Weight Validation =================
                // التحقق من الوزن
                while (!vaild) {
                    try {
                        System.out.print("Enter the weight:");

                        weight = input.nextDouble();

                        if (weight < 0) {
                            System.out.println("الوزن لا يمكن يكون سالب");
                        } else {
                            vaild = true;
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("ادخل رقم صحيح");
                        input.nextLine();
                    }
                }

                vaild = false;

                // ================= Height Validation =================
                // التحقق من الطول
                while (!vaild) {
                    try {
                        System.out.print("Enter the height:");

                        height = input.nextDouble();

                        if (height <= 0) {
                            System.out.println("الطول لا يمكن يكون صفر أو سالب");
                        } else {
                            vaild = true;
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("ادخل رقم صحيح");
                        input.nextLine();
                    }
                }
            }

            // ================= Switch Options =================
            switch (option) {

                case 1:
                    // Procedural method
                    // الطريقة الإجرائية
                    double bmi = weight / (height * height);

                    minwidthe = 18.5 * (height * height);
                    maxwidthe = 24.9 * (height * height);

                    String status;

                    if (bmi < 18.5){ status = "Thin";}
                    else if (bmi <= 24.9){ status = "Natural";}
                    else{ status = "Fat";}

                    System.out.println("\n======== bmi result ======="
                            + "\nname :" + name
                            + "\nage :" + age
                            + "\nbmi: " + Math.floor(bmi * 100) / 100
                            + "\nstatus: " + status
                            + "\nmin-max weight  " + Math.round(minwidthe) + "-" + Math.round(maxwidthe)
                            + "\n===========================");
                    break;

                case 2:
                    // OOP method using inheritance
                    // الطريقة الكائنية باستخدام الوراثة
                    
//                    bmi_oop person1 = new bmi_oop("thalnoon", 20, 40.5, 1.60);
//
//                    // Call methods step by step
//                    // استدعاء الدوال بالترتيب
//                    person1.displayinf();
//                    person1.calculateBMI();
//                    person1.calculateMaxwidthe_Minwidthe();
//                    person1.determinstatus();
//
//                    // Print object (calls toString)
//                    // طباعة الكائن باستخدام toString
//                    System.out.println(person1);
//                    
                                  
                    bmi_oop person1 = new bmi_oop(name, age, weight, height);

                    // Call methods step by step
                    // استدعاء الدوال بالترتيب
                    person1.displayinf();
                    person1.calculateBMI();
                    person1.calculateMaxwidthe_Minwidthe();
                    person1.determinstatus();

                    // Print object (calls toString)
                    // طباعة الكائن باستخدام toString
                    System.out.println(person1);
                    
 
                    break;

                case 3:
                    // Exit program
                    // الخروج من البرنامج
                    coles = false;
                    break;

                default:
                    // Invalid option
                    // خيار غير صحيح
                    System.out.println("Invalid option");
            }
        }
    }
}



      
    

