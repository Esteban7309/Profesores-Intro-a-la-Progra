/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;
import java.util.Scanner;
/**
 *
 * @author Katya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre="Katya Brenes";
        System.out.println("Hola, "+nombre);
        System.out.println("Digite un número:");
        int num=sc.nextInt();
        if(num%2==0){
           System.out.print("Usted digitó un número par");
        }else{
           System.out.print("Usted digitó un número impar);
        }
    }
    
}
