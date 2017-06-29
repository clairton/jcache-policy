package br.eti.clairton.jcachepolicy;

import static javax.cache.Caching.getCachingProvider;

import javax.cache.CacheManager;
import javax.cache.spi.CachingProvider;
import javax.enterprise.inject.Produces;

public class CacheManagerProduces {

    @Produces
    public CacheManager getCacheManager(){
        final CachingProvider provider = getCachingProvider();
        final CacheManager manager = provider.getCacheManager();
        return manager;
    }
}
