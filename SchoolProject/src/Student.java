public class Student {
    /*Student class is used to define the fields, constructors, and methods needed for student data to be saved within
    the Student ArrayList that was initiated in the School class */

    //Student information fields
    private String firstName;
    private String lastName;
    private String grade;
    private static int studentNumber = 001;
    private int idNum;

    //constructor to create student object including unique student ID number
    Student(String firstName, String lastName, String grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.idNum = studentNumber;
        studentNumber++;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade( String grade ) {
        this.grade = grade;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum( int idNum ) {
        this.idNum = idNum;
    }

    //method to print students in the ArrayList through overridden toString method
    @Override
    public String toString(){
        return "Name: " + this.getFirstName() + " " + this.getLastName() + ", Grade: " + this.getGrade();
    }
}


