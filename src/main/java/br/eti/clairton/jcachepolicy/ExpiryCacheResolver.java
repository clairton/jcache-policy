package br.eti.clairton.jcachepolicy;

import static javax.cache.expiry.AccessedExpiryPolicy.factoryOf;

import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.annotation.CacheInvocationContext;
import javax.cache.annotation.CacheResolver;
import javax.cache.configuration.Configuration;
import javax.cache.configuration.Factory;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.Duration;
import javax.cache.expiry.ExpiryPolicy;

public abstract class ExpiryCacheResolver implements CacheResolver{

	protected final CacheManager manager;

	public ExpiryCacheResolver(final CacheManager manager) {
		this.manager = manager;
	}

	@Override
	public <K, V> Cache<K, V> resolveCache(final CacheInvocationContext<? extends Annotation> context) {
		final String name = context.getCacheName();
		return getCache(name);
	}
	
	protected Duration getDuration() {
	    return new Duration(getTimeUnit(), getQuantity());
	}
    
    protected <K, V> Factory<ExpiryPolicy> getFactory() {
        return factoryOf(getDuration());
    }
    
    protected <K, V> Configuration<K, V>  getConfiguration(final String name) {
        final MutableConfiguration<K, V> configuration = new MutableConfiguration<K, V>();
        configuration.setExpiryPolicyFactory(getFactory());
        return configuration;
    }
	
	protected <K, V> Cache<K, V> createCache(final String name) {
	    final Configuration<K, V> configuration = getConfiguration(name);
        return manager.createCache(name, configuration);
    }

	private synchronized <K, V> Cache<K, V> getCache(final String name) {
		final Cache<K, V> cache = manager.getCache(name);
		if (cache == null) {
			return createCache(name);
		}
		return cache;
	}

    abstract TimeUnit getTimeUnit();
	
	abstract Integer getQuantity();	
}