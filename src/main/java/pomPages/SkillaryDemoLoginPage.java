package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryDemoLoginPage {
	
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(name="addresstype")
	private WebElement courseadd;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillaryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}

	public WebElement getCourseadd() {
		return courseadd;
	}
	
}
