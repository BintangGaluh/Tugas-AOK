/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blk;
import java.util.Scanner;

public class BLK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Binary to Decimal
        {
            System.out.println("Masukkan Biner untuk diubah ke Desimal: ");
            String a = sc.next();
            int b = Integer.parseInt(a, 2);
            System.out.println(b);
        }
        //Decimal to Binary
        {
            System.out.println("Masukkan Desimal untuk diubah ke Biner: ");
            int a = sc.nextInt();
            System.out.println(Integer.toBinaryString(a));
        }
        //Binary to Hexa
        {
            System.out.println("Masukkan Biner untuk diubah ke Hexa: ");
            String a = sc.next();
            System.out.println(Integer.toHexString(Integer.parseInt(a, 2)));
        }
        //Hexa to Binary
        {
            System.out.println("Masukkan Hexa untuk diubah ke Biner: ");
            String a = sc.next();
            int b = Integer.parseInt(a, 16);
            System.out.println(Integer.toBinaryString(b));
        }
        //Decimal to Hexa
        {
            System.out.println("Masukkan Desimal untuk diubah ke Hexa: ");
            int a = sc.nextInt();
            System.out.println(Integer.toHexString(a));
        }
        //Hexa to Decimal
        {
            System.out.println("Masukkan Hexa untuk diubah ke Desimal: ");
            String a = sc.next();
            System.out.println(Integer.parseInt(a, 16));
        }
    }
}
    

