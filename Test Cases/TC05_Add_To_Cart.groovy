// POSITIVE - login lalu tambah item ke cart
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

WebUI.callTestCase(findTestCase('TC_Common_Login'), [:])
WebUI.click(findTestObject('Home/lnk_CategoryDogs'))
WebUI.click(findTestObject('Category/lnk_FirstProduct'))
WebUI.click(findTestObject('Product/lnk_FirstItem'))
WebUI.click(findTestObject('Item/btn_AddToCart'))
WebUI.verifyElementPresent(findTestObject('Cart/lbl_ShoppingCart'), 5)
WebUI.verifyElementPresent(findTestObject('Cart/lnk_ProceedCheckout'), 5)
WebUI.closeBrowser()
