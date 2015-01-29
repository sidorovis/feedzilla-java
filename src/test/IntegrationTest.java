package test;

import graef.feedzillajava.FeedZilla;

import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

	@Test
	public void testFeedZilla() {
		FeedZilla feedzilla = new FeedZilla();
		Assert.assertNotNull(feedzilla.getCategories());
		Assert.assertNotNull(feedzilla.getSubcategories());
	}

}
