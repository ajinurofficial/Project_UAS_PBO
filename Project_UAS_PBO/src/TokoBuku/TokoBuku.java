/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoBuku;

/**
 *
 * @author Asti Amalina
 */
public class TokoBuku {
    private int id;
    private String judul;
    private String kategori;
    private String pengarang;
    private String penerbit;
    private int tahun;
    private int isbn;
    private int harga;
    private int jml_hal;
    private int terbitan;

    public TokoBuku() {
    }

    public TokoBuku(int id, String judul, String kategori, String pengarang, String penerbit, int tahun, int isbn, int harga, int jml_hal, int terbitan) {
        this.id = id;
        this.judul = judul;
        this.kategori = kategori;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.isbn = isbn;
        this.harga = harga;
        this.jml_hal = jml_hal;
        this.terbitan = terbitan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJml_hal() {
        return jml_hal;
    }

    public void setJml_hal(int jml_hal) {
        this.jml_hal = jml_hal;
    }

    public int getTerbitan() {
        return terbitan;
    }

    public void setTerbitan(int terbitan) {
        this.terbitan = terbitan;
    }
    
}
