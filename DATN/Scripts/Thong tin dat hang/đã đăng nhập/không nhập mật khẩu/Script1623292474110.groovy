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

WebUI.click(findTestObject('Page_Vascara  Thng hiu thi trang balo ti xc_4dbb52/img-Hello'))

WebUI.click(findTestObject('Object Repository/Page_Vascara  Thng hiu thi trang balo ti xc_4dbb52/a_TI XCH'))

WebUI.click(findTestObject('Object Repository/Page_Ti xch n p online xu hng thi trang cng_b6ef8d/img_Balo Phoi Mau Khoa Marble Cach ieu_img5640'))

WebUI.click(findTestObject('Object Repository/Page_Balo Phoi Mau Khoa Marble Cach ieu - B_6b5ca4/div_MUA NGAY'))

WebUI.click(findTestObject('Object Repository/Page_Balo Phoi Mau Khoa Marble Cach ieu - B_6b5ca4/a_t mua ngay(giao hng tn ni)'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_Email  S in thoi_femail'), 'tranngoc@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/button_Tip tc'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/div_Vui lng nhp Email  S in thoi v Mt khu  ng nhp'), 
    'Vui lòng nhập Email / Số điện thoại và Mật khẩu để đăng nhập')

WebUI.closeBrowser()

