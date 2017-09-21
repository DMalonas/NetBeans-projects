package drawpanel2;

import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawPanel2 extends JPanel{
    
    public void paintComponent(Graphics g){
        
        //call paintComponent to ensure the panel displays correctly 
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        
        g.drawLine( 0, 0, width, height );
        g.drawLine( 0, height, width, 0 );
    }
    
    public static void main(String[] args){
       
        
        
        DrawPanel2 panel = new DrawPanel2();
        JFrame frame = new JFrame();
        
        
        
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        
        double a, b;
        
        String.format(
            "%f", a = Double.parseDouble(JOptionPane.showInputDialog("Input 1") ) ) ;
 
        String.format(
            "%f", b = Double.parseDouble(JOptionPane.showInputDialog("Input 2") ) ) ;
        JOptionPane.showMessageDialog( null, String.format( "SUM : %.2f" , a + b ) );
      
        //SCR
        Scanner sc = new Scanner(System.in);
        
        int numberOfStudentsCounter = 0, total = 0, pass = 0, grade; 
        
        for(;;){
            
            System.out.printf( "STUDENT %d GRADE[0 - 100(-1 EXIT)]: ", numberOfStudentsCounter + 1 );
            while( !sc.hasNextDouble() ){
               System.out.print( "\nINPUT == ONLY NUMERIC[0 - 100(-1 EXIT)] \n");
               sc.next();
            }
            grade = sc.nextInt();
            if( grade > 100 || grade < 0 ){
                if( grade == -1 ){
                    break;
                }
                System.out.print("INPUT == RANGE[0 - 100(-1 EXIT)]");
                continue;
            }
             
            numberOfStudentsCounter++;
            total+=grade;
            if( grade > 40 ) pass++;
        }
        System.out.printf("NUMBER OF STUDENTS: %d\tNUMBER PASSED: %d\tAVERAGE GRADE: %.2f\n",
               numberOfStudentsCounter, pass, (double)total / numberOfStudentsCounter );
        
        return;
        
    }
}