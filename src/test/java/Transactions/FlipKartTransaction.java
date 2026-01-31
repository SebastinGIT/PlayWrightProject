package Transactions;

import Base.PlayWrightBase;

import java.time.Duration;

public class FlipKartTransaction extends PlayWrightBase {

    public boolean OpenFlipKartAndSearchForAProduct(){
        try {
            getPlaywrightBrowser(Duration.ofSeconds(30));
            page.navigate("https://www.flipkart.com");
            System.out.println("Navigated to FlipKart.com");

            //Maximize the window
            page.setViewportSize(1920, 1080);
            System.out.println("Browser window maximized");

            String pageTitle = page.title();
            System.out.println("Title of the page : " + pageTitle);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return  false;
        }
    }

}
