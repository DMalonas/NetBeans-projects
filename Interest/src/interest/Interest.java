package interest;

public class Interest{
    
    public static void main( String[] args ){
        double amount, principal = 1000.0, rate = 0.10;
        
    System.out.printf("%s%20s\n","Year","Amount on deposit");
    for ( int i = 0; i < 10; ++i ){
        System.out.printf("%4d%,20.2f\n", i+ 1, principal * Math.pow( 1.0 + rate, i + 1 ) );
    }}}