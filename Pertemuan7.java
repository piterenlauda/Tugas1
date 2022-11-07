/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_7;
import java.util.Scanner;

/**
 *
 * @author 21102058 Peter Enlarga Lauda
 */
public class Pertemuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aritmatika AM = new Aritmatika();
        Scanner dtain = new Scanner(System.in);
        
        System.out.print("Bilangan Pertama: ");
        String bil1 = dtain.nextLine();
        Integer.parseInt(bil1);
        System.out.print("Bilangan Kedua: ");
        String bil2 = dtain.nextLine();
        Integer.parseInt(bil2);
        
        System.out.println("Aritmatika: ");
        System.out.println("1. Penjumlahan: ");
        System.out.println("2. Pengurangan: ");
        System.out.println("3. Perkalian: ");
        System.out.println("4. Pembagian: ");
        System.out.print("Pilih(1-4)?: ");
        String pil = dtain.nextLine();
        Integer.parseInt(pil);
        if (Integer.parseInt(pil)==1){
            AM.tambah((Integer.parseInt(bil1)), (Integer.parseInt(bil2)));
            System.out.println("Hasil Penjumlahan: "+AM.hasil);
        }
        
        if (Integer.parseInt(pil)==2){
            AM.kurang((Integer.parseInt(bil1)), (Integer.parseInt(bil2)));
            System.out.println("Hasil Pengurangan: "+AM.hasil);
        }
        
        if (Integer.parseInt(pil)==3){
            AM.kali((Integer.parseInt(bil1)), (Integer.parseInt(bil2)));
            System.out.println("Hasil Perkalian: "+AM.hasil);
        }
        
        if (Integer.parseInt(pil)==4){
            AM.bagi((Integer.parseInt(bil1)), (Integer.parseInt(bil2)));
            if ((Integer.parseInt(bil2))==0){
                System.out.println("Error666");
            }
            else{
                System.out.println("Hasil Perkalian: "+AM.hasil);
            }
        }
        else{
            System.out.println("Error666");
        }
    }  
}
