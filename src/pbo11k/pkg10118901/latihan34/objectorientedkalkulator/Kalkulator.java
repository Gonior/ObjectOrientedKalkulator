/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan34.objectorientedkalkulator;

/**
 *
 * @author 
 * NAMA                 : Dedi Cahya
 * KELAS                : PBO11K
 * NIM                  : 10118901
 * Deskripsi Program    : Membuat user login dengan konsep orientasi objek
 * 
 */
public class Kalkulator {
    public double value1;
    public double value2;
    
    public double tambahBilangan() {
        return value1 + value2;
    }
    public double kurangBilangan() {
        return value1 - value2;
    }
    public double kaliBilangan() {
        return value1 * value2;
    }
    public double bagiBilangan() {
        return value1/value2;
    }
    public double sisaBilangan() {
        return value1 % value2;
    }
}
