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

WebUI.click(findTestObject('Object Repository/a_ng nhp'))

WebUI.click(findTestObject('Object Repository/a_Google'))

WebUI.setText(findTestObject('Object Repository/input_sachmemvn_identifier'), 'ductranvu24')

WebUI.click(findTestObject('Object Repository/span_Tip theo'))

WebUI.setEncryptedText(findTestObject('Object Repository/input_Qu nhiu ln th khng thnh cng_password'), 'jYXYZHePGAZzlgFj/54z5Q==')

WebUI.click(findTestObject('Object Repository/span_Tip theo'))

WebUI.click(findTestObject('Object Repository/a_Lp 4'))

WebUI.click(findTestObject('Object Repository/a_Luyn tp Ting Anh 4 Tp 1'))

WebUI.click(findTestObject('Object Repository/span_Giao bi tp'))

WebUI.setText(findTestObject('Object Repository/input_Ngy gi bt u_form-control ng-pristine ng-valid ng-touched'), 'abc')

WebUI.setText(findTestObject('Object Repository/input_Ngy gi bt u_form-control ng-touched ng-dirty ng-invalid'), 'Invalid date')

WebUI.setText(findTestObject('Object Repository/input_Ngy gi kt thc_form-control ng-untouched ng-pristine ng-valid'), 'abc')

WebUI.setText(findTestObject('Object Repository/input_Ngy gi kt thc_form-control ng-touched ng-dirty ng-invalid'), 'Invalid date')

WebUI.click(findTestObject('Object Repository/div_Lu  Sch min ph bn c th giao bi v khng b mt im tng                                M t                                                        Lp                        Chn lp hc'))

WebUI.closeBrowser()

