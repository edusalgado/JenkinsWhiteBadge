import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMessage(){

        Main tester = new Main();

        assertEquals( "Hello Word!",tester.createMessage());
    }


}
