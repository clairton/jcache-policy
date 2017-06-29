package br.eti.clairton.jcachepolicy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class QuarterOfAnHour extends ExpiryCacheResolverFactory {

    @Deprecated
    public QuarterOfAnHour() {
        this(null);
    }
    
	@Inject
	public QuarterOfAnHour(@QuarterOfAnHourExpiry final ExpiryCacheResolver resolver) {
		super(resolver);
	}
}
