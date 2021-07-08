public class Teacher {
/*Teacher class is used to define the fields, constructors, and methods needed for teacher data to be saved within the Teacher ArrayList that
was initiated in the School class */

    //Teacher information fields
    private String firstName;
    private String lastName;
    private String subject;

    //constructor for teacher data
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject( String subject ) {
        this.subject = subject;
    }

    //method to print all Teachers in the ArrayList through overridden toString method
    @Override
    public String toString(){
        return "Name: " + this.getFirstName() + " " + this.getLastName() + ", Subject: " + this.getSubject();
    }
}
