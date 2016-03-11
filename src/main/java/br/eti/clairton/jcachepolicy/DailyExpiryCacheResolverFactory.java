package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.DAYS;

import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DailyExpiryCacheResolverFactory extends AbstractExpiryCacheResolverFactory{
	
	private static final AbstractExpiryCacheResolver resolver = new DailyExpiryCacheResolver();

	public DailyExpiryCacheResolverFactory() {
		super(resolver);
	}
	
	private static class DailyExpiryCacheResolver extends AbstractExpiryCacheResolver  {
		

		@Override
		TimeUnit getTimeUnit() {
			return DAYS;
		}
		
		@Override
		Integer getQuantity() {
			return 1;
		}
	}
}
