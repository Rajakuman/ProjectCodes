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
class Student {
  private final String name;
  private final int rollNumber;
  private final Institute institute;

  public Student(String n, Institute institute) {
    this.name = n;
    this.institute = institute;
    this.rollNumber = this.institute.numberOfStudents++;
  }

  public String toString() {
    return this.name + " " + this.rollNumber;
  }
}
