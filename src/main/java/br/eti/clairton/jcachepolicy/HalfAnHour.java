package br.eti.clairton.jcachepolicy;

import static java.util.concurrent.TimeUnit.MINUTES;

import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HalfAnHour extends AbstractExpiryCacheResolverFactory {
	
	private static final AbstractExpiryCacheResolver resolver = new HalfAnHourExpiryCacheResolver();

	public HalfAnHour() {
		super(resolver);
	}

	private static class HalfAnHourExpiryCacheResolver extends AbstractExpiryCacheResolver {

		@Override
		TimeUnit getTimeUnit() {
			return MINUTES;
		}

		@Override
		Integer getQuantity() {
			return 30;
		}
	}
}
