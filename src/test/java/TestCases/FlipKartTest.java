package TestCases;

import Base.PlayWrightBase;
import Transactions.FlipKartTransaction;
import org.junit.Before;
import org.junit.Test;

public class FlipKartTest extends PlayWrightBase {

    FlipKartTransaction flipKartTransaction;

    @Before
    public void initializeWebDriverAndTransaction(){
        flipKartTransaction =new FlipKartTransaction();
    }

    @Test
    public void openAmazonSite() throws InterruptedException {
        flipKartTransaction.OpenFlipKartAndSearchForAProduct();
    }

}
