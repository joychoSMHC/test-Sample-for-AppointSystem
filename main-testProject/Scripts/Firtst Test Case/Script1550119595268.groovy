import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://katalon-demo-cura.herokuapp.com/")
selenium.click("id=btn-make-appointment")
selenium.click("id=txt-username")
selenium.type("id=txt-username", "John Doe")
selenium.click("id=txt-password")
selenium.type("id=txt-password", "ThisIsNotAPassword")
selenium.click("id=btn-login")
selenium.click("id=combo_facility")
selenium.select("id=combo_facility", "label=Hongkong CURA Healthcare Center")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Facility'])[1]/following::label[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Healthcare Program'])[1]/following::label[2]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Healthcare Program'])[1]/following::label[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Visit Date (Required)'])[1]/following::span[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[13]")
selenium.click("id=txt_comment")
selenium.click("id=txt_comment")
selenium.click("id=txt_comment")
selenium.type("id=txt_comment", "This is a Comment")
selenium.click("id=btn-book-appointment")
selenium.click("link=Go to Homepage")
