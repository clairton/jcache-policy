package br.eti.clairton.jcachepolicy;

import java.util.Date;
import java.util.Random;

import javax.cache.annotation.CacheResult;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class TestCached {

	@CacheResult(cacheResolverFactory = Minutely.class)
	public String method() {
		return new Date().toString() + new Random().nextLong();
	}

}