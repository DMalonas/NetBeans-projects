/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investmentviewer3;

import javax.swing.JFrame;

/**
 *
 * @author Dimitrios
 * 
 * 
 * 
 * This program displays the growth of an investment
 */
public class InvestmentViewer3 {

    public static void main(String[] args) 
    {
        JFrame frame = new InvestmentFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
