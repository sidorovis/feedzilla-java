package graef.feedzillajava;

import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

	@Test
	public void testFeedZilla() {
		FeedZilla feedzilla = new FeedZilla(400000);
		Assert.assertNotNull(feedzilla.getCategories());
		Assert.assertNotNull(feedzilla.getSubcategories());
	}

}
