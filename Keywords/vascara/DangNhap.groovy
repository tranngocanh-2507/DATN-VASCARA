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

import internal.GlobalVariable

public class DangNhap {

	@Keyword
	def DN_Key (String Email, String MK ) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.vascara.com/login/')

		WebUI.setText(findTestObject('Đang_Nhap/Page_ng nhp  VASCARA/input_Email'), Email)

		WebUI.click(findTestObject('Đang_Nhap/Page_ng nhp  VASCARA/input_tiep-tuc'))

		if (Email == 'Tranngocanh250700@gmail.com') {
			WebUI.setText(findTestObject('Đang_Nhap/Page_ng nhp  VASCARA/input_MK'), MK)

			WebUI.click(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/button-DN'))

			WebUI.verifyElementPresent(findTestObject('Object Repository/Đang_Nhap/key_MK/Thong-bao-mk'),0 )
		} else {

			WebUI.verifyElementPresent(findTestObject('Object Repository/Đang_Nhap/Key-Email/ThongBao'), 0)
		}

		WebUI.closeBrowser()
	}
	@Keyword
	def DN_Dung(String Email, String MatKhau) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.vascara.com/login/')
		WebUI.setText(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/input_Email'), Email)
		WebUI.click(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/input_tiep-tuc'))
		WebUI.setText(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/input_MK'), MatKhau)
		WebUI.click(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/button-DN'))
		WebUI.click(findTestObject('Object Repository/Trang chu/QC'), null)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/anh'), 0)
		WebUI.closeBrowser()
	}
	@Keyword
	def DN_Sai_Email(String Email) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.vascara.com/login/')
		WebUI.setText(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/input_Email'), Email)
		WebUI.click(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/input_tiep-tuc'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Đang_Nhap/Key-Email/ThongBao'), 0)
		WebUI.closeBrowser()
	}
	@Keyword
	def DN_Sai_MatKhau(String MatKhau ) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.vascara.com/login/')
		WebUI.setText(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/input_Email'),'Tranngocanh250700@gmail.com')
		WebUI.click(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/input_tiep-tuc'))
		WebUI.setText(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/input_MK'), MatKhau)
		WebUI.click(findTestObject('Object Repository/Đang_Nhap/Page_ng nhp  VASCARA/button-DN'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Đang_Nhap/key_MK/Thong-bao-mk'), 0)
		WebUI.closeBrowser()
	}
}
