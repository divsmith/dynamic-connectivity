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
}