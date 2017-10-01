
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
public class anggota extends orang{
    
    private String nim;
    private String fakultas;
    private String userName;
    private String password;
    private ArrayList<buku> pinjamBuku ;

    public String getNim() {
        return nim;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public buku findBuku(String judul){
        for (buku b : pinjamBuku) {
            if (b.getJudul().equals(judul)) {
                return b;
            }
        }
        return null;
    }
    
    public void hapusListPinjam(String judul){
        pinjamBuku.remove(findBuku(judul));
    }
    
    
    public anggota(String nama, char jk, String nim, String fakultas, String userName, String password) {
      super.setNama(nama);
      super.setJk(jk);
      this.nim = nim;
      this.fakultas = fakultas;
      this.userName = userName;
      this.password = password;
      this.pinjamBuku = new ArrayList<>();
    }
    
    public void pinjaamBuku(buku b){
        this.pinjamBuku.add(b);
    }
    
    
    
    
    

    
}
