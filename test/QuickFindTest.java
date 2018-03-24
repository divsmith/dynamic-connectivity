import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 3/24/18.
 */
class QuickFindTest {
    @Test
    void count()
    {
        QuickFind qf = new QuickFind(10);
        Assertions.assertEquals(10, qf.count());
    }

    @Test
    void union_not_connected()
    {
        QuickFind qf = new QuickFind(4);
        Assertions.assertFalse(qf.connected(1, 2));
    }

    @Test
    void union_connected()
    {
        QuickFind qf = new QuickFind(4);
        qf.union(1, 2);
        Assertions.assertTrue(qf.connected(1, 2));
    }
}