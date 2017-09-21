
package employeetest;

//employee class with references to other objects
public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;    
    private Date hireDate;
    
    //constructor to initialize name, birth date and hire dates
    public Employee( String first, String last, Date dateOfBirth , 
       Date dateOfHire ){
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    }
    
    
    public String toString(){
        return String.format( "%s, %s Hired: %s Birthday: %s",
                lastName, firstName, hireDate, birthDate );
    }
}
