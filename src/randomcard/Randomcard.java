/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomcard;

/**
 *
 * @author muslim
 */
public class Randomcard {

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

/**
 *
 */
//String A;
//String B;
//String C;
//String D;
//int a
//    String pickCard;
//    int totalpckcard;
//    

        String[] jenisKartu = {
            "krting", "hitam", "hati", "Wajik"
        };

        String[] Angka = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K", "AS"
        };

        // initialize KartuRemi
        int n = jenisKartu.length * Angka.length;
        String[] KartuRemi = new String[n];
        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < jenisKartu.length; j++) {
                KartuRemi[jenisKartu.length * i + j] = Angka[i] + "," + jenisKartu[j];
            }
        }

        // Acak
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = KartuRemi[r];
            KartuRemi[r] = KartuRemi[i];
            KartuRemi[i] = temp;
        }

        // tampiilkan kartu
       
        int jmlOrg = 6;
        int sisa = 52 - (jmlOrg * 8);
        int pakai = jmlOrg * 8;
        int jenis_kartu=4;
        for (int i = 0; i < jmlOrg; i++) {
            System.out.println("** Player " + (i + 1) + " **");
            for (int j = 0; j < 8; j++) {
                System.out.println(KartuRemi[i + j * jenis_kartu] + " (Kartu " + (i + j * jenis_kartu) + ")");
            }
            
        }
        System.out.println("sisa kartu =" + sisa
       
        );
        for (int i = pakai; i < 52; i++) {
            System.out.println(KartuRemi[i]);
        }

    }

}
// TODO code application logic here
