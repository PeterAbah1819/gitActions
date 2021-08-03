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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stagingwebsite.hicolumn.com/')

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_home_googlePlayImg__35zs1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Hicolumn - Apps on Google Play/span_Hicolumn'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hicolumn on the AppStore/h1_Hicolumn            12'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_WHY CHOOSE HICOLUMN'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_How it works'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Create your Store'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_List your Product'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Sell to Buyers'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_App Features'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Store Listings'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Bills Payment'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Easy product Search'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_features_featureImage__2OAUY'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Your online store is just a few clicks away'))

WebUI.scrollToPosition(50, 3000)

WebUI.click(findTestObject('Object Repository/spy objects/img_Contact Us_merchant_googlePlayImg__27602'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/spy objects/img'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Our Partners'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_partners_logos__3kHu7'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_partners_logos__3kHu7_1'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_partners_logos__3kHu7_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_partners_logos__3kHu7_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Contact Us_partners_logos__3kHu7_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Page_Hicolumn Website/input_Contact Us_email'), 'peter@enyata.com')

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/button_Subscribe'))

WebUI.closeBrowser()

