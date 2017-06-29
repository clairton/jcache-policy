package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.MINUTES;

import java.util.concurrent.TimeUnit;

import javax.cache.CacheManager;
import javax.inject.Inject;

@MinutelyExpiry
public class MinutelyExpiryCacheResolver  extends AbstractExpiryCacheResolver  {

    @Deprecated
    public MinutelyExpiryCacheResolver() {
        this(null);
    }
    
    @Inject
    public MinutelyExpiryCacheResolver(final CacheManager manager) {
        super(manager);
    }

    @Override
    TimeUnit getTimeUnit() {
        return MINUTES;
    }
    
    @Override
    Integer getQuantity() {
        return 1;
    }
}
