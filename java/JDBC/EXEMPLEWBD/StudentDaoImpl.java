package JdbcTest;

import org.postgresql.ds.PGSimpleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private PGSimpleDataSource dataSource;

    public StudentDaoImpl() {
        dataSource = new PGSimpleDataSource();
        dataSource.setURL("yourURL");
        dataSource.setUser("User");
        dataSource.setPassword("pass");
        // Create the "students" table if it doesn't exist
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "CREATE TABLE IF NOT EXISTS students (roll_no SERIAL PRIMARY KEY, name VARCHAR(255) NOT NULL)")) {
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(Student student) {
        try (Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM students WHERE roll_no = ?")) {
            preparedStatement.setInt(1, student.getRollNo());
            preparedStatement.executeUpdate();
            System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from the database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM students");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int rollNo = resultSet.getInt("roll_no");
                String name = resultSet.getString("name");
                students.add(new Student(name, rollNo));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        try (Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM students WHERE roll_no = ?")) {
            preparedStatement.setInt(1, rollNo);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String name = resultSet.getString("name");
                    return new Student(name, rollNo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateStudent(Student student) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students SET name = ? WHERE roll_no = ?")) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getRollNo());
            preparedStatement.executeUpdate();
            System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void insertStudent(Student student) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students (name, roll_no) VALUES (?, ?)")) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getRollNo()); // Assuming rollNo is provided
            preparedStatement.executeUpdate();
            System.out.println("Student: [Roll No: " + student.getRollNo() + ", Name: " + student.getName() + "] inserted into the database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
