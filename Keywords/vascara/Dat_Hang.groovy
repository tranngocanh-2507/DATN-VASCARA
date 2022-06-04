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

public class Dat_Hang {
	@Keyword
	def Nhap_dung() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.vascara.com/')

		WebUI.click(findTestObject('Trang chu/QC'))

		WebUI.click(findTestObject('Page_Vascara  Thng hiu thi trang balo ti xc_4dbb52/button_BALO'))

		WebUI.click(findTestObject('Page_Balo n p, balo cng s sang trng hp thi _b6d9da/SP1'))

		WebUI.click(findTestObject('Page_Balo Np Gp Mu Trng Nhiu Ngn Phi Vin - _9999c2/button_MUA NGAY'))

		WebUI.click(findTestObject('Object Repository/Page_Balo Np Gp Mu Trng Nhiu Ngn Phi Vin - _9999c2/a_t mua ngay(giao hng tn ni)'))

		WebUI.click(findTestObject('Page_Thanh ton  VASCARA/ccb-khong can dang nhap'))

		WebUI.setText(findTestObject('Page_Thanh ton  VASCARA/input_Email'), 'anh@gmail.com')

		WebUI.click(findTestObject('Page_Thanh ton  VASCARA/button_Tiep tuc'))

		WebUI.setText(findTestObject('Page_Thanh ton  VASCARA/input_fullname_DH'), 'anh')

		WebUI.setText(findTestObject('Page_Thanh ton  VASCARA/input_SDT_DH'), '0984402124')
	}
	@Keyword
	def check() {
		String CheckURL = WebUI.getUrl()

		WebUI.verifyEqual(CheckURL, 'https://www.vascara.com/cart/checkout?utm=pd')
	}
	@Keyword
	def enter(String DC) {
		WebUI.click(findTestObject('thong tin dat hang/Chon Thanh Pho'))

		WebUI.setText(findTestObject('thong tin dat hang/Dia Chi'), 'Hà Nội')

		WebUI.sendKeys(findTestObject('thong tin dat hang/Dia Chi'), Keys.chord(Keys.ENTER))
		WebUI.click(findTestObject('thong tin dat hang/Chon Quan Huyen'))

		WebUI.setText(findTestObject('thong tin dat hang/Dia Chi'), 'Nam Từ Liêm')

		WebUI.sendKeys(findTestObject('thong tin dat hang/Dia Chi'), Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('thong tin dat hang/Chon Phuong Xa'))

		WebUI.setText(findTestObject('thong tin dat hang/Dia Chi'), 'Trung Văn')

		WebUI.sendKeys(findTestObject('thong tin dat hang/Dia Chi'), Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('thong tin dat hang/Nhap DC'), DC)

		WebUI.click(findTestObject('thong tin dat hang/Giao toi DC nay'))
	}
	@Keyword
	def ThongTinDatHang (String Email, String Ten, String SDT) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.vascara.com/')

		WebUI.click(findTestObject('Object Repository/Trang chu/QC'))

		WebUI.click(findTestObject('thong tin dat hang/button vi'))

		WebUI.click(findTestObject('Page_Bp v n p hp thi trang cng s, d tic mi _904d27/SP-vi'))

		WebUI.click(findTestObject('Gio-Hang/call/button_MUA NGAY'))

		WebUI.click(findTestObject('thong tin dat hang/Dat-mua-ngay'))

		WebUI.click(findTestObject('thong tin dat hang/ccb-khong can dang nhap'))

		WebUI.setText(findTestObject('thong tin dat hang/input_Email'), Email)

		WebUI.click(findTestObject('thong tin dat hang/button_Tiep tuc'))

		WebUI.setText(findTestObject('thong tin dat hang/input_fullname_DH'), Ten)

		WebUI.setText(findTestObject('thong tin dat hang/input_SDT_DH'), SDT)
	}
}
