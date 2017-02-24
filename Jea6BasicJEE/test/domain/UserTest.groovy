package domain

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Kees on 24/02/2017.
 */
class UserTest extends User {

    @Test
    public void testConcatenate() {
        User user = new User();

        assertTrue(user.getTrue());
    }
}
