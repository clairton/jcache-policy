package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.MINUTES;

import java.util.concurrent.TimeUnit;

import javax.cache.CacheManager;
import javax.inject.Inject;

@HalfAnHourExpiry
public class HalfAnHourExpiryCacheResolver extends AbstractExpiryCacheResolver {

    @Deprecated
    public HalfAnHourExpiryCacheResolver() {
        this(null);
    }
    
    @Inject
    public HalfAnHourExpiryCacheResolver(final CacheManager manager) {
        super(manager);
    }

    @Override
    TimeUnit getTimeUnit() {
        return MINUTES;
    }

    @Override
    Integer getQuantity() {
        return 30;
    }
}
