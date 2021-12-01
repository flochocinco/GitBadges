import junit.framework.*;

public class Tester extends TestCase {

  public void testAdd() throws Exception {
    Adder adder = new Adder();
    assertEquals(3, adder.add(1,1));
  }
}
