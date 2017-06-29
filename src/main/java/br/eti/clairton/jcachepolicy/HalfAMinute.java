package br.eti.clairton.jcachepolicy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class HalfAMinute extends AbstractExpiryCacheResolverFactory {

    @Deprecated
    public HalfAMinute() {
        this(null);
    }
    
	@Inject
	public HalfAMinute(@HalfAMinuteExpiry final AbstractExpiryCacheResolver resolver) {
		super(resolver);
	}
}
