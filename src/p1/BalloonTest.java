package p1;

import static org.junit.Assert.*;
import org.junit.Test;

/*
 * Created by emailman on 2/16/2016.
 */
public class BalloonTest {

    @Test
    public void testGetSize() throws Exception {
        Balloon b = new Balloon();
        assertEquals(10, b.getSize());
    }
}