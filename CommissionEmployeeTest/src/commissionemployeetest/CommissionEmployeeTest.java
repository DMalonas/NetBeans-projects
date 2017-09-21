
package commissionemployeetest;

public class CommissionEmployeeTest {

    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee( "Sue", "Jones", "222- 22- 2222", 
        10000, 0.6 );
        
        System.out.println(
            "Employee information obtained by get methods: \n" );
        System.out.printf( "%s %s\n", "First name is ", 
                employee.getFirstName() );
        System.out.printf( "%s %s\n", "SSN is ", employee.getSocialSecurityNumber());
         System.out.printf( "%s %s\n", "gross sales is ", employee.getGrossSales());
          System.out.printf( "%s %s\n", "SSN is ", employee.getCommissionRate());

           System.out.printf( "%s ", employee);
    }
    
}
