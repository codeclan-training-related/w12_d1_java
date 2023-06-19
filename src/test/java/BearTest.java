import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;

    @Before
    public void before(){
//        this cannot be seen by the tests directly
        bear= new Bear ("Grizzly", 5, 122.33);
    }

    @Test
    public void hasSpecies(){
//
        assertEquals( "Grizzly", bear.getSpecies() );
    }
    @Test
    public void hasAge(){
//
        assertEquals(5, bear.getAge());
    }
    @Test
    public void hasWeight(){
        assertEquals(122.33, bear.getWeight(), 0.0);
    }

    @Test
    public void readToHibernateOver90kg(){
        assertEquals( true, bear.isReadToHibernateOver90kg());

    }

}
