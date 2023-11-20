package JDBC.EXEMPLE;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao  studentDao = new StudentDaoImpl();
        //print all student
        for (Student student : studentDao.getAllstudents()){
            System.out.println("Student : [RollNo:" +student.getRollNo()+", Name :"+student.getName()+"]" );
        }
        // update student
        Student student = studentDao.getAllstudents().get(0);
        student.setName("hamza");
        studentDao.updateStudent(student);
       //get the student 
       studentDao.getStudent(0);
       System.out.println("Student : [RollNo:" +student.getRollNo()+", Name :"+student.getName()+"]");


    }
}
