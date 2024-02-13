package Project_object_model;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class Data_driven_file {
    public WebDriver dr;
    public String read(int row,int cell) throws IOException {

        FileInputStream Fis = new FileInputStream("./src/test/java/Driver/registration_flow.xlsx");
        System.out.println(Fis);
        Workbook data1=new XSSFWorkbook(Fis);
        Sheet Sheetread=data1.getSheet("Sheet1");
        String Excel_data=Sheetread.getRow(row).getCell(cell).getStringCellValue();

        return Excel_data;
    }

    }
