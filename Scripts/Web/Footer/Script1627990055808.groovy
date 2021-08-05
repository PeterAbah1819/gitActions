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

WebUI.scrollToPosition(50, 6000)

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_Subscribe_footer_footerLinkHeading__2dW1j'))

WebUI.click(findTestObject('New Guys/New 2/p_2 Adewunmi Estate, First Bank Bus Stop, Kudiratu Abiola Way, Oregun, Lagos.Nigeria'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Quick Links'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/a_Features'))

WebUI.scrollToPosition(50, 6000)

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/a_About'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/a_Contact'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Legals'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/a_Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/a_Terms of Service'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_CONTACT US'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/a_234 0 809 488 5420'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/a_infohicolumn.com'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Follow us'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img'))

WebUI.delay(4)

WebUI.navigateToUrl('https://stagingwebsite.hicolumn.com/')

WebUI.scrollToPosition(50, 6000)

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img_1_2'))

//This failed
WebUI.back()

WebUI.navigateToUrl('https://stagingwebsite.hicolumn.com/')

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/img'))

WebUI.click(findTestObject('Object Repository/Page_Hicolumn Website/p_Copyright  2021 Hicolumn - All Rights Reserved'))

WebUI.closeBrowser()

