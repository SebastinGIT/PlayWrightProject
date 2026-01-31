package TestCases;

import Base.PlayWrightBase;
import Transactions.FlipKartTransaction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlipKartTest extends PlayWrightBase {

    FlipKartTransaction flipKartTransaction;

    @Before
    public void initializeWebDriverAndTransaction(){
        flipKartTransaction =new FlipKartTransaction();
    }

    @Test
    public void openFlipKartSite() {
        Assert.assertTrue("Not Validated",flipKartTransaction.OpenFlipKartAndSearchForAProduct());
    }

}
