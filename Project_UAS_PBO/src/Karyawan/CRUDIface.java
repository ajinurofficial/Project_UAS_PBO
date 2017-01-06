/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;


import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dewangga P Putra
 */
public interface CRUDIface {
    public void bukaKoneksi() throws ClassNotFoundException, SQLException;
    public void tutupKoneksi() throws SQLException;
    public ArrayList<Karyawan> read() throws SQLException;
    public Karyawan readById (int id) throws SQLException;
    public void create(Karyawan ba) throws SQLException;
    public void delete(Karyawan ba) throws SQLException;
    public void update(Karyawan ba) throws SQLException;
}
