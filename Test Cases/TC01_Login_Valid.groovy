// POSITIVE - login dengan credential dari Global Variable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable

WebUI.callTestCase(findTestCase('TC_Common_Login'), [:])
WebUI.verifyElementPresent(findTestObject('Home/lnk_SignOut'), 10)
WebUI.closeBrowser()
