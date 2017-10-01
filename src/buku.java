/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praktikum
 */
public class buku {
    private String judul;
    private int tahunTerbit;
    private String penerbit;
    private String penulis;
    private int stock = 0;

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getStock() {
        return stock;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public buku(String judul, int tahunTerbit, String penerbit, String penulis) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
    
}
