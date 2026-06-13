package com.automation;

import io.appium.java_client.AppiumBy; 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.io.File;
import java.net.URL;
import java.time.Duration;

public class AppTest {

    AndroidDriver driver;

    @BeforeTest
    public void setup() throws Exception {
        File apkPath = new File("apk/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");

        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("Android")
                .setUdid("1a50a4c40404")
                .setAutomationName("UiAutomator2")
                .setApp(apkPath.getAbsolutePath())
                .setNoReset(true);

        options.setCapability("appium:appWaitActivity", "com.swaglabsmobileapp.MainActivity");
        options.setCapability("appium:unicodeKeyboard", true);

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723/"),
                options
        );

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("App berhasil dibuka dan dikenali Appium!");
    }

    @Test
    public void testSuccessfulLogin() {
        System.out.println("Memulai skenario login...");

        // 1. Input Username
        WebElement usernameField = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='test-Username']"));
        usernameField.click();
        usernameField.sendKeys("standard_user");

        // 2. Input Password
        WebElement passwordField = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc='test-Password']"));
        passwordField.click();
        passwordField.sendKeys("secret_sauce");

        // 3. Klik Tombol Login
        WebElement loginButton = driver.findElement(AppiumBy.xpath("//*[@content-desc='test-LOGIN']"));
        loginButton.click();
        System.out.println("Tombol Login diklik otomatis.");

        // 4. Validasi: Pastikan area katalog produk muncul di layar setelah login
        WebElement productHeader = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='PRODUCTS']"));
        
        if (productHeader.isDisplayed()) {
            System.out.println("LOGIN SUKSES: Halaman produk berhasil dimuat!");
        } else {
            System.out.println("LOGIN GAGAL: Elemen produk tidak ditemukan.");
        }
    }
}