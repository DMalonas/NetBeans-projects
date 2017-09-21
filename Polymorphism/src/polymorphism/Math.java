/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author aa6164
 */
public class Math
{
    void doCalculation()
    {
    }
    
    double doCalculation(int x)
    {
        return 1.1;
    }
    
    double doCalculation(double x)
    {
        return 2.2;
    }
    
    // Error signature is same as above
//    void doCalculation(double x)
//    {
//        return 3.3;
//    }
    
    double doCalculation(int x, double y)
    {
        return 4.4;
    }
    
}
