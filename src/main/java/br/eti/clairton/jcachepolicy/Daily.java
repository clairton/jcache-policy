package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.DAYS;

import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Daily extends AbstractExpiryCacheResolverFactory{
	
	private static final AbstractExpiryCacheResolver resolver = new DailyExpiryCacheResolver();

	public Daily() {
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
