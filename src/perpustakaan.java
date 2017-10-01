
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praktikum
 */
public class perpustakaan {
    private ArrayList<buku> listBuku ;

    public  perpustakaan() {
    listBuku = new ArrayList<>();
    }
    public void addBuku(buku b){
       listBuku.add(b);
    }
    public buku cariBuku(String judul){
        for (buku b : listBuku){
            if (b.getJudul().equals(judul)) {
                return b;
            }
        }
        return null;
    }
    
    public void tambahStok(buku b,String judul,int stok){
        cariBuku(judul).setStock(stok);
    }
    public void kurangStok(buku b){
       int i = b.getStock();
        i--;
        b.setStock(i);
    }
    
    public void pinjamBuku(String judul){
        buku b  = cariBuku(judul);
        kurangStok(b);
    }
    
    
}
