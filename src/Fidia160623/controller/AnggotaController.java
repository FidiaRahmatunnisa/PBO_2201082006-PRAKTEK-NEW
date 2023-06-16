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
        view.getTxtKodeAngota().setText("");
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
   
}

