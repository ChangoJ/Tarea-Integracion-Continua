import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

    private Name name;

    @Before
    public void before(){
        this.name = new Name("Jordan");
    }
    @Test
    public void getNumberCharacter(){
        assertEquals(6,this.name.getNumberCharacter());
    }

    @Test
    public void getAttributeBackwards() {
        assertEquals("nadroJ",this.name.getAttributeBackwards());
    }
}