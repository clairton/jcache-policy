package br.eti.clairton.jcachepolicy;

import java.lang.annotation.Annotation;

import javax.cache.annotation.CacheMethodDetails;
import javax.cache.annotation.CacheResolver;
import javax.cache.annotation.CacheResolverFactory;
import javax.cache.annotation.CacheResult;

public abstract class ExpiryCacheResolverFactory implements CacheResolverFactory{
	
	private final ExpiryCacheResolver resolver;

	public ExpiryCacheResolverFactory(final ExpiryCacheResolver resolver) {
		this.resolver = resolver;
	}

	@Override
	public CacheResolver getCacheResolver(final CacheMethodDetails<? extends Annotation> details) {
		return resolver;
	}

	@Override
	public CacheResolver getExceptionCacheResolver(final CacheMethodDetails<CacheResult> details) {
		return resolver;
	}
	
	public ExpiryCacheResolver getResolver() {
		return resolver;
	}
}
