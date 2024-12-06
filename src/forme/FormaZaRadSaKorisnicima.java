/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forme;

import auth.LoginForm;
import domain.Administrator;
import domain.Korisnik;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modeliTabela.ModelTabeleKorisnici;
import transfer.Response;
import userController.UserInterfaceController;

/**
 *
 * @author x
 */
public class FormaZaRadSaKorisnicima extends javax.swing.JFrame {
    List<Korisnik> listaKorisnika=new ArrayList<>();
    private Administrator ulogovaniAdmin;

    /**
     * Creates new form GlavnaKlijentskaForma
     */
    public FormaZaRadSaKorisnicima(Administrator ulogovaniAdmin) {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Pozivanje metode za odjavu
                odjaviSe();
            }

        });
        this.setTitle("Forma za rad sa korisnicima");
        this.ulogovaniAdmin=ulogovaniAdmin;
        this.setLocationRelativeTo(null);
        popuniListuKorisnika();
        jTextFieldPretraga.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                pretragaKorisnika();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                pretragaKorisnika();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                pretragaKorisnika();
            }
        });
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonDodajKorisnika = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKorisnici = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonIzbrisi = new javax.swing.JButton();
        jButtonIzmeni = new javax.swing.JButton();
        jTextFieldPretraga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemGlavnaForma = new javax.swing.JMenuItem();
        jMenuItemRadSaRekvizitima = new javax.swing.JMenuItem();
        jMenuItemOdjava = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonDodajKorisnika.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonDodajKorisnika.setText("Dodaj korisnika");
        jButtonDodajKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajKorisnikaActionPerformed(evt);
            }
        });

        jTableKorisnici.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableKorisnici);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("TABELA KORISNIKA");

        jButtonIzbrisi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonIzbrisi.setText("Izbrisi");
        jButtonIzbrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzbrisiActionPerformed(evt);
            }
        });

        jButtonIzmeni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonIzmeni.setText("Izmeni");
        jButtonIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniActionPerformed(evt);
            }
        });

        jTextFieldPretraga.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldPretragaInputMethodTextChanged(evt);
            }
        });
        jTextFieldPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPretragaActionPerformed(evt);
            }
        });
        jTextFieldPretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPretragaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Pretraga:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("RAD SA KORISNICIMA");

        jMenu1.setText("Meni");

        jMenuItemGlavnaForma.setText("Glavna forma");
        jMenuItemGlavnaForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGlavnaFormaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGlavnaForma);

        jMenuItemRadSaRekvizitima.setText("Rad sa rekvizitima");
        jMenuItemRadSaRekvizitima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRadSaRekvizitimaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRadSaRekvizitima);

        jMenuItemOdjava.setText("Odjava");
        jMenuItemOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOdjavaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemOdjava);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDodajKorisnika)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonIzmeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonIzbrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIzbrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDodajKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Administrator getUlogovaniAdmin() {
        return ulogovaniAdmin;
    }
    
    
    private void jButtonDodajKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajKorisnikaActionPerformed
        DodavanjeIIzmenaKorisnikaForma dkf=new DodavanjeIIzmenaKorisnikaForma(this, true,null);
        dkf.setVisible(true);
    }//GEN-LAST:event_jButtonDodajKorisnikaActionPerformed

    private void jButtonIzbrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzbrisiActionPerformed
        int izabraniRed=jTableKorisnici.getSelectedRow();
        if(izabraniRed==-1){
            JOptionPane.showMessageDialog(this, "Neuspesno brisanje korisnika. Izaberite korisnika za brisanje","Upozorenje",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int potvrda=JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da izbrisete korisnika? Svi njegovi termini ce biti otkazani i oprema razduzena!","Potvrda",JOptionPane.YES_NO_CANCEL_OPTION);
        if(potvrda==JOptionPane.YES_OPTION){
            
            ModelTabeleKorisnici mtk=(ModelTabeleKorisnici) jTableKorisnici.getModel();
            Korisnik k=mtk.getListaKorisnika().get(izabraniRed);
            Response response=UserInterfaceController.getInstance().izbrisiKorisnika(k);
            if(response.isSuccessful()){
                JOptionPane.showMessageDialog(this, response.getMessage(),"Uspeh",JOptionPane.INFORMATION_MESSAGE);
                listaKorisnika.remove(k);
                mtk.getListaKorisnika().remove(k);
                mtk.osveziTabelu();
                return;
            }
            JOptionPane.showMessageDialog(this, response.getMessage(),"Greska",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonIzbrisiActionPerformed

    private void jButtonIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniActionPerformed
        int izabraniRed=jTableKorisnici.getSelectedRow();
        if(izabraniRed==-1){
            JOptionPane.showMessageDialog(this, "Neuspesna izmena korisnika. Izberite korisnika za izmenu","Upozorenje",JOptionPane.WARNING_MESSAGE);
            return;
        }
        ModelTabeleKorisnici mtk=(ModelTabeleKorisnici) jTableKorisnici.getModel();
        Korisnik k=mtk.getListaKorisnika().get(izabraniRed);
        DodavanjeIIzmenaKorisnikaForma dkf=new DodavanjeIIzmenaKorisnikaForma(this, true,k);
        dkf.setVisible(true);
    }//GEN-LAST:event_jButtonIzmeniActionPerformed

    private void jTextFieldPretragaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldPretragaInputMethodTextChanged
       
    }//GEN-LAST:event_jTextFieldPretragaInputMethodTextChanged

    private void jTextFieldPretragaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPretragaKeyPressed

    }//GEN-LAST:event_jTextFieldPretragaKeyPressed

    private void jTextFieldPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPretragaActionPerformed

    }//GEN-LAST:event_jTextFieldPretragaActionPerformed

    private void jMenuItemGlavnaFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGlavnaFormaActionPerformed
        new GlavnaForma(ulogovaniAdmin).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemGlavnaFormaActionPerformed

    private void jMenuItemOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOdjavaActionPerformed
        odjaviSe();
    }//GEN-LAST:event_jMenuItemOdjavaActionPerformed

    private void jMenuItemRadSaRekvizitimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRadSaRekvizitimaActionPerformed
        new FormaZaRadSaRekvizitima(ulogovaniAdmin).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemRadSaRekvizitimaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodajKorisnika;
    private javax.swing.JButton jButtonIzbrisi;
    private javax.swing.JButton jButtonIzmeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemGlavnaForma;
    private javax.swing.JMenuItem jMenuItemOdjava;
    private javax.swing.JMenuItem jMenuItemRadSaRekvizitima;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableKorisnici;
    private javax.swing.JTextField jTextFieldPretraga;
    // End of variables declaration//GEN-END:variables

    public void popuniListuKorisnika() {
        Response response=UserInterfaceController.getInstance().vratiKorisnike();
        this.listaKorisnika=(List<Korisnik>) response.getResult();
        ModelTabeleKorisnici mtk=new ModelTabeleKorisnici(listaKorisnika);
        jTableKorisnici.setModel(mtk);
    }
    
    public void pretragaKorisnika(){
        String searchText=jTextFieldPretraga.getText().toLowerCase();
        List<Korisnik> filteredKorisnici=listaKorisnika.stream().filter(k->k.getIme().toLowerCase().contains(searchText) ||
                k.getPrezime().toLowerCase().contains(searchText)).collect(Collectors.toList());
        ModelTabeleKorisnici mtk=new ModelTabeleKorisnici(filteredKorisnici);
        jTableKorisnici.setModel(mtk);
        
    }
    private void odjaviSe() {
        Response response = UserInterfaceController.getInstance().odjaviAdministratora();
        if (response.isSuccessful()) {
            JOptionPane.showMessageDialog(this, response.getMessage());
            // Zatvaranje svih formi i povratak na login formu
            dispose();
            new LoginForm().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, response.getMessage(), "Greška", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
