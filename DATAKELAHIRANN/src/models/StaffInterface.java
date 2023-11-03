/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public interface StaffInterface {
    boolean Tambah();
    DefaultTableModel Read();
    boolean Update();
    boolean Delete();
}
