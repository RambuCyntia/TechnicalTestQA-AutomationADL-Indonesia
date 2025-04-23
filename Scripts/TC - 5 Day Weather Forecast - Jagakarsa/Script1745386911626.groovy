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
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import static org.assertj.core.api.Assertions.*
import com.kms.katalon.core.util.KeywordUtil

// Send API Request
response = WS.sendRequest(findTestObject('Object Repository/5 Day Weather Forecast - Jagakarsa'))

// Verify Status Code
WS.verifyResponseStatusCode(response, 200)


// Verify Response Body City Name
def city = WS.getElementPropertyValue(response, 'city.name')
KeywordUtil.logInfo("City in response: $city")
assert city.contains("Jagakarsa")

//Verify Date
def jsonResponse = new JsonSlurper().parseText(response.getResponseText())
assert jsonResponse.list[0].dt_txt.startsWith("2025-04-23")

Thread.sleep(1000)

