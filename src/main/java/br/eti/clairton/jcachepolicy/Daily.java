package br.eti.clairton.jcachepolicy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Daily extends AbstractExpiryCacheResolverFactory{
    
    @Deprecated
    public Daily() {
        this(null);
    }
	
	@Inject
	public Daily(@DailyExpiry final AbstractExpiryCacheResolver resolver) {
		super(resolver);
	}
}
