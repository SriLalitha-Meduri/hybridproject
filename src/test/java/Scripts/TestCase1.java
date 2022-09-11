package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillaryLoginPage;

public class TestCase1  extends BaseClass{
	@Test
	public void tc1() {
		SkillaryLoginPage s = new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.skillarydemoapplication();
		
		
	}

}
