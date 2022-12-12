package dssc.assignment.bank;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GattoTest {
    @Test
    void checksum_1(){
        Entry entry = new Entry("                           ", "  |  |  |  |  |  |  |  |  |", "  |  |  |  |  |  |  |  |  |");
        int checksum=entry.checksum();
        assertEquals(checksum,1);
    }

    @Test
    void checksum_0(){
        Entry entry = new Entry(" _  _  _  _  _  _  _  _  _ ","| || || || || || || || || |","|_||_||_||_||_||_||_||_||_|");
        int checksum=entry.checksum();
        assertEquals(checksum,0);
    }


}
