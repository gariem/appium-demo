package org.gariem.samples.page;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

/**
 * Created by gariem on 9.4.2018.
 */
public class MapsHome extends BasePage {

    private By menuButton = By.id("com.google.android.apps.maps:id/search_omnibox_menu_button");
    private By searchTextbox = By.id("com.google.android.apps.maps:id/search_omnibox_text_box");
    private By firstSearchResult = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]");
    //private By placeName = By.id("com.google.android.apps.maps:id/title");
    private By placeName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ViewSwitcher/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");


    public MapsHome(AppiumDriver driver) {
        super(driver);
    }

    public void clickOnMenuButton() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuButton)).click();
    }

    public void searchByText(String text){
        wait.until(ExpectedConditions.presenceOfElementLocated(searchTextbox)).sendKeys(text);
    }

    public void tapOnFirstResult(){
        wait.until(ExpectedConditions.presenceOfElementLocated(firstSearchResult)).click();
    }

    public String getPlaceName(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(placeName)).getText();
    }

}
