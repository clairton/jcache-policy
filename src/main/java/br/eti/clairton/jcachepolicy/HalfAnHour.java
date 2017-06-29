package br.eti.clairton.jcachepolicy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class HalfAnHour extends AbstractExpiryCacheResolverFactory {

    @Deprecated
    public HalfAnHour() {
        this(null);
    }
    
	@Inject
	public HalfAnHour(@HalfAnHourExpiry final AbstractExpiryCacheResolver resolver) {
		super(resolver);
	}
}
