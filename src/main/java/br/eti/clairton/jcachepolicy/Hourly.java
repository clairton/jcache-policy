package br.eti.clairton.jcachepolicy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Hourly extends ExpiryCacheResolverFactory{

    @Deprecated
    public Hourly() {
        this(null);
    }

    @Inject
	public Hourly(@HourlyExpiry final ExpiryCacheResolver resolver) {
		super(resolver);
	}
}
