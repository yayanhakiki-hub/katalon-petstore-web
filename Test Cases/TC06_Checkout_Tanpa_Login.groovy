// NEGATIVE - checkout tanpa login harus diarahkan ke halaman Sign In
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.BASE_URL)
WebUI.click(findTestObject('Home/lnk_CategoryCats'))
WebUI.click(findTestObject('Category/lnk_FirstProduct'))
WebUI.click(findTestObject('Product/lnk_FirstItem'))
WebUI.click(findTestObject('Item/btn_AddToCart'))
WebUI.click(findTestObject('Cart/lnk_ProceedCheckout'))
WebUI.verifyElementPresent(findTestObject('Login/btn_Login'), 5)
WebUI.closeBrowser()
