package br.eti.clairton.jcachepolicy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class HalfAnHour extends ExpiryCacheResolverFactory {

    @Deprecated
    public HalfAnHour() {
        this(null);
    }
    
	@Inject
	public HalfAnHour(@HalfAnHourExpiry final ExpiryCacheResolver resolver) {
		super(resolver);
	}
}
