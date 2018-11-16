/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainexception;

/**
 *
 * @author acer
 */
public class MainException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Method r = new Method();
        int bil =10;
        
        r.ArithmeticException(bil);
        r.ArrayIndexOutOfBoundsException();
        r.StringIndexOutOfBoundsException();
        r.NumberFormatException();
        r.RuntimeException(bil);
    }
    
}
