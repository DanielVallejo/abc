/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package des1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Des1 {

    /**
     * @param args the command line arguments
     */
      static Scanner tecla = new Scanner(System.in);
    public static void suma(){
        int a,b,c;
         System.out.print ("Ingrese a:");
         a=Integer.valueOf(tecla.nextLine());
         System.out.print ("Ingrese b:");
         b=Integer.valueOf(tecla.nextLine());
        c=a+b;
        System.out.println(c);
    }
    public static void a(){
        int a,b,c;
         System.out.print ("Ingrese a:");
         a=Integer.valueOf(tecla.nextLine());
         System.out.print ("Ingrese b:");
         b=Integer.valueOf(tecla.nextLine());
        c=a-b;
        System.out.println(c);
    }
    
    
    public static void multi(){
        int a,b,c;
         System.out.print ("Ingrese a:");
         a=Integer.valueOf(tecla.nextLine());
         System.out.print ("Ingrese b:");
         b=Integer.valueOf(tecla.nextLine());
        c=a*b;
        System.out.println(c);
        System.out.println(c);
    }
    public static void division(){
        int a,b,c;
         System.out.print ("Ingrese a:");
         a=Integer.valueOf(tecla.nextLine());
         System.out.print ("Ingrese b:");
         b=Integer.valueOf(tecla.nextLine());
        c=a/b;
        System.out.println(c);
        System.out.println(c);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showConfirmDialog(null, "HOLA");
        int a=5,b=3,c;
        c=a+b;
        System.out.println(c);
        System.out.println("vallejo");
        System.out.println("iza gil");
        System.out.println("peke");
    }
    
}
