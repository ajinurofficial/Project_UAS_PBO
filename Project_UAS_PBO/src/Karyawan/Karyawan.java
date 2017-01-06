/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;

/**
 *
 * @author Dewangga P Putra
 */
public class Karyawan {
    private int id;
    private String nama;
    private String alamat;
    private String jk;
    private String email;
    private String telp;
    private int gaji;
    private String jabatan;
    private String status;
    private String agama;
    private String pendidikan;

    public Karyawan() {
    }

    public Karyawan(int id, String nama, String alamat, String jk, String email, String telp, int gaji, String jabatan, String status, String agama, String pendidikan) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.email = email;
        this.telp = telp;
        this.gaji = gaji;
        this.jabatan = jabatan;
        this.status = status;
        this.agama = agama;
        this.pendidikan = pendidikan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

}
