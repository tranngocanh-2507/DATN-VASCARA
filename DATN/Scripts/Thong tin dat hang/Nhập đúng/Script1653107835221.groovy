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

WebUI.click(findTestObject('Object Repository/Page_Vascara  Thng hiu thi trang balo ti xc_4dbb52/a_BALO'))

WebUI.click(findTestObject('Object Repository/Page_Balo n p, balo cng s sang trng hp thi _b6d9da/img_Balo Np Gp Mu Kem Nhiu Ngn Phi Vin_img6183'))

WebUI.click(findTestObject('Object Repository/Page_Balo Np Gp Mu Trng Nhiu Ngn Phi Vin - _9999c2/div_MUA NGAY'))

WebUI.click(findTestObject('Object Repository/Page_Balo Np Gp Mu Trng Nhiu Ngn Phi Vin - _9999c2/a_t mua ngay(giao hng tn ni)'))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/label_T HNG KHNG CN NG NHP'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_Email  S in thoi_fcontactemail'), 'anh@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/button_Tip tc'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_H tn_fshippingfullname'), 'anh')

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_S in thoi_fshippingphone'), '0984402124')

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/span_-- Chn Tnh  Thnh ph --'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    'hà nội')

WebUI.sendKeys(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/span_-- Chn Qun  Huyn --'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    'nam từ liêm')

WebUI.sendKeys(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/span_-- Chn Phng  X --'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    'trung văn')

WebUI.sendKeys(findTestObject('Object Repository/Page_Thanh ton  VASCARA/input_concat(id(, , select2-fshippingregion_d1a646'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  VASCARA/textarea_a ch_fshippingaddress'), 'ád')

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  VASCARA/a_Giao n a ch ny'))

CheckURL = WebUI.getUrl()

WebUI.verifyEqual(CheckURL, 'https://www.vascara.com/cart/checkout?utm=pd')

WebUI.closeBrowser()

