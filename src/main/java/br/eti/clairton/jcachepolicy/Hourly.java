package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.HOURS;

import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Hourly extends AbstractExpiryCacheResolverFactory{
	
	private static final AbstractExpiryCacheResolver resolver = new HourlyExpiryCacheResolver();

	public Hourly() {
		super(resolver);
	}

	private static class HourlyExpiryCacheResolver extends AbstractExpiryCacheResolver  {
		

		@Override
		TimeUnit getTimeUnit() {
			return HOURS;
		}
		
		@Override
		Integer getQuantity() {
			return 1;
		}
	}
}
