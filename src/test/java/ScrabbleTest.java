import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrabbleTest {

  @Test
  public void App_acceptChar_Array() {
    App testAcceptChar = new App();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add('A');
    ArrayList<Object> testReturn = testAcceptChar.isCharArray('A');
    assertEquals(expected, testReturn);
  }

  @Test
  public void App_convertChar_Array() {
    App testConvertChar = new App();
    ArrayList<Object> results = new ArrayList<Object>();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(3);
    ArrayList<Object> testReturn = testConvertChar.charValue('B');
    assertEquals(expected, testReturn);
  }
}
