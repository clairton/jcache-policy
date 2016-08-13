package br.eti.clairton.jcachepolicy;

import static javax.cache.Caching.getCachingProvider;
import static javax.cache.expiry.AccessedExpiryPolicy.factoryOf;

import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.annotation.CacheInvocationContext;
import javax.cache.annotation.CacheResolver;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.expiry.Duration;
import javax.cache.spi.CachingProvider;

public abstract class AbstractExpiryCacheResolver implements CacheResolver{

	protected final CacheManager manager;

	public AbstractExpiryCacheResolver() {
		final CachingProvider provider = getCachingProvider();
		manager = provider.getCacheManager(provider.getDefaultURI(), provider.getDefaultClassLoader());
	}

	@Override
	public <K, V> Cache<K, V> resolveCache(final CacheInvocationContext<? extends Annotation> context) {
		final String name = context.getCacheName();
		return getOrCreateCache(name);
	}

	private synchronized <K, V> Cache<K, V> getOrCreateCache(String name) {
		Cache<K, V> cache = manager.getCache(name);
		if (cache == null) {
			final MutableConfiguration<K, V> configuration = new MutableConfiguration<K, V>();
			configuration.setExpiryPolicyFactory(factoryOf(new Duration(getTimeUnit(), getQuantity())));
			cache = manager.createCache(name, configuration);
		}
		return cache;
	}

	abstract TimeUnit getTimeUnit();
	
	abstract Integer getQuantity();	
}