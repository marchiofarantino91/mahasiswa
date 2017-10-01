/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praktikum
 */
public class petugas extends orang{
    private String userName;
    private String password;

    public petugas(String nama,char jk,String userName, String password) {
        super.setNama(nama);
        super.setJk(jk);
        this.userName = userName;
        this.password = password;
    }
    
    public void tambahBuku(perpustakaan p,buku b){
        p.addBuku(b);
    }
    
    
    
}
