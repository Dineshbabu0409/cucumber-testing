package sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}

	public static void windowMaximize() {
	driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
	driver.get(url);
	}

	public static String pageTitle() {
	String title = driver.getTitle();
	return title;
	}

	public static String pageUrl() {
	String Url = driver.getCurrentUrl();
	return Url;
	}

	public static void passText(String txt, WebElement ele) {
	ele.sendKeys(txt);
	}

	public static void closeEntrieBrowser() {
	driver.quit();
	}

	public static void clickBtn(WebElement ele) {
	ele.click();

	}

	public static void screenShot(String imgName) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File image = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("location + imgName.png");
	FileUtils.copyDirectory(image, f);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetWebElement) {
	a = new Actions(driver);
	a.moveToElement(targetWebElement).perform();

	}

	public static void dragdrop(WebElement dragWebElement, WebElement dropElement) {
	a = new Actions(driver);
	a.dragAndDrop(dragWebElement, dropElement).perform();
	}

	public static JavascriptExecutor js;

	public static void scrollThepage(WebElement tarWebEle) {
	js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", tarWebEle);

	}





	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
	File f = new File("");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheet(sheetName);
	Row r = sheet.getRow(rowNum);
	Cell c = r.getCell(cellNum);
	int cellType = c.getCellType();

	String value = " ";
	if (cellType == 1) {
	String value2 = c.getStringCellValue();

	} else if (DateUtil.isCellDateFormatted(c)) {
	Date dd = c.getDateCellValue();
	SimpleDateFormat s = new SimpleDateFormat(value);
	String format = s.format(dd);
	} else {
	double d = c.getNumericCellValue();
	long l = (long) d;
	String valueOf = String.valueOf(l);

	}

	}

	public static void createNewExcelFile(int rowNum, int cellNum, String writeData) throws IOException {
	File f = new File("");
	Workbook w = new XSSFWorkbook();
	Sheet newsheet = w.createSheet("");
	Row newrow = newsheet.createRow(rowNum);
	Cell newCell = newrow.createCell(cellNum);
	newCell.setCellValue(writeData);
	FileOutputStream fos = new FileOutputStream(f);
	w.write(fos);

	}

	public static void createCell(int rowNum, int cellNum, String newData) throws IOException {
	File f = new File("");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet Mysheet = wb.getSheet("");
	Row newrow = Mysheet.createRow(rowNum);
	Cell newcell = newrow.createCell(cellNum);
	newcell.setCellValue(newData);
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);

	}

	public static void CreateRow(int creRow, int crecell, String newData) throws IOException {
	File f = new File("");
	FileInputStream fis = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fis);
	Sheet s = w.getSheet("");
	Row newrow = s.createRow(creRow);
	Cell newcell = newrow.createCell(crecell);
	newcell.setCellValue(newData);
	FileOutputStream fos = new FileOutputStream(f);
	w.write(fos);
	}

	public static void updateDateToParticularCell(int getTheRow, int getThecell, String exisitingData,
	String writeNewData) throws IOException {
	File f = new File("");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheet(writeNewData);
	Row r = s.getRow(getTheRow);
	Cell c = r.getCell(getThecell);
	String str = c.getStringCellValue();
	if (str.equals(exisitingData)) {
	c.setCellValue(writeNewData);
	}
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	}

	}


