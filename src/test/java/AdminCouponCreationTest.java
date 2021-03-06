import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class AdminCouponCreationTest extends TestBase {

    @Test(groups = {"admin"})
    public void addNewCoupon() {
        app.loginToAdmin();
        app.adminCouponPage().clickOnWooCommerceMenu();
        app.adminCouponPage().clickOnWooCommerceMenu();
        app.adminCouponPage().clickOnCouponsMenu();
        app.adminCouponPage().clickOnAddCouponButton();
        app.adminCouponPage().clickOnGeneralTab();
        app.adminCouponPage().insertCouponAmount();
        app.adminCouponPage().clickOnDiscountTypeDropdownLocator();
        app.adminCouponPage().clickOnExpireDateField().insertExpireDate();
        app.adminCouponPage().chooseFixedCartOption();
        app.adminCouponPage().insertCouponCode();
        app.adminCouponPage().insertDescription();
        app.adminCouponPage().clickOnPublishButton();

        assertTrue(app.adminCouponPage().successMessageIsDisplayed());
    }

    @AfterMethod
    public void deleteTestCoupon () {
        app.adminCouponPage().moveToTrashTestCoupon();
        assertTrue(app.adminCouponPage().successDeletionMessageIsDisplayed());
    }


}