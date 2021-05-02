import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {
    private Number number;

    @Before
    public void before(){
        this.number = new Number(3,1);
    }
    
    @Test
    public void getAdittion(){
        assertEquals(4,this.number.getAdittion() );
    }

}