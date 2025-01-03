/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

package forme;

import domain.Korisnik;
import domain.Rekvizit;
import domain.TipRekvizita;
import domain.Zaduzenje;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modeliTabela.ModelTabeleIzabraniRekviziti;
import modeliTabela.ModelTabeleKorisnici;
import transfer.Response;
import userController.UserInterfaceController;

/**
 *
 * @author x
 */
public class DodavanjeZaduzenjaForma extends javax.swing.JDialog {

    FormaZaRadSaRekvizitima fzrsr;
    List<Korisnik> listaKorisnika=new ArrayList<>();
    List<TipRekvizita> listaTipova=new ArrayList<>();
    List<Rekvizit> listaRekvizita=new ArrayList<>();
    /** Creates new form DodavanjeZaduzenjaForma */
    public DodavanjeZaduzenjaForma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        fzrsr=(FormaZaRadSaRekvizitima)parent;
        this.setLocationRelativeTo(fzrsr);
        popuniTabeluKorisnika();
        formirajTabeluZaduzenja();
        popuniComboBoxTip();
        this.setTitle("Dodavanje zaduzenja");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKorisnik = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxRekvizit = new javax.swing.JComboBox<>();
        jButtonIzaberiTip = new javax.swing.JButton();
        jButtonDodajRekvizit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTip = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableZaduzeniRekviziti = new javax.swing.JTable();
        jButtonOdustani = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonIzbaci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DODAVANJE ZADUZENJA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Izaberite korisnika koji se zaduzuje:");

        jTableKorisnik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableKorisnik);

        jLabel5.setText("Izaberite rekvizit:");

        jButtonIzaberiTip.setText("Izaberi");
        jButtonIzaberiTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzaberiTipActionPerformed(evt);
            }
        });

        jButtonDodajRekvizit.setText("Dodaj");
        jButtonDodajRekvizit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajRekvizitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Izbor rekvizita za zaduzivanje:");

        jLabel4.setText("Izaberite tip:");

        jTableZaduzeniRekviziti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableZaduzeniRekviziti);

        jButtonOdustani.setText("Odustani");
        jButtonOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOdustaniActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Zaduzi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonIzbaci.setText("Izbaci");
        jButtonIzbaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzbaciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButtonIzaberiTip)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jComboBoxTip, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel5)
                                        .addComponent(jComboBoxRekvizit, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonDodajRekvizit, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonIzbaci)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonOdustani)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonIzaberiTip)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addGap(12, 12, 12)
                                .addComponent(jComboBoxRekvizit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDodajRekvizit))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButtonIzbaci)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIzaberiTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzaberiTipActionPerformed
        jComboBoxRekvizit.removeAllItems();
        TipRekvizita tip=(TipRekvizita) jComboBoxTip.getSelectedItem();
        Response response=UserInterfaceController.getInstance().vratiRekvizite(tip);
        if(response.isSuccessful()){
            listaRekvizita=(List<Rekvizit>) response.getResult();
            for(Rekvizit rekvizit:listaRekvizita){
                jComboBoxRekvizit.addItem(rekvizit);
            }
        }
    }//GEN-LAST:event_jButtonIzaberiTipActionPerformed

    private void jButtonDodajRekvizitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajRekvizitActionPerformed
        Rekvizit rekvizit=(Rekvizit) jComboBoxRekvizit.getSelectedItem();
        if (rekvizit.getKolicina() == 0) {
            JOptionPane.showMessageDialog(this, "Nema preostale količine za ovaj rekvizit!", "Upozorenje", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ModelTabeleIzabraniRekviziti mtzr = (ModelTabeleIzabraniRekviziti) jTableZaduzeniRekviziti.getModel();
        List<Rekvizit> zaduzenaLista = mtzr.getListaRekvizita();
        boolean found = false;
        for (Rekvizit zaduzeniRekvizit : zaduzenaLista) {
            if (zaduzeniRekvizit.equals(rekvizit)) {
                zaduzeniRekvizit.setKolicina(zaduzeniRekvizit.getKolicina() + 1);
                rekvizit.setKolicina(rekvizit.getKolicina() - 1);
                found = true;
                break;
            }
        }
        if (!found) {
            rekvizit.setKolicina(rekvizit.getKolicina() - 1);
            Rekvizit noviRekvizit = new Rekvizit(rekvizit.getIdRekvizita(), rekvizit.getTipRekvizita(), 1, rekvizit.getNaziv(), rekvizit.getMarka());
            mtzr.getListaRekvizita().add(noviRekvizit);
        }
        jComboBoxRekvizit.repaint();
        mtzr.osveziTabelu();
    }//GEN-LAST:event_jButtonDodajRekvizitActionPerformed

    private void jButtonOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOdustaniActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonOdustaniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int izabraniRed=jTableKorisnik.getSelectedRow();
        if(izabraniRed==-1){
            JOptionPane.showMessageDialog(this, "Neuspesno zaduzivanje. Izaberite korisnika koji se zaduzuje","Upozorenje",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Korisnik k=listaKorisnika.get(izabraniRed);
        ModelTabeleIzabraniRekviziti mtzr = (ModelTabeleIzabraniRekviziti) jTableZaduzeniRekviziti.getModel();
        List<Rekvizit> zaduzenaLista = mtzr.getListaRekvizita();
        if(zaduzenaLista.isEmpty()){
            JOptionPane.showMessageDialog(this, "Neuspesno zaduzivanje. Morate da izaberete bar jedan rekvizit!","Upozorenje",JOptionPane.WARNING_MESSAGE);
            return;
        }
        List<Zaduzenje> listaZaduzenja = new ArrayList<>();
        for (Rekvizit rekvizit : zaduzenaLista) {
            Zaduzenje zaduzenje = new Zaduzenje(k, rekvizit, rekvizit.getKolicina(),new Date());
            for (Zaduzenje postojeciZaduzenje : fzrsr.getListaZaduzenja()) {
                if (postojeciZaduzenje.equals(zaduzenje)) {
                    JOptionPane.showMessageDialog(this, "Neuspesno zaduzivanje.Danas je vec kreirano jedno ovako zaduzenje!", "Greška", JOptionPane.ERROR_MESSAGE);
                    return; 
                    }
            }   
            listaZaduzenja.add(zaduzenje);
        }
        Response response=UserInterfaceController.getInstance().sacuvajZaduzenje(listaZaduzenja);
        if(response.isSuccessful()){
            JOptionPane.showMessageDialog(this, response.getMessage(),"Uspeh",JOptionPane.INFORMATION_MESSAGE);
            fzrsr.popuniTabeluRekvizita(null);
            fzrsr.popuniTabeluZaduzenja();
            this.dispose();
        }
        else{
             JOptionPane.showMessageDialog(this, response.getMessage(),"Greska",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonIzbaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzbaciActionPerformed
         int selectedRow = jTableZaduzeniRekviziti.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Niste izabrali rekvizit za izbacivanje!", "Greška", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ModelTabeleIzabraniRekviziti mtzr = (ModelTabeleIzabraniRekviziti) jTableZaduzeniRekviziti.getModel();
        Rekvizit rekvizitZaIzbacivanje = mtzr.getListaRekvizita().get(selectedRow);

        // Povećajte količinu izabranog rekvizita nazad u ComboBox
        for (Rekvizit rekvizit : listaRekvizita) {
            if (rekvizit.equals(rekvizitZaIzbacivanje)) {
                rekvizit.setKolicina(rekvizit.getKolicina() + rekvizitZaIzbacivanje.getKolicina());
                break;
            }
        }

        // Uklonite rekvizit iz tabele
        mtzr.getListaRekvizita().remove(selectedRow);
        mtzr.osveziTabelu();

        // Ponovo popunite ComboBox
        jComboBoxRekvizit.removeAllItems();
        for (Rekvizit rekvizit : listaRekvizita) {
            jComboBoxRekvizit.addItem(rekvizit);
        }
    }//GEN-LAST:event_jButtonIzbaciActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDodajRekvizit;
    private javax.swing.JButton jButtonIzaberiTip;
    private javax.swing.JButton jButtonIzbaci;
    private javax.swing.JButton jButtonOdustani;
    private javax.swing.JComboBox<Rekvizit> jComboBoxRekvizit;
    private javax.swing.JComboBox<TipRekvizita> jComboBoxTip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableKorisnik;
    private javax.swing.JTable jTableZaduzeniRekviziti;
    // End of variables declaration//GEN-END:variables

    private void popuniTabeluKorisnika() {
        Response response=UserInterfaceController.getInstance().vratiKorisnike();
        listaKorisnika=(List<Korisnik>) response.getResult();
        ModelTabeleKorisnici mtk=new ModelTabeleKorisnici(listaKorisnika);
        jTableKorisnik.setModel(mtk);
    }

    private void formirajTabeluZaduzenja() {
        ModelTabeleIzabraniRekviziti mtr=new ModelTabeleIzabraniRekviziti();
        jTableZaduzeniRekviziti.setModel(mtr);
    }

    private void popuniComboBoxTip() {
        Response response=UserInterfaceController.getInstance().vratiTipove();
        listaTipova=(List<TipRekvizita>)response.getResult();
        for(TipRekvizita tip:listaTipova){
            jComboBoxTip.addItem(tip);
        }
    }

}
