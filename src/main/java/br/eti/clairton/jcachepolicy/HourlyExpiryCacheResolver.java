package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.HOURS;

import java.util.concurrent.TimeUnit;

import javax.cache.CacheManager;
import javax.inject.Inject;

@HourlyExpiry
public class HourlyExpiryCacheResolver  extends ExpiryCacheResolver  {

    @Deprecated
    public HourlyExpiryCacheResolver() {
        this(null);
    }
    
    @Inject
    public HourlyExpiryCacheResolver(final CacheManager manager) {
        super(manager);
    }

    @Override
    TimeUnit getTimeUnit() {
        return HOURS;
    }
    
    @Override
    Integer getQuantity() {
        return 1;
    }
}
