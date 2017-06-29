package br.eti.clairton.jcachepolicy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Minutely extends ExpiryCacheResolverFactory{
	
    @Deprecated
	public Minutely() {
        this(null);
    }

    @Inject
	public Minutely(@MinutelyExpiry final ExpiryCacheResolver resolver) {
		super(resolver);
	}
}
