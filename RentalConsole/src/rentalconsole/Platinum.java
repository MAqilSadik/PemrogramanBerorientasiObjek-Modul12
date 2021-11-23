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
public class Platinum extends Gold {
    
    int bonus;
    
    Platinum(){
        biaya = 45000;
        point = 10;
        diskon = 3;
        cashback = 10000;
    }
    
    protected int bonus(int lamaRental){
        
        bonus =lamaRental * 5000;
        return bonus;
    }

}
