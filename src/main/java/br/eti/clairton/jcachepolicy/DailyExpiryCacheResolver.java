package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.DAYS;

import java.util.concurrent.TimeUnit;

import javax.cache.CacheManager;
import javax.inject.Inject;

@DailyExpiry
public class DailyExpiryCacheResolver extends AbstractExpiryCacheResolver  {

    @Deprecated
    public DailyExpiryCacheResolver() {
        this(null);
    }
    
    @Inject
    public DailyExpiryCacheResolver(final CacheManager manager) {
        super(manager);
    }

    @Override
    TimeUnit getTimeUnit() {
        return DAYS;
    }
    
    @Override
    Integer getQuantity() {
        return 1;
    }
}