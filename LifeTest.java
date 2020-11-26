import org.junit.Test;
import static org.junit.Assert.*;

public class LifeTest {
    
    @Test
    public void createNewCell() {
        
        // Arrange: drei lebende Zellen
        Life l = new Life();
        l.setAlive(0, 0);
        l.setAlive(0, 1);
        l.setAlive(0, 2);

        // Act: Berechnung der Folgegeneration
        l.nextGeneration();

        // Assert: Rasterpunkt mit drei Nachbarn sollte jetzt leben
        assertTrue("Error: cell is not alive", l.checkAlive(1, 1));
    }


    @Test
    public void destroyLonelyCell() {
      Life l = new Life();
      l.setAlive(2,2);
      l.nextGeneration();
      assertFalse(l.checkAlive(1, 1));
    }

    @Test
    public void keepAliveCell() {
      Life l = new Life();
      l.setAlive(2, 3);
      l.setAlive(1, 3);
      l.setAlive(2, 4);
      l.nextGeneration();
      assertTrue(l.checkAlive(2, 4));

      Life a = new Life();
      a.setAlive(2, 3);
      a.setAlive(1, 3);
      a.setAlive(3, 3);
      a.setAlive(2, 4);
      a.nextGeneration();
      assertTrue("Error: cell is not alive", a.checkAlive(2, 4));
    }

    @Test
    public void destroyCrowdedCell() {
      Life a = new Life();
      a.setAlive(2, 3);
      a.setAlive(1, 3);
      a.setAlive(3, 3);
      a.setAlive(2, 4);
      a.setAlive(3, 4);
      a.nextGeneration();
      assertTrue("Error: cell is not alive", a.checkAlive(2, 4));
    }
}