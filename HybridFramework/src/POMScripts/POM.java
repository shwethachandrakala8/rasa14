package POMScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
@FindBy(id="email")
private WebElement email_id;

@FindBy(id="pass")
private WebElement password;


@FindBy(name="login")
private WebElement lgn_btn;


public POM (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void email(String user)
{
	email_id.sendKeys(user);
	
}
public void passwd(String pass)
{
	password.sendKeys(pass);
}
public void login()
{
	lgn_btn.click();
}
}
