/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MSW98
 */
public class Mahasiswa {
    String nama;
    String nim;

    Mahasiswa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
    public Mahasiswa(String nama, String nim){
        this.nama=nama;
        this.nim=nim;
    }
    
    
    
}
