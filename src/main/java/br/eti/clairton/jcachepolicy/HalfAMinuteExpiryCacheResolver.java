package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.TimeUnit;

import javax.cache.CacheManager;
import javax.inject.Inject;

@HalfAMinuteExpiry
public class HalfAMinuteExpiryCacheResolver extends AbstractExpiryCacheResolver {

    @Deprecated
    public HalfAMinuteExpiryCacheResolver() {
        this(null);
    }
    
    @Inject
    public HalfAMinuteExpiryCacheResolver(final CacheManager manager) {
        super(manager);
    }

    @Override
    TimeUnit getTimeUnit() {
        return SECONDS;
    }

    @Override
    Integer getQuantity() {
        return 30;
    }
}
