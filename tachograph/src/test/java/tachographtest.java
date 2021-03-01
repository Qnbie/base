import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class tachographtest {

    tachograph tachographunit;

    @Before
    public void Initialize(){
        tachographunit = new tachograph();


    }

    @Test
    public void basicTest(){


        tachographunit.put(new Date(System.currentTimeMillis()), 0.5f, 0.6f);
        tachographunit.put(new Date(System.currentTimeMillis()), 0.5f, 0.6f);
        tachographunit.put(new Date(System.currentTimeMillis()), 0.5f, 0.6f);

        Assert.assertEquals(3, tachographunit.size());
    }
}
