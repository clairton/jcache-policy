package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.MINUTES;

import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MinutelyExpiryCacheResolverFactory extends AbstractExpiryCacheResolverFactory{
	
	private static final AbstractExpiryCacheResolver resolver = new MinutelyExpiryCacheResolver();

	public MinutelyExpiryCacheResolverFactory() {
		super(resolver);
	}

	private static class MinutelyExpiryCacheResolver extends AbstractExpiryCacheResolver  {
		

		@Override
		TimeUnit getTimeUnit() {
			return MINUTES;
		}
		
		@Override
		Integer getQuantity() {
			return 1;
		}
	}
}
