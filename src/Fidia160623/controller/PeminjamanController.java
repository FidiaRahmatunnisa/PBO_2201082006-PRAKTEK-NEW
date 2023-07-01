/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fidia160623.controller;
import Fidia160623.model.*;
import Fidia160623.dao.*;
import Fidia160623.view.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class PeminjamanController {
    FormPeminjaman view;
    Peminjaman peminjaman;
    PeminjamanDao dao;

    public PeminjamanController(FormPeminjaman view) {
        this.view = view;
        dao = new PeminjamanDaoImple();
    }
    
    //buat clearForm
    public void clearForm(){
        view.getKodeAnggota().setText("");
        view.getKodeBuku().setText("");
        view.getTglPinjam().setText("");
        view.getTglKembali().setText("");
    }
    
    //buat tampilan
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel)view.getTabelPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = dao.getAll();
        for(Peminjaman c : list){
           Object[] row = {
               c.getKodeAnggota(),
               c.getKodeBuku(),
               c.getTglPinjam(),
               c.getTglKembali()
           };
           tabelModel.addRow(row);
        }
    }
    
    //aktif buton insert
    public void insert(){
        peminjaman = new Peminjaman();
        peminjaman.setKodeAnggota(view.getKodeAnggota().getText());
        peminjaman.setKodeBuku(view.getKodeBuku().getText());
        peminjaman.setTglPinjam(view.getTglPinjam().getText());  // perlakuan ke tipe selain string beda
        peminjaman.setTglKembali(view.getTglKembali().getText());
        dao.insert(peminjaman);
        JOptionPane.showMessageDialog(view, "Data Insert OK!");
    }
    
    // aktif buton update
    public void update(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        peminjaman.setKodeAnggota(view.getKodeAnggota().getText());
        peminjaman.setKodeBuku(view.getKodeBuku().getText());
        peminjaman.setTglPinjam(view.getTglPinjam().getText());
        peminjaman.setTglKembali(view.getTglKembali().getText());
        dao.update(index, peminjaman);
        JOptionPane.showMessageDialog(view, "Data Update OK!");
    }
    
    // buton delete
    public void delete(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view, "Data Delete OK!");
    }
    
    // data gel All
    public void getPeminjaman(){
        int index = view.getTabelPeminjaman().getSelectedRow();
        peminjaman = dao.getPeminjaman(index);
        view.getKodeAnggota().setText(peminjaman.getKodeAnggota());
        view.getKodeBuku().setText(peminjaman.getKodeBuku());
        view.getTglPinjam().setText(peminjaman.getTglPinjam());
        view.getTglKembali().setText(peminjaman.getTglPinjam());
        
    }
    
    
    
    
    
}
