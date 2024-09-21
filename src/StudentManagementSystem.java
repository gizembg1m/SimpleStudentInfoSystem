import java.util.ArrayList;

public class StudentManagementSystem {
    private final ArrayList<Student> students;
    private int currentId;

    public StudentManagementSystem(){
        students = new ArrayList<>();
        currentId = 1;
    }

    public void addStudent(String name,String email){
        Student newStudent = new Student(currentId++,name,email);
        students.add(newStudent);
        System.out.println("student successfully added: " + newStudent);
    }
    public void listStudents(){
        if (students.isEmpty()){
            System.out.println("no student yet");
        }
        else{
            for(Student student : students){
                System.out.println(student);
            }
        }
    }

    public void updateStudent(int id,String name,String email){
        for (Student student : students){
            if (student.getId() == id){
                student.setName(name);
                student.setEmail(email);
                System.out.println("information of student is now updated: " + student );
                return;
            }
        }
        System.out.println("the student is not found!");
    }

    public void deleteStudent(int id){
        for (Student student : students){
            if (student.getId() == id){
                students.remove(student);
                System.out.println("student is now deleted: " + student );
                return;
            }
        }
        System.out.println("the student is not found!");
    }






}
