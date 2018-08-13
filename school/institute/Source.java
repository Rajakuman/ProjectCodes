/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.institute;

/**
 *
 * @author IDC-205
 */
class Source{
  public static void main(String[] args) {
    Institute ca = new Institute("Christ Academy");
    Student s11 = new Student("Vigyan", ca);
    Student s12 = new Student("Vedanshi", ca);
    Student s13 = new Student("Jahnvi", ca);
    Student s14 = new Student("Abhiraj", ca);
    Student[] ca_students = { s11, s12, s13, s14 };
    ca.addStudent(ca_students);

    Institute vibgyor = new Institute("VIBGYOR");
    Student s21 = new Student("Sai", vibgyor);
    Student s22 = new Student("Pragati", vibgyor);
    Student s23 = new Student("Mukil", vibgyor);
    Student[] vibgyor_students = { s21, s22, s23 };
    vibgyor.addStudent(vibgyor_students);
//Christ Academy: Vigyan 1, Vedanshi 2, Jahnvi 3, Abhiraj 4, 
//VIBGYOR: Sai 1, Pragati 2, Mukil 3, 

    System.out.println(ca);
    System.out.println(vibgyor);
  }
}
