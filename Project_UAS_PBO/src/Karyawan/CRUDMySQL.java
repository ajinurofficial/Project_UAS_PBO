/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Pradana C
 */
public class CRUDMySQL implements CRUDIface{

    private Connection conn;
    
    @Override
    public void bukaKoneksi() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/karyawan","root","");
    }

    @Override
    public void tutupKoneksi() throws SQLException {
        conn.close();
    }

    @Override
    public ArrayList<Karyawan> read() throws SQLException {
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from karyawan");
        ArrayList<Karyawan> list= new ArrayList();
        while (rs.next()){
            Karyawan kry = new Karyawan();
            kry.setId(rs.getInt(1));
            kry.setNama(rs.getString(2));
            kry.setAlamat(rs.getString(3));
            kry.setJk(rs.getString(4));
            kry.setEmail(rs.getString(5));
            kry.setTelp(rs.getString(6));
            kry.setGaji(rs.getInt(7));
            kry.setJabatan(rs.getString(8));
            kry.setStatus(rs.getString(9));
            kry.setAgama(rs.getString(10));
            kry.setPendidikan(rs.getString(11));
            list.add(kry);
        }
        return list;        
    }

    @Override
    public Karyawan readById(int id) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select * from karyawan where id=?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Karyawan karyawan = new Karyawan();
        while (rs.next()){
            karyawan.setId(rs.getInt(1));
            karyawan.setNama(rs.getString(2));
            karyawan.setAlamat(rs.getString(3));
            karyawan.setJk(rs.getString(4));
            karyawan.setEmail(rs.getString(5));
            karyawan.setTelp(rs.getString(6));
            karyawan.setGaji(rs.getInt(7));
            karyawan.setJabatan(rs.getString(8));
            karyawan.setStatus(rs.getString(9));
            karyawan.setAgama(rs.getString(10));
            karyawan.setPendidikan(rs.getString(11));
        }
        return karyawan;
    }

    @Override
    public void create(Karyawan ba) throws SQLException {
        String query = "insert into karyawan(nama,alamat,jk,email,telp,gaji,jabatan,status,agama,pendidikan)values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, ba.getNama());
        ps.setString(2, ba.getAlamat());
        ps.setString(3, ba.getJk());
        ps.setString(4, ba.getEmail());
        ps.setString(5, ba.getTelp());
        ps.setInt(6, ba.getGaji());
        ps.setString(7, ba.getJabatan());
        ps.setString(8, ba.getStatus());
        ps.setString(9, ba.getAgama());
        ps.setString(10, ba.getPendidikan());
        ps.execute();
    }

    @Override
    public void delete(Karyawan ba) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("delete from karyawan where id=?");
        ps.setInt(1, ba.getId());
        ps.execute();
    }

    @Override
    public void update(Karyawan ba) throws SQLException {
        String query = "update karyawan set nama=?, alamat=?, jk=?, email=?, telp=?, gaji=?, jabatan=?, status=?, agama=?, pendidikan=? where id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, ba.getNama());
        ps.setString(2, ba.getAlamat());
        ps.setString(3, ba.getJk());
        ps.setString(4, ba.getEmail());
        ps.setString(5, ba.getTelp());
        ps.setInt(6, ba.getGaji());
        ps.setString(7, ba.getJabatan());
        ps.setString(8, ba.getStatus());
        ps.setString(9, ba.getAgama());
        ps.setString(10, ba.getPendidikan());
        ps.setInt(11, ba.getId());
        ps.execute();
    }
}
