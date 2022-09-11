package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillaryDemoLoginPage;
import pomPages.SkillaryLoginPage;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() throws IOException {
		SkillaryLoginPage s = new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.skillarydemoapplication();
		
		SkillaryDemoLoginPage sd = new SkillaryDemoLoginPage(driver);
		utilies.switchingtabs(driver);
	}
	

}
