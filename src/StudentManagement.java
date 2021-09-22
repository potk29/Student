import java.util.*;

public class StudentManagement {
    private List<Student> students = new ArrayList<Student>();

    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup() == s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public String studentsByGroup() {
        String result = "";
        String res = "";
        for(Student s : students) {
            if(res.indexOf(s.getGroup()) == -1) {
                res = res.concat(s.getGroup()).concat(" ");
                result = result.concat(s.getGroup()).concat("\n");
                for(Student t : students) {
                    if(t.getGroup() == s.getGroup()) {
                        result = result.concat(t.getInfo()).concat("\n");
                    }
                }
            }
        }
        return result;
    }

    public void removeStudent(String id) {
        for(int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getId() == id) {
                students.remove(i);
            }
        }
    }   

    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        Student s2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        s1.setGroup("K62CC");
        s2.setGroup("K62CC");
        StudentManagement SM = new StudentManagement();
        SM.addStudent(s1);
        SM.addStudent(s2);
        SM.addStudent(s3);
        SM.addStudent(s4);
        System.out.println(SM.studentsByGroup());
        SM.removeStudent("17020002  ");
        System.out.println(SM.studentsByGroup());
       
    }
}
