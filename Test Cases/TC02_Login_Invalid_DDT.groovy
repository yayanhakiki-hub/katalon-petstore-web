// NEGATIVE + DDT - login gagal, data dari TD_InvalidLogin
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
def data = findTestData('TD_InvalidLogin')

for (int i = 1; i <= data.getRowNumbers(); i++) {
    WebUI.navigateToUrl(GlobalVariable.BASE_URL)
    WebUI.click(findTestObject('Home/lnk_SignIn'))
    WebUI.setText(findTestObject('Login/txt_username'), data.getValue('username', i))
    WebUI.setText(findTestObject('Login/txt_password'), data.getValue('password', i))
    WebUI.click(findTestObject('Login/btn_Login'))
    WebUI.verifyElementPresent(findTestObject('Login/lbl_ErrorMessage'), 5, FailureHandling.CONTINUE_ON_FAILURE)
    String msg = WebUI.getText(findTestObject('Login/lbl_ErrorMessage'))
    WebUI.verifyMatch(msg, '.*' + data.getValue('expectedMessage', i) + '.*', true, FailureHandling.CONTINUE_ON_FAILURE)
}
WebUI.closeBrowser()
