public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[10];
        this.numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] largerArray = new String[students.length * 2];
            System.arraycopy(students, 0, largerArray, 0, students.length);
            students = largerArray;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int k = i; k < numberOfStudents - 1; k++) {
                    students[k] = students[k + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void main(String[] args) {
        Course course = new Course("Java Programming");

        course.addStudent("Ali Ahmed");
        course.addStudent("Fatima Omar");
        course.addStudent("Mohamed Hassan");

        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Number of students: " + course.getNumberOfStudents());

        System.out.println("Enrolled students:");
        String[] studentList = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println("- " + studentList[i]);
        }

        course.dropStudent("Fatima Omar");
        System.out.println("\nAfter dropping a student, count: " + course.getNumberOfStudents());
    }
}