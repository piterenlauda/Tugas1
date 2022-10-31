/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_6;
import java.util.Scanner;
/**
 *
 * @author 21102058 Peter Enlarga Lauda
 */
public class TugasMethodProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dtain = new Scanner(System.in);
        Kasir KS = new Kasir ();
        
        //set Selamat Datang
        System.out.print("Jumlah Pelanggan?: ");
        String seda = dtain.nextLine();
        KS.SetSd(Integer.parseInt(seda));
        
        //get Selamat Datang
        System.out.println(KS.GetSd());
        
        //set Identitas Kasir
        System.out.print("Masukan Nama Kasir: ");
        KS.SetNamaKasir(dtain.nextLine());
        System.out.print("Masukan Alamat Kasir: ");
        KS.SetAlamatKasir(dtain.nextLine());
        System.out.print("Masukan Umur Kasir: ");
        String uk = dtain.nextLine();
        KS.SetUmurKasir(Integer.parseInt(uk));
        System.out.print("Masukan Tinggi Kasir: ");
        String tk = dtain.nextLine();
        KS.SetTinggiKasir(Integer.parseInt(tk));
        
        //get Identitas Kasir
        System.out.println("Nama Kasir: "+ KS.GetNamaKasir());
        System.out.println("Alamat Kasir: "+ KS.GetAlamatKasir());
        System.out.println("Umur Kasir: "+ KS.GetUmurKasir());
        System.out.println("Tinggi Kasir: "+ KS.GetTinggiKasir());
        
        //set Nama Harga
        System.out.print("Masukan Nama Barang Pertama: ");
        KS.SetNamaBarang1(dtain.nextLine());
        System.out.print("Masukan Nama Barang Kedua: ");
        KS.SetNamaBarang2(dtain.nextLine());
        System.out.print("Masukan Nama Barang Ketiga: ");
        KS.SetNamaBarang3(dtain.nextLine());
        
        System.out.print("Masukan Harga Barang Pertama: ");
        String a = dtain.nextLine();
        KS.SetHargaBarang1(Integer.parseInt(a));
        
        System.out.print("Masukan Harga Barang Kedua: ");
        String b = dtain.nextLine();
        KS.SetHargaBarang2(Integer.parseInt(b));
        
        System.out.print("Masukan Harga Barang Ketiga: ");
        String c = dtain.nextLine();
        KS.SetHargaBarang3(Integer.parseInt(c));
        
        int Total = KS.GetHargaBarang1()+KS.GetHargaBarang2()+KS.GetHargaBarang3();
        
        //get Nama Harga
        System.out.println("Nama Barang Pertama: "+ KS.GetNamaBarang1());
        System.out.println("Nama Barang Kedua: "+ KS.GetNamaBarang2());
        System.out.println("Nama Barang Ketiga: "+ KS.GetNamaBarang3());
        System.out.println("Nama Harga Pertama: "+ KS.GetHargaBarang1());
        System.out.println("Nama Harga Kedua: "+ KS.GetHargaBarang2());
        System.out.println("Nama Harga Ketiga: "+ KS.GetHargaBarang3());
        System.out.println("Total: "+ Total);
        
        //set Diskon
        KS.SetTotal(Total);
        
        //get Diskon
        System.out.println(KS.GetTotal());
        
        //set Terima Kasih
        System.out.print("Rate Toko Kami (1-5?): ");
        String teka = dtain.nextLine();
        KS.SetTk(Integer.parseInt(teka));
        
        //get Terima Kasih
        System.out.println(KS.GetTk());
    }
}
