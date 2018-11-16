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
public class Method {
    public void ArithmeticException(int bil){
        try{
            System.out.println(bil/0);
        }catch(ArithmeticException e){
            System.out.println("Error ArithmeticException");
        }
    }
    
    public void ArrayIndexOutOfBoundsException(){
        try{
            int kelompok[]=new int[10];
            kelompok[11] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error ArrayIndexOutOfBounds");
        }
    }
    public void StringIndexOutOfBoundsException(){
        try{
            String str="contoh";
            char c;
            c = str.charAt(10);
            System.out.println(c);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Error StringIndexOutOfBoundsException");
        }
    }
    
    public void NumberFormatException(){
        try{
            int number = Integer.parseInt("j");
            System.out.println(number);
        }catch(NumberFormatException e){
            System.out.println("Error NumberFormatException");
        }
    }
    
    public void RuntimeException(int bil){
        try{
            String str="contoh";
            char c;
            c = str.charAt(10);
            System.out.println(c);
            System.out.println(bil/0);
        }catch(RuntimeException e){
            System.out.println(e);
        }
    }
    
}
