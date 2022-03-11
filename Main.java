/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class Main {
    public static void main(String[] args){
        int choose,p,l,t;
        int back = 0;
        float r;
        Scanner input = new Scanner(System.in);
     
        do{
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.print("Pilih : ");
        choose = input.nextInt();
        
        if (choose == 1){
                System.out.print("Input Panjang: ");
                p = input.nextInt();
                System.out.print("Input Lebar: ");
                l = input.nextInt();
                System.out.print("Input Tinggi: ");
                t = input.nextInt();
                
                Balok beam = new Balok(p,l,t);
                
                System.out.println("Luas Persegi Panjang= " + beam.wide());
                System.out.println("Keliling Persegi Panjang= " + beam.around());
                System.out.println("Volume Balok= " + beam.volume());
                System.out.println("Luas Permukaan Balok= " + beam.area());
                System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
                back = input.nextInt();
        }else if (choose == 2){
                System.out.print("Input Tinggi: ");
                t = input.nextInt();
                System.out.print("Input Jari - jari: ");
                r = input.nextInt();
                
                Tabung tube = new Tabung(r,t);
                
                System.out.println("Luas Lingkaran= " + tube.wide());
                System.out.println("Keliling Lingkaran= " + tube.around());
                System.out.println("Volume Tabung= " + tube.volume());
                System.out.println("Luas Permukaan Tabung= " + tube.area());
                System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
                back = input.nextInt();
        } 
        }while(back == 1);
    }
}
