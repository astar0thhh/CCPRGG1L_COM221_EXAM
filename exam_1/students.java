public class Students {
    //Properties
    String surname;
    String firstname;
    char middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    Boolean iAmAwesome;

    //Students Method
    public void studentInfo(){
        System.out.println("Surname: " + surname + "\n" + "First Name: " + firstname + "\n" + "Middle Initial: " + middleInitial);
    }

    public void sayMyStudentNumber() {
        System.out.println("Student Number: " + studentNumber);
    }

    public void sayMyEmailAddress() {
        System.out.println("Student Email Address: " + studentEmailAddress);
    }

    public void amIAwesome() {
        System.out.println("iAmAwesome? " + iAmAwesome);
    }

    //Constructor
    public Students(String studentSurname, String studentFirstname, char studentMiddleInitial, String studentDateOfBirth, int studentStudentsNumber, String studentStudentsEmailAdd, Boolean amIAwesome) {
        surname = studentSurname;
        firstname = studentFirstname;
        middleInitial = studentMiddleInitial;
        dateOfBirth = studentDateOfBirth;
        studentNumber = studentStudentsNumber;
        studentEmailAddress = studentStudentsEmailAdd;
        iAmAwesome = amIAwesome;
    }
}
