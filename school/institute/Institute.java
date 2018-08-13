/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.institute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 *
 * @author IDC-205
 */
class Institute{
  private final String name;
  private final List<Student> students = new ArrayList<Student>();
  public int numberOfStudents = 1;

  public Institute(String name) {
    // complete this constructor
    // Instruction:
    // Set the instance variable name to the parameter variable name
    this.name=name;
  }

  public void addStudent(Student s) {
    // complete this method here
    // Instruction:
    // add student s to the instance variable: ArrayList<Student> students
    students.add(s);
    ++numberOfStudents;
  }

  public void addStudent(Student[] array) {
    // complete this method here
    // instruction:
    // add all the students in the Student[] array to
    // the instance variable: ArrayList<Student> students
    
      for (Student student : array) {
          addStudent(student);
          
      }
  }

  public String toString() {
      String inst=name+": ";
    // complete this method
    // Instruction:
    // 1. Loop through all the students stored in the instance variable: ArrayList<Student> students and return a String that contains the each name and roll number of each student
    // 2. An example String to be returned should look like:
    /*   "Christ Academy: Vigyan 1, Vedanshi 2, Jahnvi 3, Abhiraj 4, " // notice the extra comma and space at the end*/
      for (Student student : students) {
          inst = inst+student.toString()+", ";
      }
    return inst;
  }

}

