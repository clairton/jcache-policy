package br.eti.clairton.jcachepolicy;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiTestRunner.class)
public class CacheResolverFactoryTest {	
	
	private @Inject TestCached test;

	@Test
	public void test() {
		final String result = test.method();
		//when the second call, the same result, because is cached
		assertEquals(result, test.method());
	}
}
