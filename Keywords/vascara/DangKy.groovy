package vascara

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import internal.GlobalVariable

public class DangKy {
	@Keyword
	def dk1 () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.vascara.com/register/')
	}
	@Keyword
	def DK_Emai_sai(String Email) {
		WebUI.setText(findTestObject('Dang-Ky/input-fullname'), 'Anh')

		WebUI.setText(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/input-password'), 'anh12344')

		WebUI.setText(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/input_phone'), '0985402127')

		WebUI.setText(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/input_Email'), Email)

		WebUI.click(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/button-dang-ky'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Dang-Ky/key/Thongbao-Email'), 0)
		WebUI.closeBrowser()
	}
	@Keyword
	def DK_SDT_sai(String SDT) {
		WebUI.setText(findTestObject('Dang-Ky/input-fullname'), 'Anh')

		WebUI.setText(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/input-password'), 'anh12344')

		WebUI.setText(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/input_Email'), 'tranngocanh250700@gmail.com')

		WebUI.setText(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/input_phone'), SDT )

		WebUI.click(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/button-dang-ky'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Dang-Ky/key/Thongbao_SDT'), 0)
		WebUI.closeBrowser()
	}
	@Keyword
	def DK_MK_sai(String MK) {
		WebUI.setText(findTestObject('Dang-Ky/input-fullname'), '@#$%^')

		WebUI.setText(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/input-password'), MK)

		WebUI.setText(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/input_Email'), 'tranngocanh1222222220@gmail.com')

		WebUI.setText(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/input_phone'), '0993781643' )

		WebUI.click(findTestObject('Object Repository/Dang-Ky/key/Key-button-DK'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Dang-Ky/key/Thongbao_MK'), 0)
		WebUI.closeBrowser()
	}
	@Keyword
	def DK (String Ten, String MK, String SDT, String Email) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.vascara.com/register/')

		WebUI.setText(findTestObject('Dang-Ky/input-fullname'), Ten)

		WebUI.setText(findTestObject('Dang-Ky/input-password'), MK)

		WebUI.setText(findTestObject('Dang-Ky/input_phone'), SDT)

		WebUI.setText(findTestObject('Dang-Ky/input_Email'), Email)

		WebUI.click(findTestObject('Page_ng k thnh vin vascara.com  VASCARA/button-dang-ky'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Dang-Ky/DK-Thành viên'), 0)

		WebUI.closeBrowser()
	}
}
