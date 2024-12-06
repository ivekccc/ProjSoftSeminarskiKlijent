package communication;

import domain.Administrator;
import domain.Korisnik;
import domain.Rekvizit;
import domain.Termin;
import domain.TipRekvizita;
import domain.Zaduzenje;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import operation.Operation;
import transfer.Request;
import transfer.Response;

/**
 *
 * @author x
 */
public class Communication {
    private Socket socket;
    private CommunicationHelper helper;
    
    public void connect() {
        if (isConnected()) {
            System.out.println("Konekcija je već otvorena.");
            return;
        }
        try {
            //ovo su podaci zato sto se nalazi na istoj lokalnoj masini
            socket = new Socket("127.0.0.1", 9999);
            helper = new CommunicationHelper(socket);
            System.out.println("Konekcija uspostavljena.");
        } catch (SocketException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error connecting to server", ex);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("I/O error occurred", ex);
        }
    }
    
    public boolean isConnected() {
        boolean connected =  socket != null && socket.isConnected() && !socket.isClosed();
        System.out.println("Provera konekcije: " + connected);
        return connected;
    }
    
    public void close() {
        try {
            if (socket != null && !socket.isClosed()) {
                socket.close();
                System.out.println("Konekcija zatvorena.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void sendRequest(int operation, Object requestObject) {
        try {
            Request request = new Request(operation, requestObject);
            helper.send(request);
        } catch (IOException ex) {
            ex.printStackTrace();
            close();
            throw new RuntimeException("Error sending request", ex);
        }
    }
    
    private Response getResponse() {
        try {
            Response response = (Response) helper.receive();
            return response;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            close();
            throw new RuntimeException("Error receiving response", ex);
        }
    }

    public Response login(Administrator administrator) {
        sendRequest(Operation.LOGIN, administrator);
        return getResponse();
    }

    public Response register(Administrator administrator) {
        sendRequest(Operation.REGISTER, administrator);
        return getResponse();
    }

    public Response izbrisiTermin(Termin t) {
        sendRequest(Operation.IZBRISI_TERMIN, t);
        return getResponse();
    }

    public Response vratiTermine() {
        sendRequest(Operation.VRATI_TERMINE, null);
        return getResponse();
    }

    public Response otkaziTermin(Termin t) {
        sendRequest(Operation.OTKAZI_TERMIN, t);
        return getResponse();
    }

    public Response dodajTermin(Termin t) {
        sendRequest(Operation.DODAJ_TERMIN, t);
        return getResponse();
    }

    public Response vratiKorisnike() {
        sendRequest(Operation.VRATI_KORISNIKE, null);
        return getResponse();
    }

    public Response zakaziTermin(Termin terminZaZakazivanje) {
        sendRequest(Operation.ZAKAZI_TERMIN, terminZaZakazivanje);
        return getResponse();
    }

    public Response izbrisiKorisnika(Korisnik k) {
        sendRequest(Operation.IZBRISI_KORISNIKA, k);
        return getResponse();
    }

    public Response dodajKorisnika(Korisnik k) {
        sendRequest(Operation.DODAJ_KORISNIKA, k);
        return getResponse();
    }

    public Response izmeniKorisnika(Korisnik korisnikZaIzmenu) {
        sendRequest(Operation.IZMENI_KORISNIKA  , korisnikZaIzmenu);
        return getResponse();
    }

    public Response odjaviAdministratora(Administrator prijavljeniAdministrator) {
        sendRequest(Operation.ODJAVA, prijavljeniAdministrator);
        return getResponse();
    }

    public Response vratiZakazanTermin(Termin termin) {
        sendRequest(Operation.VRATI_ZAKAZAN_TERMIN, termin);
        return getResponse();
    }

    public Response vratiRekvizite(TipRekvizita tip) {
        sendRequest(Operation.VRATI_REKVIZITE, tip);
        return getResponse();
    }

    

    public Response vratiTipove() {
        sendRequest(Operation.VRATI_TIPOVE, null);
        return getResponse();
    }

    public Response sacuvajZaduzenje(List<Zaduzenje> listaZaduzenja) {
        sendRequest(Operation.SACUVAJ_ZADUZENJE, listaZaduzenja);
        return getResponse();
    }

    public Response vratiZaduzenja() {
        sendRequest(Operation.VRATI_ZADUZENJA, null);
        return getResponse();
    }

    public Response razduzi(Zaduzenje zaduzenje) {
        sendRequest(Operation.RAZDUZI, zaduzenje);
        return getResponse();
    }

    public Response dodajRekvizit(Rekvizit rekvizit) {
        sendRequest(Operation.DODAJ_REKVIZIT, rekvizit);
        return getResponse();
    }

    public void prekiniKonekciju() {
        sendRequest(Operation.PREKINI_KONEKCIJU, null);
        getResponse();
    }

    

   

   

    
}
