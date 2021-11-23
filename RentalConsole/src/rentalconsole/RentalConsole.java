/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class RentalConsole extends Member {

    public static void main(String[] args) {
        
        Silver sm = new Silver();
        Gold gm = new Gold();
        Platinum pm = new Platinum();
        
        insertMember();
        
        String idMember;
        int dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn;
        Scanner input = new Scanner(System.in); 
        
        System.out.println("  Program Pengembalian Console Game Rental  ");
        
        System.out.print("\n Masukkan ID Member                : ");
        idMember = input.nextLine();
        
        System.out.print("\n Masukkan Tanggal Pinjam (1 - 31)  : ");
        dateRent = input.nextInt();
        
        System.out.print("Masukkan Bulan Pinjam (1 - 12)       : ");
        monthRent = input.nextInt();
        
        System.out.print("Masukkan Tahun Pinjam                : ");
        yearRent = input.nextInt();
        
        System.out.print("\n Masukkan Tanggal Kembali (1 - 31) : ");
        dateReturn = input.nextInt();
        
        System.out.print(" Masukkan Bulan Kembali (1 - 12)     : ");
        monthReturn = input.nextInt();
        
        System.out.print(" Masukkan Tahun Kembali              : ");
        yearReturn = input.nextInt();
        
         System.out.println("\n");
        searchMember(idMember);
        
        
        System.out.println("\n");
        System.out.println("\n Tanggal Pinjam                    : " + dateRent + " - " + monthRent + " - " + yearRent);
        System.out.println(" Tanggal Kembali                     : " + dateReturn + " - " + monthReturn + " - " + yearReturn);
        
        int lamaRental = durasiRental(dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn);
        System.out.println("| Lama Sewa                        | : " + lamaRental + " hari");
        
        
        String jenisMember = getJenisMember(idMember);
        if (jenisMember == "Silver"){
            System.out.println("\n Total Sewa                       | : Rp. " + sm.biayaSewa(lamaRental));
            System.out.println(" Jumlah Poin                      | : " + sm.point(lamaRental));
        
        } else if(jenisMember == "Gold") {
            System.out.println("\n Total Sewa                       | : Rp. " + gm.biayaSewa(lamaRental));
            System.out.println(" Jumlah Poin                      | : " + gm.point(lamaRental));
            System.out.println(" Jumlah Cashback                  | : " + gm.cashback);
            
        } else {
            System.out.println("\n Total Sewa                        : Rp. " + pm.biayaSewa(lamaRental));
            System.out.println(" Jumlah Poin                         : " + pm.point(lamaRental));
            System.out.println(" Jumlah Cashback                     : " + pm.cashback);
            System.out.println(" Bonus Pulsa                         : " + pm.bonus(lamaRental));
        
       }
    }
   }
