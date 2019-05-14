package dd;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void testOne() {
        int result = Main.one();
        assertThat(result, equalTo(1));
    }

}
