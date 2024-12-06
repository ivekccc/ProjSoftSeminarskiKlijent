/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeliTabela;

import domain.Zaduzenje;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author x
 */
public class ModelTabeleZaduzenja extends AbstractTableModel {
    private List<Zaduzenje> listaZaduzenja=new ArrayList<>();
    private final String[] kolone={"korisnik","datum_zaduzenja","naziv_rekvizita","marka","kolicina"};

    public ModelTabeleZaduzenja(List<Zaduzenje> listaZaduzenja) {
        this.listaZaduzenja=listaZaduzenja;
    }

    public ModelTabeleZaduzenja() {
    }

    public List<Zaduzenje> getListaZaduzenja() {
        return listaZaduzenja;
    }
    
    
    @Override
    public int getRowCount() {
        return listaZaduzenja.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zaduzenje zaduzenje=listaZaduzenja.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return zaduzenje.getKorisnik().getIme()+" "+zaduzenje.getKorisnik().getPrezime();
            case 1:
                Date datum=zaduzenje.getDatumZaduzenja();
                SimpleDateFormat smf=new SimpleDateFormat("dd.MM.yyyy");
                String datumStr=smf.format(datum);
                return datumStr;
            case 2:
                return zaduzenje.getRekvizit().getNaziv();
            case 3:
                return zaduzenje.getRekvizit().getMarka();
            case 4:
                return zaduzenje.getZaduzena_kolicina(); 
            default:
                return "na";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    
}
