# jcache-policy [![Build Status](https://drone.io/github.com/clairton/jcache-policy/status.png)](https://drone.io/github.com/clairton/jcache-policy/latest)
Jcache Policy.

```java
@RequestScoped
public class TestCached {

	@CacheResult(cacheResolverFactory = MinutelyExpiryCacheResolverFactory.class)
	public String method() {
		return new Date().toString() + new Random().nextLong();
	}

}
```
Is possible use:
|Class|Time to expire|
|MinutelyExpiryCacheResolverFactory|1 minute|
|DailyExpiryCacheResolverFactory|1 day|
|HourlyExpiryCacheResolverFactory|1 hour|
|HalsAnHourExpiryCacheResolverFactory|30 minutes|

To use with maven, you need to add de repositories:

```xml
<repository>
	<id>mvn-repo-releases</id>
	<url>https://raw.github.com/clairton/mvn-repo/releases</url>
</repository>
<repository>
	<id>mvn-repo-snapshot</id>
	<url>https://raw.github.com/clairton/mvn-repo/snapshots</url>
</repository>
```
 And this:
```xml
<dependency>
    <groupId>br.eti.clairton</groupId>
	<artifactId>jcache-policy</artifactId>
	<version>0.1.0</version>
</dependency>
```