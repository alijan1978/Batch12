package Class32;

import com.sun.rowset.internal.Row;
import javafx.scene.control.Cell;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\User\\Desktop\\SDET Automation\\Configuration file\\Book1.xlsx";

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(); // XSSFWork is an interface comes from Jars (Apache Poi downloaded)
        XSSFSheet sheet = xlsx.createSheet("Sheet1");
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue ("Ali Bouarfa");
        xlsx.write(fileOutputStream);


    }
}
