package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.MINUTES;

import java.util.concurrent.TimeUnit;

import javax.cache.CacheManager;
import javax.inject.Inject;

@QuarterOfAnHourExpiry
public class QuarterOfAnHourExpiryCacheResolver extends AbstractExpiryCacheResolver {

    @Deprecated
    public QuarterOfAnHourExpiryCacheResolver() {
        this(null);
    }
    
    @Inject
    public QuarterOfAnHourExpiryCacheResolver(final CacheManager manager) {
        super(manager);
    }

    @Override
    TimeUnit getTimeUnit() {
        return MINUTES;
    }

    @Override
    Integer getQuantity() {
        return 15;
    }
}
