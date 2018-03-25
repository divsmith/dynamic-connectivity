import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 3/24/18.
 */
class QuickUnionTest {

    @Test
    void count()
    {
        QuickUnion qu = new QuickUnion(10);
        Assertions.assertEquals(10, qu.count());
    }

}