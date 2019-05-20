package com.genpus.java.excel.excel;

import com.genpus.java.excel.common.Common;
import com.genpus.java.excel.util.Util;
import com.genpus.java.excel.vo.StudentInfo;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author supeng/ supeng87@126.com
 * @date 2019-04-15 15:41
 * @Modified By:
 * @Description:
 */
public class ReadFromExcel {
    /**
     * read the Excel file
     * @param path the path of the Excel file
     * @return
     * @throws IOException
     */
    public List<StudentInfo> readExcel(String path) throws IOException {
        if (path == null || Common.EMPTY.equals(path)) {
            return null;
        } else {
            String postfix = Util.getPostfix(path);
            if (!Common.EMPTY.equals(postfix)) {
                if (Common.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
                    return readXls(path);
                } else if (Common.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
                    System.out.println("path: "+path);
                    return readXlsx(path);
                }
            } else {
                System.out.println(path + Common.NOT_EXCEL_FILE);
            }
        }
        return null;
    }


    /**
     * Read the Excel 2010
     * @param path the path of the excel file
     * @return
     * @throws IOException
     */
    public List<StudentInfo> readXlsx(String path) throws IOException {

        System.out.println(Common.PROCESSING + path);

        InputStream is = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
        StudentInfo student = null;
        List<StudentInfo> list = new ArrayList<StudentInfo>();
        // Read the Sheet
        for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
            if (xssfSheet == null) {
                continue;
            }
            // Read the Row
            for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                if (xssfRow != null) {
                    student = new StudentInfo();
                    XSSFCell xuehao = xssfRow.getCell(0);
                    XSSFCell xingming = xssfRow.getCell(1);
                    XSSFCell xingbie = xssfRow.getCell(2);
                    XSSFCell dizhi = xssfRow.getCell(3);
                    XSSFCell email = xssfRow.getCell(4);
                    XSSFCell youbian = xssfRow.getCell(5);
                    XSSFCell laiyuan = xssfRow.getCell(6);
                    XSSFCell gongzuodanwei = xssfRow.getCell(7);
                    XSSFCell banji = xssfRow.getCell(8);
                    XSSFCell kaoshenghao = xssfRow.getCell(9);
                    XSSFCell zhucehao = xssfRow.getCell(10);
                    XSSFCell shouji = xssfRow.getCell(11);
                    XSSFCell dianhua = xssfRow.getCell(12);
                    XSSFCell chushengriqi = xssfRow.getCell(13);
                    XSSFCell xueshengbiaoqian = xssfRow.getCell(14);
                    XSSFCell zhongxinmingcheng = xssfRow.getCell(15);
                    XSSFCell suozaisheng = xssfRow.getCell(16);
                    XSSFCell zhuanyemingcheng = xssfRow.getCell(17);
                    XSSFCell ruxueriqi = xssfRow.getCell(18);
                    XSSFCell zhuceriqi = xssfRow.getCell(19);
                    XSSFCell peiyangcengci  = xssfRow.getCell(20);
                    XSSFCell peiyangcengcishuxing = xssfRow.getCell(21);
                    XSSFCell yixuelixuexiaodaima = xssfRow.getCell(22);
                    XSSFCell yixuelixuexiaomingcheng = xssfRow.getCell(23);
                    XSSFCell yixuelibiyenianyue = xssfRow.getCell(24);
                    XSSFCell yixuelizhengshibianhao = xssfRow.getCell(25);
                    XSSFCell banxueleixing = xssfRow.getCell(26);
                    XSSFCell banxueleibie = xssfRow.getCell(27);
                    XSSFCell xuezhi = xssfRow.getCell(28);
                    XSSFCell pizhunwenhao = xssfRow.getCell(29);
                    XSSFCell biyeriqi = xssfRow.getCell(30);
                    XSSFCell xiaozhangxingming = xssfRow.getCell(31);
                    XSSFCell wangyuanyuanzhangxingming = xssfRow.getCell(32);
                    XSSFCell shenfenzhenghao = xssfRow.getCell(33);
                    XSSFCell kaodianmingcheng = xssfRow.getCell(34);
                    XSSFCell minzu = xssfRow.getCell(35);
                    XSSFCell zhuankehuoqushijian = xssfRow.getCell(36);
                    XSSFCell xuejizhuangtai = xssfRow.getCell(37);
                    XSSFCell xuejizhuangtaixueming = xssfRow.getCell(38);
                    XSSFCell zhengzhimianmao = xssfRow.getCell(39);
                    XSSFCell beizhu = xssfRow.getCell(40);
                    student.setXuehao(getValue(xuehao));
                    student.setXingming(getValue(xingming));
                    student.setShenfenzhenghao(getValue(shenfenzhenghao));
                    student.setShouji(getValue(shouji));
                    list.add(student);
                }
            }
        }
        return list;
    }

    /**
     * Read the Excel 2003-2007
     * @param path the path of the Excel
     * @return
     * @throws IOException
     */
    public List<StudentInfo> readXls(String path) throws IOException {
        System.out.println(Common.PROCESSING + path);
        InputStream is = new FileInputStream(path);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
        StudentInfo student = null;
        List<StudentInfo> list = new ArrayList<StudentInfo>();
        // Read the Sheet
        for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            // Read the Row
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                if (hssfRow != null) {
                    student = new StudentInfo();
                    HSSFCell xuehao = hssfRow.getCell(0);
                    HSSFCell xingming = hssfRow.getCell(1);
                    HSSFCell xingbie = hssfRow.getCell(2);
                    HSSFCell dizhi = hssfRow.getCell(3);
                    HSSFCell email = hssfRow.getCell(4);
                    HSSFCell youbian = hssfRow.getCell(5);
                    HSSFCell laiyuan = hssfRow.getCell(6);
                    HSSFCell gongzuodanwei = hssfRow.getCell(7);
                    HSSFCell banji = hssfRow.getCell(8);
                    HSSFCell kaoshenghao = hssfRow.getCell(9);
                    HSSFCell zhucehao = hssfRow.getCell(10);
                    HSSFCell shouji = hssfRow.getCell(11);
                    HSSFCell dianhua = hssfRow.getCell(12);
                    HSSFCell chushengriqi = hssfRow.getCell(13);
                    HSSFCell xueshengbiaoqian = hssfRow.getCell(14);
                    HSSFCell zhongxinmingcheng = hssfRow.getCell(15);
                    HSSFCell suozaisheng = hssfRow.getCell(16);
                    HSSFCell zhuanyemingcheng = hssfRow.getCell(17);
                    HSSFCell ruxueriqi = hssfRow.getCell(18);
                    HSSFCell zhuceriqi = hssfRow.getCell(19);
                    HSSFCell peiyangcengci  = hssfRow.getCell(20);
                    HSSFCell peiyangcengcishuxing = hssfRow.getCell(21);
                    HSSFCell yixuelixuexiaodaima = hssfRow.getCell(22);
                    HSSFCell yixuelixuexiaomingcheng = hssfRow.getCell(23);
                    HSSFCell yixuelibiyenianyue = hssfRow.getCell(24);
                    HSSFCell yixuelizhengshibianhao = hssfRow.getCell(25);
                    HSSFCell banxueleixing = hssfRow.getCell(26);
                    HSSFCell banxueleibie = hssfRow.getCell(27);
                    HSSFCell xuezhi = hssfRow.getCell(28);
                    HSSFCell pizhunwenhao = hssfRow.getCell(29);
                    HSSFCell biyeriqi = hssfRow.getCell(30);
                    HSSFCell xiaozhangxingming = hssfRow.getCell(31);
                    HSSFCell wangyuanyuanzhangxingming = hssfRow.getCell(32);
                    HSSFCell shenfenzhenghao = hssfRow.getCell(33);
                    HSSFCell kaodianmingcheng = hssfRow.getCell(34);
                    HSSFCell minzu = hssfRow.getCell(35);
                    HSSFCell zhuankehuoqushijian = hssfRow.getCell(36);
                    HSSFCell xuejizhuangtai = hssfRow.getCell(37);
                    HSSFCell xuejizhuangtaixueming = hssfRow.getCell(38);
                    HSSFCell zhengzhimianmao = hssfRow.getCell(39);
                    HSSFCell beizhu = hssfRow.getCell(40);
                    student.setXuehao(getValue(xuehao));
                    student.setXingming(getValue(xingming));
                    student.setShenfenzhenghao(getValue(shenfenzhenghao));
                    student.setShouji(getValue(shouji));
                    list.add(student);

                }
            }
        }
        return list;
    }

    @SuppressWarnings("static-access")
    private String getValue(XSSFCell xssfRow) {
            return String.valueOf(xssfRow.getStringCellValue());
    }

    @SuppressWarnings("static-access")
    private String getValue(HSSFCell hssfCell) {
//        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
//            return String.valueOf(hssfCell.getBooleanCellValue());
//        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
//            return String.valueOf(hssfCell.getNumericCellValue());
//        } else {
            return String.valueOf(hssfCell.getStringCellValue());
//        }
    }
}
