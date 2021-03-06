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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import internal.GlobalVariable

public class TimKiem {
	@Keyword
	def Tim_kiem(String Search) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.vascara.com/')
		WebUI.click(findTestObject('Object Repository/Trang chu/QC'))

		WebUI.setText(findTestObject('Tim Kiem/Search'), Search)

		WebUI.sendKeys(findTestObject('Tim Kiem/Search'), Keys.chord(Keys.ENTER))

		WebUI.verifyElementText(findTestObject('Tim Kiem/tuy chon sp'), 'Tuỳ chọn sắp xếp sản phẩm')

		WebUI.closeBrowser()
	}
}
