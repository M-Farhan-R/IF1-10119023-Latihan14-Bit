/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan14.bit;

/**
 *
 * @author 
 * NAMA     : Muhammad Farhan R
 * KELAS    : IF1
 * NIM      : 10119023
 * Deskripsi Program : latihan menggunakan operator pada bilangan bit
 */
public class IF110119023Latihan14Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Menerapkan operator logika pada bilangan bit contoh:
        0011 or 1100 menjadi 1111
        0110 and 0011 menjadi 0010
        1110 xor 0111 menjadi 1001
        */
        
        int a = 60; // 60 = 0011 1100
        int b = 13; // 13 = 0000 1101
        int c = 0;
        
        c = a & b; //and
        System.out.println("a & b = " + c); // 12 = 0000 1100
        
        c  = a | b; //or
        System.out.println("a | b = " + c); //61 = 0011 1101
        
        c = a ^ b; //xor
        System.out.println("a ^ b = " + c); //49 = 0011 0001
        
        c = ~a; //not
        System.out.println("~a = " + c); //(-61) = 1100 0011
        
        c = a << 2; //shift true vault(left)
        System.out.println("a << 2 = " + c); //240 = 1111 0000
        
        c = a >> 2; //shift true vault(right)
        System.out.println("a >> 2 = " + c); //15 = 0000 1111
    }
    
}
