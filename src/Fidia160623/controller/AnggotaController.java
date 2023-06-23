/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fidia160623.controller;
import Fidia160623.model.*;
import java.util.*;
import Fidia160623.view.*;
import javax.swing.table.DefaultTableModel;
import Fidia160623.dao.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AnggotaController {
    FormAnggota view;
    Anggota anggota;
    AnggotaDao dao;
//    private Vector<?> row;
    
    public AnggotaController(FormAnggota view){
        this.view = view;
        dao = new AnggotaDaoImple();
    }
    public void clearForm(){
        view.getTxtKodeAnggota().setText("");
        view.getTxtNamaAnggota().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");
    }
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) view.getTableAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = dao.getAll();
        for(Anggota a : list){
            Object[] row = {
                a.getKodeAnggota(),
                a.getNamaAnggota(),
                a.getAlamat(),
                a.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }
    }
   
    public void insert(){
        anggota = new Anggota();
        anggota.setKodeAnggota(view.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.insert(anggota);
        JOptionPane.showMessageDialog(view,"Entri Data Ok");
    }
    
    public void getAnggota(){
        int index = view.getTableAnggota().getSelectedRow();
        anggota = dao.getAnggota(index);
        view.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
        view.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
        view.getTxtAlamat().setText(anggota.getAlamat());
        view.getCboJenisKelamin().setSelectedItem(anggota.getJenisKelamin());
    }
    
        public void update(){
        int index = view.getTableAnggota().getSelectedRow();
        anggota.setKodeAnggota(view.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.update(index,anggota);
        JOptionPane.showMessageDialog(view,"Update Data Ok");
    }
        
        public void delete(){
            int index = view.getTableAnggota().getSelectedRow();
            dao.delete(index);
            JOptionPane.showMessageDialog(view, "Delete Dsata Ok");
        }
}

