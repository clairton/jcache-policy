package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.DAYS;
import static java.util.concurrent.TimeUnit.HOURS;
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;
import static javax.cache.Caching.getCachingProvider;
import static org.junit.Assert.assertEquals;

import javax.cache.CacheManager;

import org.junit.Test;

public class ExpiryCacheResolverFactoryTest {	
	
    final CacheManager manager = getCachingProvider().getCacheManager();

    @Test
    public void testDaily() {
        final ExpiryCacheResolver resolver = new DailyExpiryCacheResolver(manager);
        assertEquals(DAYS, resolver.getDuration().getTimeUnit());
        assertEquals(1, resolver.getDuration().getDurationAmount());
    }

    @Test
    public void testHalfAMinute() {
      final ExpiryCacheResolver resolver = new HalfAMinuteExpiryCacheResolver(manager);
      assertEquals(SECONDS, resolver.getDuration().getTimeUnit());
      assertEquals(30, resolver.getDuration().getDurationAmount());
    }
    
    @Test
    public void testHalfAnHour() {
      final ExpiryCacheResolver resolver = new HalfAnHourExpiryCacheResolver(manager);
      assertEquals(MINUTES, resolver.getDuration().getTimeUnit());
      assertEquals(30, resolver.getDuration().getDurationAmount());
    }
    
    @Test
    public void testHourly() {
      final ExpiryCacheResolver resolver = new HourlyExpiryCacheResolver(manager);
      assertEquals(HOURS, resolver.getDuration().getTimeUnit());
      assertEquals(1, resolver.getDuration().getDurationAmount());
    }

    @Test
    public void testMinutely() {
      final ExpiryCacheResolver resolver = new MinutelyExpiryCacheResolver(manager);
      assertEquals(MINUTES, resolver.getDuration().getTimeUnit());
      assertEquals(1, resolver.getDuration().getDurationAmount());
    }
    
    @Test
    public void testQuarterOfAnHour() {
      final ExpiryCacheResolver resolver = new QuarterOfAnHourExpiryCacheResolver(manager);
      assertEquals(MINUTES, resolver.getDuration().getTimeUnit());
      assertEquals(15, resolver.getDuration().getDurationAmount());
    }
}
