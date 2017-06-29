package br.eti.clairton.jcachepolicy;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Minutely extends AbstractExpiryCacheResolverFactory{
	
    @Deprecated
	public Minutely() {
        this(null);
    }

	public Minutely(@MinutelyExpiry final AbstractExpiryCacheResolver resolver) {
		super(resolver);
	}
}
