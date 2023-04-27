/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jittipat
 */
public class LAB3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Jittipat Phonhan");
            output.println(19);
            output.println(63.5);
            output.println(175.0);

            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String s;
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            while ((s = input.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
