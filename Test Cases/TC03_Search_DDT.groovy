// POSITIVE + NEGATIVE + DDT - pencarian, data dari TD_SearchKeyword
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
def data = findTestData('TD_SearchKeyword')

for (int i = 1; i <= data.getRowNumbers(); i++) {
    WebUI.navigateToUrl(GlobalVariable.BASE_URL)
    WebUI.setText(findTestObject('Home/txt_Search'), data.getValue('keyword', i))
    WebUI.click(findTestObject('Home/btn_Search'))
    if (data.getValue('expectedResult', i) == 'found') {
        WebUI.verifyElementPresent(findTestObject('Search/lnk_FirstResult'), 5, FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        WebUI.verifyElementNotPresent(findTestObject('Search/lnk_FirstResult'), 5, FailureHandling.CONTINUE_ON_FAILURE)
    }
}
WebUI.closeBrowser()
