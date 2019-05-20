package com.genpus.java.excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * @author supeng/ supeng87@126.com
 * @date 2019-04-16 16:03
 * @Modified By:
 * @Description:
 */
public class ReadExcel {



    public static void main(String[] args) {
        new ReadExcel().readFExcel();
    }


    // 取文件，读EXCEL
    public void readFExcel()  {
        // 取得文件
        URL url = this.getClass().getResource("../someFiles/student.xlsx");
        System.out.println(url.getFile());

        File file = new File(url.getFile());

        System.out.println(file.toString());

        try {
            InputStream inputStream = new FileInputStream(file.toString());
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);

            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

            for(int i = 0; i< xssfSheet.getLastRowNum(); i++)
            {
               XSSFRow xssfRow = xssfSheet.getRow(i);
               for (int j =0 ; j<6; j++)
               {
                   XSSFCell xssfCell = xssfRow.getCell(j);

                   System.out.print(xssfCell + "\t\t\t");


               }
                System.out.println();


            }

            XSSFRow xssfRow = xssfSheet.getRow(2);

            XSSFCell xssfCell = xssfRow.getCell(2);




        } catch (Exception e) {
            e.printStackTrace();
        }

        // 读取：



    }


}
