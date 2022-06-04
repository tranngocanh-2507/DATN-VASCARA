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

WebUI.navigateToUrl('https://www.vascara.com/')

WebUI.click(findTestObject('Object Repository/Page_Vascara  Thng hiu thi trang balo ti xc_4dbb52/a_NG K'))

WebUI.setText(findTestObject('Object Repository/Page_ng k thnh vin vascara.com  VASCARA/input_H v tn_ffullname'), Ten)

WebUI.setText(findTestObject('Object Repository/Page_ng k thnh vin vascara.com  VASCARA/input_Mt khu ca bn_fpassword'), 
    MK)

WebUI.setText(findTestObject('Object Repository/Page_ng k thnh vin vascara.com  VASCARA/input_in thoi_fphone'), SDT)

WebUI.setText(findTestObject('Object Repository/Page_ng k thnh vin vascara.com  VASCARA/input_Email ca bn_femail'), Email)

WebUI.click(findTestObject('Object Repository/Page_ng k thnh vin vascara.com  VASCARA/form_Email ca bn                           _92dbfd'))

CheckURL = WebUI.getUrl()

WebUI.verifyEqual(CheckURL, 'https://www.vascara.com/register/')

WebUI.closeBrowser()

