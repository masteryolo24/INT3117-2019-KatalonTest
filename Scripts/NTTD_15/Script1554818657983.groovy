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

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/a_Google'))

WebUI.setText(findTestObject('Page_ng nhp - Ti khon Google/input_sachmemvn_identifier'), 'ductranvu24')

WebUI.click(findTestObject('Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.setEncryptedText(findTestObject('Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password'), 'jYXYZHePGAZzlgFj/54z5Q==')

WebUI.click(findTestObject('Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_Lp hc ca ti'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_Test'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/div_Nhn tin trao i'))

WebUI.setText(findTestObject('Page_Hc liu - Sch Mm/textarea_jhsakdhad_message_content'), 'Test\n')

WebUI.closeBrowser()

