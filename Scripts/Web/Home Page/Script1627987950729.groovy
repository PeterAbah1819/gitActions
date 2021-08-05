import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Open browser
WebUI.openBrowser('')

//Navigate to the staging url
WebUI.navigateToUrl('https://stagingwebsite.hicolumn.com/')

//Click on the HiColumn logo to see if it reloads the home page
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Home_navbar_navbarLogo__WUwLK'))

//Click on the home button to see if it reloads the home page
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/a_Home'))

//Delay for a sec
WebUI.delay(1)

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Buying  selling made easy'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Join hundreds of users who trust Hicolumn_eae52c'))

//Click to download app from google play store
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_home_googlePlayImg__35zs1'))

//Verify that page was redirected to google play store
WebUI.click(findTestObject('Object Repository/Page_Hicolumn - Apps on Google Play/span_Hicolumn'))

//Go back to HiColumn site
WebUI.back()

//Click to download app from apple app store
WebUI.click(findTestObject('New Guys/img'))

//Verify that page was redirected to apple app store
WebUI.click(findTestObject('Object Repository/Page_Hicolumn on the AppStore/h1_Hicolumn            12'), FailureHandling.CONTINUE_ON_FAILURE)

//Go back to HiColumn site
WebUI.back()

//Click verify text present
WebUI.click(findTestObject('New Guys/p_WHY CHOOSE HICOLUMN'))

//Click verify text present
WebUI.click(findTestObject('New Guys/p_How it works'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Create your Store'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_List your Product'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Sell to Buyers'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_App Features'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Store Listings'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Flight Booking'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Bills Payment'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Easy product Search'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_HICOLUMN MERCHANT'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Your online store is just a few clicks away'))

//Scroll to position
WebUI.scrollToPosition(50, 3000)

//Click to download app from google play store
WebUI.click(findTestObject('Object Repository/spy objects/img_Contact Us_merchant_googlePlayImg__27602'))

//Delay for 2secs
WebUI.delay(2)

//Verify that page was redirected to google play store
WebUI.click(findTestObject('Object Repository/Page_Hicolumn - Apps on Google Play/span_Hicolumn'))

//Go back to HiColumn site
WebUI.back()

//Click to download app from apple app store
WebUI.click(findTestObject('Object Repository/spy objects/img'))

//Delay for 3secs
WebUI.delay(3)

//Click to download app from apple app store
WebUI.click(findTestObject('Object Repository/Page_Hicolumn on the AppStore/h1_Hicolumn            12'))

//Go back to HiColumn site
WebUI.back()

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Our Partners'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_partners_logos__3kHu7'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_partners_logos__3kHu7_1'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_partners_logos__3kHu7_1_2'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_partners_logos__3kHu7_1_2_3'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_partners_logos__3kHu7_1_2_3_4'))

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Join other smart shoppers'))

//Scroll to position
WebUI.scrollToPosition(50, 4000)

//Click to download app from google play store
WebUI.click(findTestObject('Object Repository/Spy objects lower/img_Contact Us_partners_googlePlayImg__3ymfB'))

//Delay for 2secs
WebUI.delay(2)

//Verify that page was redirected to google play store
WebUI.click(findTestObject('Object Repository/Page_Hicolumn - Apps on Google Play/span_Hicolumn'))

//Go back to HiColumn site
WebUI.back()

//Click to download app from apple app store
WebUI.click(findTestObject('Object Repository/Spy objects lower/img'))

//Delay for 2secs
WebUI.delay(2)

//Verify that page was redirected to apple app store
WebUI.click(findTestObject('Object Repository/Page_Hicolumn on the AppStore/h1_Hicolumn            12'))

//Go back to HiColumn site
WebUI.back()

//Click verify text present
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Join Our Newsletter'))

//Set text 'email' for newsletters
WebUI.setText(findTestObject('Object Repository/Page_Hicolumn Website/input_Contact Us_email'), 'peter@enyata.com')

//Click on the subscribe button
WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/button_Subscribe'))

//Close browser
WebUI.closeBrowser()

