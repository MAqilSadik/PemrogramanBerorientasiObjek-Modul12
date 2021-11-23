/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

/**
 *
 * @author User
 */
public class Silver extends Member {
    protected int biaya;
    protected int lama;
    protected int point;
    protected int diskon;
    protected int totalDiskon;
    protected int totalBiaya;
    protected int biayaAwal;
    protected int biayaSewa;
    
    Silver(){
        this.biaya = 25000;
        this.point = 1;
        this.diskon = 1;
    }
    
    protected int biayaSewa(int lamaRental){
       biayaAwal= lama * biaya;
       totalDiskon = (biayaAwal * diskon ) / 100;
       totalBiaya = biayaAwal - totalDiskon;
       
       return totalBiaya;
    }
    
   protected int point(int lamaRental){
       
       int totalPoint = lamaRental * point;
       
       return totalPoint;
        
    }
}
