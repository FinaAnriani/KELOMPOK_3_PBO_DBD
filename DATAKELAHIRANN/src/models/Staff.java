/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import datakelahirann.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
final public class Staff extends Database {

    public String idStaff;
    public String namaStaff;
    public String noHpStaff;
    public String jabatanStaff;
    public String staffIdStaff;

    public Staff(String idStaff, String namaStaff, String noHpStaff, String jabatanStaff, String staffIdStaff) {
        this.idStaff = idStaff;
        this.namaStaff = namaStaff;
        this.noHpStaff = noHpStaff;
        this.jabatanStaff = jabatanStaff;
        this.staffIdStaff = staffIdStaff;
    }

    public Staff getAtasan() {
        try {
            Connection conn = Database.configDB();
            String query = "SELECT * FROM staff WHERE Staff_Id_Staff = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            preparedStatement.setString(1, this.staffIdStaff);
            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                return new Staff(
                        result.getString("Id_Staff"),
                        result.getString("Nama_Staff"),
                        result.getString("No_HP"),
                        result.getString("Jabatan"),
                        result.getString("Staff_Id_Staff")
                );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }       
        return null;
    }
    
    public boolean Tambah(){
        Connection conn = Database.configDB();
        String query = "INSERT INTO staff (Id_Staff, Nama_Staff, No_HP, Jabatan, Staff_Id_Staff) VALUES (?, ?, ?, ?, ?)";

        try {
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, this.idStaff);
                preparedStatement.setString(2, this.namaStaff);
                preparedStatement.setString(3, this.noHpStaff);
                preparedStatement.setString(4, this.jabatanStaff);
                preparedStatement.setString(5, this.staffIdStaff);


                int rowsAffected = preparedStatement.executeUpdate();

                return rowsAffected > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            return false;
        } 
    }
    
    public DefaultTableModel Read() {
    Connection conn = Database.configDB();
    String query = "SELECT Id_Staff, Nama_Staff, No_HP, Jabatan, Staff_Id_Staff FROM staff";
    DefaultTableModel model = new DefaultTableModel();

    // Buat model tabel
    model.addColumn("Id_Staff");
    model.addColumn("Nama_Staff");
    model.addColumn("No_HP");
    model.addColumn("Jabatan");
    model.addColumn("Staff_Id_Staff");

    try {
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery();

        while (result.next()) {
            // Ambil data dari hasil query
            String idStaff = result.getString("Id_Staff");
            String Nama = result.getString("Nama_Staff");
            String noHP = result.getString("No_HP");
            String jabatan = result.getString("Jabatan");
            String staffIdStaff = result.getString("Staff_Id_Staff");

            // Tambahkan data ke model tabel
            model.addRow(new Object[]{idStaff, Nama, noHP, jabatan, staffIdStaff});
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }

    return model;
    }

    
    public boolean Update(){
        Connection conn = Database.configDB();
        String query = "UPDATE staff SET Nama_Staff = ?, No_HP = ?, Jabatan = ?, Staff_Id_Staff = ? WHERE Id_Staff = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, this.namaStaff);
            preparedStatement.setString(2, this.noHpStaff);
            preparedStatement.setString(3, this.jabatanStaff);
            preparedStatement.setString(4, this.staffIdStaff);
            preparedStatement.setString(5, this.idStaff);
            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            return false;
        }
    
    }
    public boolean Delete() {
    Connection conn = Database.configDB();
    String query = "DELETE FROM staff WHERE Id_Staff = ?";

    try {
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, this.idStaff);

        int rowsAffected = preparedStatement.executeUpdate();

        return rowsAffected > 0;
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        return false;
    }
    }

    
    final public static List<Staff> getAllStaff() {
        List<Staff> StaffList = new ArrayList<>();
        try {
            Connection conn = Database.configDB();
            String query = "SELECT * FROM data_kelahiran";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                Staff staff;
                staff = new Staff(
                    result.getString("Id_Staff"),
                        result.getString("Nama_Staff"),
                        result.getString("No_Hp"),
                        result.getString("Jabatan"),
                        result.getString("Staff_Id_Staff")
                );
                StaffList.add(staff);
            }
        } catch (SQLException e) {
        }        return StaffList;
    }

    public int idStaff() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
