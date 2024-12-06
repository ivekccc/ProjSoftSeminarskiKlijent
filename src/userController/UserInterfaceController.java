/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userController;
import communication.Communication;
import domain.Administrator;
import domain.Korisnik;
import domain.Rekvizit;
import domain.Termin;
import domain.TipRekvizita;
import domain.Zaduzenje;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import modeliTabela.ModelTabeleTermini;
import transfer.Response;

/**
 *
 * @author x
 */
public class UserInterfaceController {
    
    private static UserInterfaceController instance;
    private Communication communication;
    private Administrator prijavljeniAdministrator;
    //za periodicno proveravanje  stanja veze sa serverom
    private Timer connectionChecker;
    
    private UserInterfaceController(){
        communication = new Communication();
        communication.connect();
        startConnectionChecker();
    }
    
    public static UserInterfaceController getInstance() {
        if (instance == null) {
            instance = new UserInterfaceController();
        }
        return instance;
    }

    public Administrator getPrijavljeniAdministrator() {
        return prijavljeniAdministrator;
    }
    
    

    private void startConnectionChecker() {
        connectionChecker = new Timer(true);
        connectionChecker.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (!communication.isConnected()) {
                    System.out.println("Konekcija sa serverom je prekinuta.");
                    JOptionPane.showMessageDialog(null, "Konekcija sa serverom je prekinuta. Aplikacija će se zatvoriti.", "Greška", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
        }, 5000, 5000); 
    }

    public Response login(String email, String password) {
        communication.connect();
        Administrator administrator=new Administrator(-1, null, password, email, null, null);
        Response response=communication.login(administrator); 
        prijavljeniAdministrator=(Administrator)response.getResult();
        return response;
    }

    public Response register(Administrator admin) {
        communication.connect();
        return communication.register(admin);
    }

    public Response vratiTermine() {
        communication.connect();
        return communication.vratiTermine();
    }

    public Response otkaziTermin(Termin t) {
        communication.connect();
        return communication.otkaziTermin(t);
    }

    public Response izbrisiTermin(Termin t) {
        communication.connect();
        return communication.izbrisiTermin(t);
    }

   

    public Response dodajTermin(Termin t) {
        communication.connect();
        return communication.dodajTermin(t);
    }

    public Response vratiKorisnike() {
        communication.connect();
        return communication.vratiKorisnike();
    }

    public Response zakaziTermin(Termin terminZaZakazivanje) {
        communication.connect();
        return communication.zakaziTermin(terminZaZakazivanje);
    }

    public Response izbrisiKorisnika(Korisnik k) {
        communication.connect();
        return communication.izbrisiKorisnika(k);
    }

    public Response dodajKorisnika(Korisnik k) {
        communication.connect();
        return communication.dodajKorisnika(k);
    }

    public Response izmenaKorisnika(Korisnik korisnikZaIzmenu) {
        communication.connect();
        return communication.izmeniKorisnika(korisnikZaIzmenu);
    }

    public Response odjaviAdministratora() {
        communication.connect();
        Response response=communication.odjaviAdministratora(prijavljeniAdministrator);
        if(response.isSuccessful()){
            prijavljeniAdministrator=null;
        }
        return response;
    }

    public Response vratiZakazanTermin(Termin termin) {
        communication.connect();
        return communication.vratiZakazanTermin(termin);
    }

    public Response vratiRekvizite(TipRekvizita tip) {
        communication.connect();
        return communication.vratiRekvizite(tip);
    }

    

    public Response vratiTipove() {
        communication.connect();
        return communication.vratiTipove();
    }

    public Response sacuvajZaduzenje(List<Zaduzenje> listaZaduzenja) {
        communication.connect();
        return communication.sacuvajZaduzenje(listaZaduzenja);
    }

    public Response vratiZaduzenja() {
        communication.connect();
        return communication.vratiZaduzenja();
    }

    public Response razduzi(Zaduzenje zaduzenje) {
        communication.connect();
        return communication.razduzi(zaduzenje);
    }

    public Response dodajRekvizit(Rekvizit rekvizit) {
        communication.connect();
        return communication.dodajRekvizit(rekvizit);
    }

    public void prekiniKonekciju() {
        communication.connect();
        communication.prekiniKonekciju();
    }

    

    

    

    
    
    
    
}
