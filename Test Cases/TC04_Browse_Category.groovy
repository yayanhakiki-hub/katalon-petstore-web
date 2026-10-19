// POSITIVE - buka kategori Fish sampai detail item
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.BASE_URL)
WebUI.click(findTestObject('Home/lnk_CategoryFish'))
WebUI.verifyElementPresent(findTestObject('Category/lnk_FirstProduct'), 5)
WebUI.click(findTestObject('Category/lnk_FirstProduct'))
WebUI.verifyElementPresent(findTestObject('Product/lnk_FirstItem'), 5)
WebUI.click(findTestObject('Product/lnk_FirstItem'))
WebUI.verifyElementPresent(findTestObject('Item/btn_AddToCart'), 5)
WebUI.closeBrowser()
