package JDBC.EXEMPLE;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllstudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
