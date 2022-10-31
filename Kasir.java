/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;

/**
 *
 * @author 21102058 Peter Enlarga Lauda
 */
public class Kasir {
    private int Sd;
    private String NamaKasir, AlamatKasir;
    private int UmurKasir, TinggiKasir;
    private String NamaBarang1, NamaBarang2, NamaBarang3;
    private int HargaBarang1, HargaBarang2, HargaBarang3;
    private int Tk;
    private int Total;
    
    public void SetNamaBarang1(String nb1){
        this.NamaBarang1 = nb1;
    }
    
    public void SetNamaBarang2(String nb2){
        this.NamaBarang2 = nb2;
    }
    
    public void SetNamaBarang3(String nb3){
        this.NamaBarang3 = nb3;
    }
    
    public void SetHargaBarang1(int hb1){
        this.HargaBarang1 = hb1;
    }
    
    public void SetHargaBarang2(int hb2){
        this.HargaBarang2 = hb2;
    }
    
    public void SetHargaBarang3(int hb3){
        this.HargaBarang3 = hb3;
    }
    
    public String GetNamaBarang1(){
        return this.NamaBarang1;
    }
    
    public String GetNamaBarang2(){
        return this.NamaBarang2;
    }
    
    public String GetNamaBarang3(){
        return this.NamaBarang3;
    }
    
    public int GetHargaBarang1(){
        return this.HargaBarang1;
    }
    
    public int GetHargaBarang2(){
        return this.HargaBarang2;
    }
    
    public int GetHargaBarang3(){
        return this.HargaBarang3;
    }
    
    public void SetSd (int sd){
        this.Sd = sd;
        int br = 0;
        while(br<sd){
            System.out.println("Selamat Datang ");
            br++;
        }
    }
    
    public int GetSd(){
        return this.Sd;
    }
    
    public void SetTk (int tk){
        this.Tk = tk;
        int aw;
        for(aw=0;aw<tk;aw++){
            System.out.println("Terima Kasih ");
        }
    }
    
    public int GetTk(){
        return this.Tk;
    }
    
    public void SetNamaKasir (String nk){
        this.NamaKasir = nk;
    }
    
    public void SetAlamatKasir (String ak){
        this.AlamatKasir = ak;
    }
    
    public void SetUmurKasir (int uk){
        this.UmurKasir = uk;
    }
    
    public void SetTinggiKasir (int tk){
        this.TinggiKasir = tk;
    }
    
    public String GetNamaKasir (){
        return this.NamaKasir;
    }
    
    public String GetAlamatKasir (){
        return this.AlamatKasir;
    }
    
    public int GetUmurKasir (){
        return this.UmurKasir;
    }
    
    public int GetTinggiKasir (){
        return this.TinggiKasir;
    }
    
    public void SetTotal (int t){
        this.Total = t;
        int d = t-20000;
        if (t>100000){
            System.out.println("Anda mendapat diskon Rp. 20000 dan piring plastik, total: "+ d);
        }
        else{
            System.out.println("Anda tidak mendapat diskon");
        }
    }
    
    public int GetTotal (){
        return this.Total;
    }
}
