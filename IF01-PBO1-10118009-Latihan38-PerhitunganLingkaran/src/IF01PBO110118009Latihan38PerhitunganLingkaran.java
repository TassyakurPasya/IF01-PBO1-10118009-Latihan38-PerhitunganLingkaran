
import java.util.Scanner;

/*
 * NAMA              : Tassyakur Pasya
 * KELAS             : IF-01
 * NIM               : 10118009
 * DESKRIPSI PROGRAM : Perhitungan Lingkaran
 */

public class IF01PBO110118009Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static double diameter;
    public static double jari2;
    public static double keliling;
    public static double luas;
    public static double hitungKeliling(){
        keliling = 3.14 * diameter;
        return keliling;
    }
    
    public static double hitungLuas(){
        jari2 = diameter /2;
        luas = 3.14 * Math.pow(jari2, 2);
        return luas;
    }
    public static void main(String[] args) {
        String validasi;
        boolean valid = false;
        
        Scanner nilai = new Scanner(System.in);
        
        do {
            System.out.println("=====Perhitungan Lingkaran=====");
            System.out.print("Masukan nilai diameter lingkaran = ");
            validasi = nilai.nextLine();
            
            if(validasi.matches("[0-9]*")){
              diameter = Integer.parseInt(validasi);
              System.out.println("=====Hasil Perhitungan=====");
              System.out.println("Jari-jari Lingkaran = " + (diameter/2) +" cm");
              System.out.println("Luas lingkaran = " + hitungLuas() + " cm");
              System.out.println("Keliling Lingkaran = " +hitungKeliling()  + " cm");
              valid = true;
            }
            else{
                System.out.println("Nilai Diamater Tidak Sesuai");    
            }  
        }while(!valid);
    }

}
