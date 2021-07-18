import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaneTest {
    private Jet jet;
    @BeforeEach
    void setUp() {
        jet = new Jet();
    }

    @Test
    public void testType(){
        assert jet.getType().equals("Jet");
    }

    @AfterEach
    void tearDown() {
    }
}