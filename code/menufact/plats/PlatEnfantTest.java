package menufact.plats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlatEnfantTest {

    @Test
    void testClone() {
        PlatEnfant platEnfant = new PlatEnfant(1, "Poutine", 10.0, 0.5);
        PlatEnfant platEnfantClone = platEnfant.clone();
        assertEquals(platEnfant.getCode(), platEnfantClone.getCode());
    }

    @Test
    void getProportion() {
        PlatEnfant platEnfant = new PlatEnfant(1, "Poutine", 10.0, 0.5);
        assertEquals(0.5, platEnfant.getProportion());
    }

    @Test
    void testToString() {
        PlatEnfant platEnfant = new PlatEnfant(1, "Poutine", 10.0, 0.5);
        //check if the toString method returns the correct string
        assertEquals("PlatEnfant{proportion=0.5} menufact.plats.PlatAuMenu{code=1, description='Poutine', prix=10.0}", platEnfant.toString());
    }
}


