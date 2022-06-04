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

WebUI.click(findTestObject('Object Repository/Page_Vascara  Thng hiu thi trang balo ti xc_4dbb52/a_V BP'))

WebUI.click(findTestObject('Object Repository/Page_Bp v n p hp thi trang cng s, d tic mi _904d27/img_V Cm Tay Kha Kim Loi Hnh N Nhiu Ngn_img6249'))

WebUI.click(findTestObject('Object Repository/Page_V Cm Tay Kha Kim Loi Hnh N Nhiu Ngn - _e7663a/div_MUA NGAY'))

WebUI.click(findTestObject('Object Repository/Page_V Cm Tay Kha Kim Loi Hnh N Nhiu Ngn - _e7663a/a_t mua ngay(giao hng tn ni)'))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/label_T HNG KHNG CN NG NHP'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_Email  S in thoi_fcontactemail'), Email)

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/button_Tip tc'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_H tn_fshippingfullname'), Ten)

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_S in thoi_fshippingphone'), SDT)

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/span_-- Chn Tnh  Thnh ph --'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    'Hà Nội')

WebUI.sendKeys(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/span_-- Chn Qun  Huyn --'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    'Nam Từ Liêm')

WebUI.sendKeys(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/span_-- Chn Phng  X --'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    'Trung Văn')

WebUI.sendKeys(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/textarea_a ch_fshippingaddress'), DC)

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/a_Giao n a ch ny'))

WebUI.verifyElementText(findTestObject('Page_Thanh ton  VASCARA/div_Vui lng nhp y  thng tin ngi nhn hng'), verify)

WebUI.closeBrowser()

