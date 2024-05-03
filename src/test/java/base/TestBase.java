package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	private static  TestBase testbase;
	private static WebDriver driver;
	public static Properties prop;
	private TestBase() {
		String strBrowser="chrome";
		if(strBrowser.equalsIgnoreCase("chrome"))
{
	driver=new ChromeDriver();
}
else if(strBrowser.equalsIgnoreCase("edge"))
	driver=new EdgeDriver();
}
public static void initDriver() {
	if(testbase==null) {
		testbase=new TestBase();
	}
}
public static WebDriver getDriver()
{
	return driver;
}
public static void openUrl(String url) {
	driver.get(url);
}
public static void tearDown() {
	{
		if (driver!=null)
	
		driver.close();
	driver.quit();
}
testbase=null;
}
	}

