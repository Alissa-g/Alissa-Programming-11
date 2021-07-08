
public class Main {
    public static void main( String[] args) {
        /*Main class runs the program and inputs the data that is run through the School, Teacher, and Student classes */

        //create 10 new students
        Student student = new Student("Ken", "Brown", "A");
        Student student1 = new Student("James", "Bond", "C");
        Student student2 = new Student("Jamie", "Jones", "B");
        Student student3 = new Student("Stanley", "Lee", "C");
        Student student4 = new Student("Bill", "Bo", "F");
        Student student5 = new Student("Fred", "Franks", "C");
        Student student6 = new Student("Johnny", "Walker", "F");
        Student student7 = new Student("Jonah", "Jamieson", "B");
        Student student8 = new Student("Ted", "Scott", "C");
        Student student9 = new Student("Donald", "McDonald", "A");


        //add students to student ArrayList
        School.addStudent(student);
        School.addStudent(student1);
        School.addStudent(student2);
        School.addStudent(student3);
        School.addStudent(student4);
        School.addStudent(student5);
        School.addStudent(student6);
        School.addStudent(student7);
        School.addStudent(student8);
        School.addStudent(student9);

        //show all 10 students in the Student ArrayList
        School.printStudents();

        //create 3 new teachers
        Teacher teacher1 = new Teacher("Joe", "Bailey", "Drama");
        Teacher teacher2 = new Teacher("Diana", "Francis", "Math");
        Teacher teacher3 = new Teacher("Bill", "Holmes", "English");

        //add new teachers to Teacher ArrayList
        School.addTeacher(teacher1);
        School.addTeacher(teacher2);
        School.addTeacher(teacher3);

        //show all 3 teachers in the Teacher ArrayList
        System.out.println("\r");
        School.printTeachers();

        //remove 2 students from the Student ArrayList
        School.removeStudent(student9);
        School.removeStudent(student6);

        //show new list of Student ArrayList with removed students (should show 8)
        System.out.println("\r");
        School.printStudents();

        //remove teacher from Teacher from Teacher ArrayList
        School.removeTeacher(teacher2);

        //show new list of Teacher ArrayList with removed teacher (should show 2)
        System.out.println("\r");
        School.printTeachers();

    }
}
