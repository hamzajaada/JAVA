package JDBC.EXEMPLE;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl  implements StudentDao{
    //list is working as a database 
    List <Student> students ;
    public StudentDaoImpl(){
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("John", 1);
        students.add(student1);
        students.add(student2);
    }
    @Override
    public void deleteStudent(Student student){
        students.remove(student.getRollNo());
    }
  
    @Override
    public List<Student> getAllstudents() {
        return students;
    }
    @Override
    public Student getStudent(int rollNo) {
       return students.get(rollNo);
    @Override
    public void updateStudent(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
    }  
}
