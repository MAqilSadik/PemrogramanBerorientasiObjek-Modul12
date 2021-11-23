/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */
public class Member {
    static Map<String, List<String>> dataMember = new HashMap<String, List<String>>();
    static int waktuRental;
    
    static void insertMember() {
    
       List<String> valueOne = new ArrayList<>();
       valueOne.add("Mr. X");
       valueOne.add("Silver");
   
       List<String> valueTwo = new ArrayList<>();
       valueTwo.add("Mr. Y");
       valueTwo.add("Gold");
       
       List<String> valueThree = new ArrayList<>();
       valueThree.add("Mr. Z");
       valueThree.add("Platinum");
       
        dataMember.put("M001", valueOne);
        dataMember.put("M002", valueTwo);
        dataMember.put("M003", valueThree);
    }
    
            static void searchMember(String idMember) {       
         
        if(!dataMember.containsKey(idMember)) {
            System.out.println("Belum terdaftar sebagai member");
        } else {
            
            dataMember.entrySet().stream().filter((entry) -> (entry.getKey().equals(idMember))).map((entry) -> {
                String key = entry.getKey();
                List<String> values = entry.getValue();
                System.out.println("\n| ID Member                        | : " + key);
                System.out.println("| Nama Member                      | : " + values.get(0));
                return values;
            }).forEachOrdered((values) -> {
                System.out.println("| Jenis Member                     | : " + values.get(1));
            });
        }
    }
        static String getJenisMember(String idMember) {
        
        String jenisMember = null;
        if(dataMember.containsKey(idMember)) {
            for(Map.Entry<String, List<String>> entry : dataMember.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                List<String> values = entry.getValue();               
                jenisMember = values.get(1);
                }
            }
        }
        return jenisMember;
    }
          static int durasiRental(int dateRent, int monthRent, int yearRent, int dateReturn, int monthReturn, int yearReturn) {
        
        if(yearReturn >= yearRent) {
            if(monthReturn >= monthRent) {
                
                    LocalDateTime rent = LocalDateTime.of(yearRent, monthRent, dateRent, 23, 59, 59);
                    LocalDateTime returned = LocalDateTime.of(yearReturn, monthReturn, dateReturn, 23, 59, 59);

                    Duration duration = Duration.between(rent, returned);
        
                   waktuRental = (int) duration.toDays();
                 
            } else {
                System.out.println("Tanggal tidak valid, silakan ulangi ");
            }
        } else {
            System.out.println("Tanggal tidak valid, silakan ulangi ");
        }
        
        return waktuRental;
    }
    
}
    