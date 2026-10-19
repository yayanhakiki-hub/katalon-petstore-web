// Dipanggil oleh TC01 & TC05 (reuse login). Credential dari Global Variable.
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.BASE_URL)
WebUI.click(findTestObject('Home/lnk_SignIn'))
WebUI.setText(findTestObject('Login/txt_username'), GlobalVariable.USERNAME)
WebUI.setText(findTestObject('Login/txt_password'), GlobalVariable.PASSWORD)
WebUI.click(findTestObject('Login/btn_Login'))
