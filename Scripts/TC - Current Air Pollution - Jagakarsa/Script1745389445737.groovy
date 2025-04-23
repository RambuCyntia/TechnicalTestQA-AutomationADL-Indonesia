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
response = WS.sendRequest(findTestObject('Object Repository/Current Air Pollution - Jagakarsa'))

// Verify Status Code
WS.verifyResponseStatusCode(response, 200)

//Verify Air Quality Index
def jsonResponse = new JsonSlurper().parseText(response.getResponseText())
def aqi = jsonResponse.list[0].main.aqi
def aqiDescription = ""

switch(aqi) {
	case 1:
		aqiDescription = "Good"
		break
	case 2:
		aqiDescription = "Fair"
		break
	case 3:
		aqiDescription = "Moderate"
		break
	case 4:
		aqiDescription = "Poor"
		break
	case 5:
		aqiDescription = "Very Poor"
		break
	default:
		aqiDescription = "Good"
}

def ResponseBody = [
	location: "Cilandak, Jakarta Selatan",
	AQI: aqi,
	description: aqiDescription
]

println new groovy.json.JsonBuilder(ResponseBody).toPrettyString()

//Tampilkan di PDF Report
KeywordUtil.markPassed("AQI: $aqi")
KeywordUtil.markPassed("Description: $aqiDescription")

Thread.sleep(1000)


