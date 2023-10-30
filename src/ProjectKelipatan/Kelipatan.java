/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
NAMA : FAJAR KRISDIANTORO
NIM  : 22205004
PRODI: TI REG SORE
*/

package ProjectKelipatan;

/**
 *
 * @author LENOVO
 */
public class Kelipatan {
    public static void main(String[] args) {
        double awal = 3.5;
        double akhir = 35.0;

        System.out.println("Bilangan kelipatan desimal 3.5 antara " + awal + " dan " + akhir + " adalah:");

        for (double i = awal; i <= akhir; i += 3.5) {
            System.out.println(i);
        }
    }
}
