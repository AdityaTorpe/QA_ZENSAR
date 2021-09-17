import org.openqa.selenium.edge.EdgeDriver;

public class Testcls {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\eclipse-workspace\\Seleniumsample\\driver\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String cu = driver .getCurrentUrl();
		System.out.println(cu);
		
		driver.close();
	}
}
