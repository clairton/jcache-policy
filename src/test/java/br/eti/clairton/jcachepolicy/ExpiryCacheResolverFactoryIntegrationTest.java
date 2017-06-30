package br.eti.clairton.jcachepolicy;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiTestRunner.class)
public class ExpiryCacheResolverFactoryIntegrationTest {	
	
    @Inject 
	private TestCached test;

    @Test
    public void testDaily() {
        final String result = test.methodDaily();
        //when the second call, the same result, because is cached
        assertEquals(result, test.methodDaily());
    }

    @Test
    public void testHalfAMinute() {
        final String result = test.methodHalfAMinute();
        //when the second call, the same result, because is cached
        assertEquals(result, test.methodHalfAMinute());
    }
    
    @Test
    public void testHalfAnHour() {
      final String result = test.methodHalfAnHour();
      //when the second call, the same result, because is cached
      assertEquals(result, test.methodHalfAnHour());
    }
    
    @Test
    public void testHourly() {
      final String result = test.methodHourly();
      //when the second call, the same result, because is cached
      assertEquals(result, test.methodHourly());
    }

    @Test
    public void testMinutely() {
        final String result = test.methodMinutely();
        //when the second call, the same result, because is cached
        assertEquals(result, test.methodMinutely());
    }
    
    @Test
    public void testQuarterOfAnHour() {
      final String result = test.methodQuarterOfAnHour();
      //when the second call, the same result, because is cached
      assertEquals(result, test.methodQuarterOfAnHour());
    }
}
