package practice;
import java.io.IOException;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class PRACTICE {
	
	public static void main(String[] args) throws IOException {
	
		String str="programming";
		char[] charAr=str.toCharArray();
		
		Arrays.sort(charAr);
		for(Character s:charAr) {
			System.out.print(s);
		}
		int count=0;
		for(int i=0;i<charAr.length-1;i++) {
			
			if(charAr[i]==charAr[i+1]) {
				count++;
			}
			if(count>0) {
				System.out.println(charAr[i]+" "+(count+1));
				count=0;
			}
		}
		
		if(count>0) {
			System.out.println(charAr[charAr.length-1]+" "+(count+1));
		}
	}
	
}

