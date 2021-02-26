package hu.bme.mit.train.sensor;


import hu.bme.mit.train.user.TrainUserImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainSensorImpl trainSensor;

    @Before
    public void before() {
        trainSensor = new TrainSensorImpl();
    }

    @Test
    public void ThisIsAnExampleTestStub() {

    }

    /*@Test
    public void CutomTest() {
        trainSensor.overrideSpeedLimit(10);
        assertEquals(10, trainSensor.getSpeedLimit());
    }*/


}
