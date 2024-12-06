/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import domain.Termin;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author x
 */
public class ModelTabeleTermini extends AbstractTableModel {
    private List<Termin> listaTermina=new ArrayList<>();
    private final String[] kolone={"datum","pocinje","zavrsava","zakazan"};

    public ModelTabeleTermini() {
    }

    public ModelTabeleTermini(List<Termin> listaTermina){
        this.listaTermina=listaTermina;
        sortListaTermina();
    }

    public List<Termin> getListaTermina() {
        return listaTermina;
    }

    public void setListaTermina(List<Termin> listaTermina) {
        this.listaTermina = listaTermina;
        sortListaTermina();
        fireTableDataChanged();
    }
    
    
    
    @Override
    public int getRowCount() {
        return listaTermina.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Termin t=listaTermina.get(rowIndex);
        switch (columnIndex) {
            case 0:
                Date datum=t.getDatum();
                SimpleDateFormat smf=new SimpleDateFormat("dd.MM.yyyy");
                String datumStr=smf.format(datum);
                return datumStr;
            case 1:
                return t.getVremePocetka();
            case 2:
                return t.getVremeZavrsetka();
            case 3:
                if(t.isZakazan()){
                    return "ZAKAZAN";
                }
                else{
                    return "SLOBODAN";
                }
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    

    public void ukloniTermin(Termin t) {
        listaTermina.remove(t);
        fireTableDataChanged();
    }

    public void osveziTabelu() {
        fireTableDataChanged();
    }

    private void sortListaTermina() {
        Collections.sort(listaTermina, new Comparator<Termin>() {
        @Override
        public int compare(Termin t1, Termin t2) {
            int dateComparison = t1.getDatum().compareTo(t2.getDatum());
            if (dateComparison != 0) {
                return dateComparison;
            } else {
                return t1.getVremePocetka().compareTo(t2.getVremePocetka());
            }
        }
    });
    }
        
    
    
}
