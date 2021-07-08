import java.util.ArrayList;


public class School {
    /*School class is used to collect the data from the Main class and define the methods which will
    show the inputted data when the program is run */

    //Create new ArrayList for Students, Teachers, and Courses
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    ArrayList<School> courses = new ArrayList<>();

    //initialize 3 fields
    private String name;
    private String address;
    private String country;

    //School constructor
    School(){
        this.name = "Second Secondary";
        this.address = "1234 Sesame Street";
        this.country = "Malaysia";
    }

    //getters and setters for 3 fields created within this class
    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry( String country ) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress( String address ) {
        this.address = address;
    }

    //method to add a new student to the students ArrayList
    public static void addStudent( Student student ){
        students.add(student);
    }

    //method to remove a student from the students ArrayList
    public static void removeStudent( Student student ){
       students.remove(student);
    }

    //method to show all students in ArrayList
    public static void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //method to add a new Teacher to the teachers ArrayList
    public static void addTeacher( Teacher teacher ){
        teachers.add(teacher);
    }

    //method to remove a teacher from the teachers ArrayList
    public static void removeTeacher( Teacher teacher ){
        teachers.remove(teacher);
    }

    //method to show all Teachers in ArrayList
    public static void printTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

}