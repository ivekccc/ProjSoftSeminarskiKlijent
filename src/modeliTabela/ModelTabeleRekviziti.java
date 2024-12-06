/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import domain.Rekvizit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author x
 */
public class ModelTabeleRekviziti extends AbstractTableModel {

    private List<Rekvizit> listaRekvizita=new ArrayList<>();
    private final String[] kolone={"tip","naziv","marka","kolicina"};
    
    public ModelTabeleRekviziti(List<Rekvizit> listRekvizita) {
        this.listaRekvizita=listRekvizita;
    }

    public ModelTabeleRekviziti() {
    }

    public List<Rekvizit> getListaRekvizita() {
        return listaRekvizita;
    }
    
    
    @Override
    public int getRowCount() {
        return listaRekvizita.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Rekvizit rekvizit=listaRekvizita.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rekvizit.getTipRekvizita().getNazivTipa();
            case 1:
                return rekvizit.getNaziv();
            case 2:
                return rekvizit.getMarka();
            case 3:
                return rekvizit.getKolicina();
            default:
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public void osveziTabelu() {
        fireTableDataChanged();
    }
    
}
