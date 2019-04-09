import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp (2)'))

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/a_Google (1)'))

WebUI.setText(findTestObject('Page_ng nhp - Ti khon Google/input_sachmemvn_identifier (1)'), 'ductranvu24')

WebUI.click(findTestObject('Page_ng nhp - Ti khon Google/span_Tip theo (1)'))

WebUI.setEncryptedText(findTestObject('Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password (1)'), 'jYXYZHePGAZzlgFj/54z5Q==')

WebUI.click(findTestObject('Page_ng nhp - Ti khon Google/span_Tip theo (1)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp 4 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Luyn tp Ting Anh 4 Tp 1 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Giao bi tp (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Ngy gi bt u'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi bt u_form-control text-center bs-timepicker-field'), 
    'ab')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi bt u_form-control text-center bs-timepicker-field is-invalid'), 
    'ab')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi kt thc_form-control text-center bs-timepicker-field'), 
    'ab')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi kt thc_form-control text-center bs-timepicker-field is-invalid'), 
    'ab')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__form-control text-center bs-timepicker-field'), 
    'ab')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__form-control text-center bs-timepicker-field is-invalid'), 
    'ab')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__form-control text-center bs-timepicker-field'), 
    'ab')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__form-control text-center bs-timepicker-field is-invalid'), 
    'ab')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary'))

WebUI.closeBrowser()

