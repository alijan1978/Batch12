package Class32;


import com.sun.rowset.internal.Row;
import javafx.scene.control.Cell;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo5 {
    public static void main(String[] args) throws IOException {

      /*  String path = "C:\\Users\\User\\Desktop\\SDET Automation\\Configuration file\\Book1.xlsx";
        FileOutputStream fos = new FileOutputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(); // XSSFWork is an interface comes from Jars (Apache Poi downloaded)
        Sheet sheet = xlsx.getSheet("Sheet1");

        for (int i = 0; i < 10; i++) {
            Row row = sheet.createRow(i);

            for (int j = 0; j < 5; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(i + " " + j); // we can put any name
            }
        }
            xlsx.write(fos);

*/
    }
}
