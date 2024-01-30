import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://myskill.id/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_Masuk  MySkill/input_email'), 'alvinmalikibrahim3@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Masuk  MySkill/div_EmailEmailPasswordPassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  MySkill/input_password'), 'E4paS9pRTYkovj32nzuUnQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Masuk  MySkill/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Si Paling Belajar  MySkill/div_HomeE-learningBootcamp  ProgramMentorin_e325b6'))

WebUI.click(findTestObject('Object Repository/Page_Si Paling Belajar  MySkill/a_Bootcamp  Program'))

WebUI.click(findTestObject('Object Repository/Page_Bootcamp  Program  MySkill/img_MuiBox-root mui-style-1i9snxo'))

WebUI.click(findTestObject('Object Repository/Page_DIGITAL MARKETING FULLSTACK INTENSIVE _e4d593/button_Daftar Sekarang'))

WebUI.click(findTestObject('Object Repository/Page_DIGITAL MARKETING FULLSTACK INTENSIVE _e4d593/button_Daftar Sekarang_1'))

WebUI.click(findTestObject('Object Repository/Page_DIGITAL MARKETING FULLSTACK INTENSIVE _e4d593/div_MuiBackdrop-root MuiBackdrop-invisible _a9706a'))

WebUI.click(findTestObject('Object Repository/Page_DIGITAL MARKETING FULLSTACK INTENSIVE _e4d593/span_15 Januari 2024 - 1 Maret 2024'))

WebUI.click(findTestObject('Object Repository/Page_DIGITAL MARKETING FULLSTACK INTENSIVE _e4d593/button_Lanjut Pendaftaran'))

WebUI.click(findTestObject('Object Repository/Page_DIGITAL MARKETING FULLSTACK INTENSIVE _e4d593/button_Lanjutkan Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Payment  MySkill/button_Pilih Metode Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Payment  MySkill/span_GoPay'))

WebUI.click(findTestObject('Object Repository/Page_Payment  MySkill/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Page_Payment  MySkill/button_Lanjut Bayar'))

WebUI.click(findTestObject('Object Repository/Page_/button_Back to merchant'))

WebUI.click(findTestObject('Object Repository/Page_Invoice  MySkill/button_Download PDF'))

