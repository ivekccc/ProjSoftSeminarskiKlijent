/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import domain.Korisnik;
import transfer.Response;
/**
 *
 * @author x
 */
public class ModelTabeleKorisnici extends AbstractTableModel {
    private List<Korisnik> listaKorisnika=new ArrayList<>();
    private final String[] kolone={"ime","prezime","email","broj telefona","broj otkazivanja"};

    public ModelTabeleKorisnici() {
    }

    public ModelTabeleKorisnici(List<Korisnik> listaKorisnika){
        this.listaKorisnika=listaKorisnika;
        sortListaKorisnika();
    }

    public List<Korisnik> getListaKorisnika() {
        return listaKorisnika;
    }

    public void setListaKorisnika(List<Korisnik> listaKorisnika) {
        this.listaKorisnika = listaKorisnika;
    }
    
    @Override
    public int getRowCount() {
        return listaKorisnika.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Korisnik k=listaKorisnika.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getIme();
            case 1:
                return k.getPrezime();
            case 2:
                return k.getEmail();
            case 3:
                return k.getBrojTelefona();
            case 4:
                return k.getBrojOtkazivanja();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public void osveziTabelu() {
        fireTableDataChanged();
    }

    private void sortListaKorisnika() {
        listaKorisnika.sort((k1, k2) -> {
        int nameComparison = k1.getIme().compareToIgnoreCase(k2.getIme());
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return k1.getPrezime().compareToIgnoreCase(k2.getPrezime());
        }
    });
    }
    
    
    
}
