package Transactions;

import Base.PlayWrightBase;
import com.microsoft.playwright.Playwright;

import java.time.Duration;

public class FlipKartTransaction extends PlayWrightBase {

    public boolean OpenFlipKartAndSearchForAProduct(){
        try {
            getPlaywrightBrowser(Duration.ofSeconds(30));
            page.navigate("https://www.flipkart.com");
            System.out.println("Navigated to FlipKart.com");

            String pageTitle = page.title();
            System.out.println("Title of the page is: " + pageTitle);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return  false;
        }
    }

}
