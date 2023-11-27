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

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/b_About Us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/b_Get in Touch'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/h4_PRODUCT STORE'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/p_We believe performance needs to be valida_b00240'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/p_Address 2390 El Camino Real'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/p_Phone 440 123456'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/p_Email demoblazemeter.com'), 0)

WebUI.closeBrowser()

