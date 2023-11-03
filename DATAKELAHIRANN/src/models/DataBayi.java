/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


import Keluarga.Read;
import models.DataBayi;
import datakelahirann.Database;
import java.util.List;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
final public class DataBayi {
    public String IdKelahiran;
    public String NamaBayi;
    public String JenisKelamin;
    public String TempatLahir;
    public Date TanggalLahir;
    public Date WaktuLahir;
    public String NoKK;
    public String staff;
    
    

    public String getNamaBayi() {
        return NamaBayi;
    }

    public void setNamaBayi(String NamaBayi) {
        this.NamaBayi = NamaBayi;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getTempatLahir() {
        return TempatLahir;
    }

    public void setTempatLahir(String TempatLahir) {
        this.TempatLahir = TempatLahir;
    }

    public Date getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(Date TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public Date getWaktuLahir() {
        return WaktuLahir;
    }

    public void setWaktuLahir(Date WaktuLahir) {
        this.WaktuLahir = WaktuLahir;
    }

   
    public DataBayi(String IdKelahiran, String NamaBayi, String JenisKelamin,  String  TempatLahir, Date TanggalLahir, Date WaktuLahir, String staff, String NoKK) {
        this.IdKelahiran = IdKelahiran;
        this.NamaBayi = NamaBayi;
        this.JenisKelamin = JenisKelamin;
        this.TempatLahir = TempatLahir;
        this.TanggalLahir = TanggalLahir;
        this.WaktuLahir = WaktuLahir;
        this.NoKK = NoKK;
        this.staff = staff;
    }
     
    public boolean Tambah(){
        Connection conn = Database.configDB();
        String query = "INSERT INTO data_kelahiran (Nama_Bayi, Jenis_Kelamin, Tempat_Lahir, Tanggal_Lahir, Waktu_Lahir, Staff_Id_Staff, Keluarga_No_KK) VALUES (?, ?, ?, ?, ? , ?, ?)";

        try {
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, this.NamaBayi);
                preparedStatement.setString(2, this.JenisKelamin);
                preparedStatement.setString(3, this.TempatLahir);
                preparedStatement.setDate(4, new java.sql.Date(this.TanggalLahir.getTime()));
                preparedStatement.setTime(5, new java.sql.Time(this.WaktuLahir.getTime()));
                preparedStatement.setString(6, this.staff);
                preparedStatement.setString(7, this.NoKK);

                int rowsAffected = preparedStatement.executeUpdate();

                return rowsAffected > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            return false;
        } 
    }
    public DefaultTableModel Read(){
        Connection conn = Database.configDB();
        String query = "SELECT Id_Kelahiran, Nama_Bayi, Jenis_Kelamin, Tempat_Lahir, Tanggal_Lahir, Waktu_Lahir, Staff_Id_Staff, Keluarga_No_KK FROM data_kelahiran";
        DefaultTableModel model = new DefaultTableModel();
        
        // Buat model tabel
        model.addColumn("Id_Kelahiran");
        model.addColumn("Nama_Bayi");
        model.addColumn("Jenis_Kelamin");
        model.addColumn("Tempat_Lahir");
        model.addColumn("Tanggal_Lahir");
        model.addColumn("Waktu_Lahir");
        model.addColumn("Staff_Id_Staff");
        model.addColumn("Keluarga_No_KK");
            
            
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet result = preparedStatement.executeQuery();
            
            while (result.next()) {
                // Ambil data dari hasil query
                String idKelahiran = result.getString("Id_Kelahiran");
                String Nama = result.getString("Nama_Bayi");
                String jenisKelamin = result.getString("Jenis_Kelamin");
                String tempatLahir = result.getString("Tempat_Lahir");
                Date tanggalLahir = result.getDate("Tanggal_Lahir");
                Date waktuLahir = result.getTime("Waktu_Lahir"); 
                String IdStaff = result.getString("Staff_Id_Staff");
                String noKK = result.getString("Keluarga_No_KK");

                // Tambahkan data ke model tabel
                model.addRow(new Object[]{idKelahiran, Nama, jenisKelamin, tempatLahir, tanggalLahir, waktuLahir, IdStaff, noKK});
            }

            // Set model tabel ke jTable2
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return model;
    }   
    
    public boolean Update(){
        Connection conn = Database.configDB();
        String query = "UPDATE data_kelahiran SET Nama_Bayi = ?, Jenis_Kelamin = ?, Tempat_Lahir = ?, Tanggal_Lahir = ?, Waktu_Lahir = ?, Staff_Id_Staff = ?, Keluarga_No_KK = ? WHERE Id_Kelahiran = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, this.NamaBayi);
            preparedStatement.setString(2, this.JenisKelamin);
            preparedStatement.setString(3, this.TempatLahir);
            preparedStatement.setDate(4, new java.sql.Date(this.TanggalLahir.getTime()));
            preparedStatement.setTime(5, new java.sql.Time(this.WaktuLahir.getTime()));
            preparedStatement.setString(6, this.staff);
            preparedStatement.setString(7, this.NoKK);
            preparedStatement.setString(8, this.IdKelahiran);
            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            return false;
        }
    
    }
    

    final public static List<DataBayi> getAllDataBAyi() {
        List<DataBayi> DataBayiList = new ArrayList<>();
        try {
            Connection conn = Database.configDB();
            String query = "SELECT * FROM data_kelahiran";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                DataBayi databayi;
                databayi = new DataBayi(
                        result.getString("Id_Kelahiran"),
                        result.getString("Nama_Bayi"),
                        result.getString("Jenis_Kelamin"),
                        result.getString("Tempat_Lahir"),
                        result.getDate("Tanggal_Lahir"),
                        result.getDate("Waktu_Lahir"),
                        result.getString("Staff_Id_Staff"),
                        result.getString("Keluarga_No_KK")
                );

                DataBayiList.add(databayi);
            }
        } catch (SQLException e) {

        }
        return DataBayiList;
    }
}
