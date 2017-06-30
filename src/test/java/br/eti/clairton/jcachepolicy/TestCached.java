package br.eti.clairton.jcachepolicy;

import java.util.Date;
import java.util.Random;

import javax.cache.annotation.CacheResult;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class TestCached {

    public String method() {
        return new Date().toString() + new Random().nextLong();
    }

	@CacheResult(cacheResolverFactory = Minutely.class)
	public String methodMinutely() {
		return method();
	}

    @CacheResult(cacheResolverFactory = Daily.class)
    public String methodDaily() {
        return method();
    }
    
    @CacheResult(cacheResolverFactory = HalfAMinute.class)
    public String methodHalfAMinute() {
      return method();
    }
    
    @CacheResult(cacheResolverFactory = HalfAnHour.class)
    public String methodHalfAnHour() {
      return method();
    }
    
    @CacheResult(cacheResolverFactory = Hourly.class)
    public String methodHourly() {
      return method();
    }
    
    @CacheResult(cacheResolverFactory = QuarterOfAnHour.class)
    public String methodQuarterOfAnHour() {
      return method();
    }

}