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

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log in'))

WebUI.click(findTestObject('Object Repository/Page_STORE/input_Username_loginusername'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_loginusername'), 'test8273@email.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_Password_loginpassword'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Laptops'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_MacBook air'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Laptops'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_MacBook Pro'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Name_name'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Country_country'), 'USA')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_City_city'), 'IA')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Credit card_card'), '98498484')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), 'Nov')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Year_year'), '2023')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Purchase'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_STORE/h2_Thank you for your purchase'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_OK'))

WebUI.closeBrowser()

