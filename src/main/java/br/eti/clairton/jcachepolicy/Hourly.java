package br.eti.clairton.jcachepolicy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Hourly extends AbstractExpiryCacheResolverFactory{

    @Deprecated
    public Hourly() {
        this(null);
    }

	public Hourly(@HourlyExpiry final AbstractExpiryCacheResolver resolver) {
		super(resolver);
	}
}
