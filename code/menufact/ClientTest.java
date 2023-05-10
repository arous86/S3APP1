package menufact;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void getIdClient(){
        Client client = new Client(1, "Domingo", "12345678");
        assertEquals(1, client.getIdClient());
    }

    @Test
    void setIdClient() {
        Client client = new Client(1, "Domingo", "12345678");
        client.setIdClient(2);
        assertEquals(2, client.getIdClient());
    }

    @Test
    void getNom() {
        Client client = new Client(1, "Domingo", "12345678");
        assertEquals("Domingo", client.getNom());
    }

    @Test
    void setNom() {
        Client client = new Client(1, "Domingo", "12345678");
        client.setNom("Alexandre");
        assertEquals("Alexandre", client.getNom());
    }

    @Test
    void getNumeroCarteCredit() {
        Client client = new Client(1, "Domingo", "12345678");
        assertEquals("12345678", client.getNumeroCarteCredit());
    }

    @Test
    void setNumeroCarteCredit() {
        Client client = new Client(1, "Domingo", "12345678");
        client.setNumeroCarteCredit("87654321");
        assertEquals("87654321", client.getNumeroCarteCredit());
    }

    @Test
    void testToString() {
        Client client = new Client(1, "Domingo", "12345678");
        assertEquals("menufact.Client{idClient=1, nom='Domingo', numeroCarteCredit='12345678'}", client.toString());
    }
}