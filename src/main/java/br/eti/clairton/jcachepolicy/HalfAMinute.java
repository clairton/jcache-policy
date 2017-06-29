package br.eti.clairton.jcachepolicy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class HalfAMinute extends ExpiryCacheResolverFactory {

    @Deprecated
    public HalfAMinute() {
        this(null);
    }
    
	@Inject
	public HalfAMinute(@HalfAMinuteExpiry final ExpiryCacheResolver resolver) {
		super(resolver);
	}
}
