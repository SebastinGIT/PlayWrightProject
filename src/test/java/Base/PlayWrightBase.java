package Base;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Browser;

import java.time.Duration;

public abstract class PlayWrightBase {

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    public Page getPlaywrightBrowser(Duration timeout) {

        //Get Playwright Instance
        playwright = Playwright.create();

        //Get Browser Instance
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setTimeout(timeout.toMillis())
        );
        //Get Page Instance
        page = browser.newPage();

        //Return Page Instance
        return page;
    }


}
