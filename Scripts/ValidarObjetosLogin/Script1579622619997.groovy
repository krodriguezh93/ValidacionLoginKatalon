import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('http://automationpractice.com/index.php')
WebUI.maximizeWindow()
if(WebUI.waitForElementPresent(findTestObject('Object Repository/Page_My Store/a_Sign in'), 5)){
	WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))
	if(WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Login - My Store/Email address'), 5)){
		WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/Email address'), 'ljsdkjf@5')
		if(WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Login - My Store/Password'), 5)){
			WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/Password'), '1234')
			if(WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Login - My Store/Sign in'), 5)){
				WebUI.click(findTestObject('Object Repository/Page_Login - My Store/Sign in'))
				if(WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Login - My Store/Mensaje de Error'), 5)){
					KeywordUtil.markPassed("Caso de prueba completada exitosamente")
				} else{
						KeywordUtil.markPassed("Objeto Sign in no encontrado")
				}
				
			} else{
					 KeywordUtil.markPassed("Objeto Sign in no encontrado")
			}
		
		} else{
				KeywordUtil.markPassed("Objeto Password no encontrado")
		}
		
	} else{
			KeywordUtil.markPassed("Objeto Email address no encontrado")
	}
} else{
		KeywordUtil.markPassed("Objeto Sign in no encontrado")
}



