import junit.framework.*;

public class Tester extends TestCase {

  public void testAdd() throws Exception {

    assertEquals(2,Adder.add(1,1));
  }
}
