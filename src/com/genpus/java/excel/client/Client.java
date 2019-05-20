package com.genpus.java.excel.client;

import com.genpus.java.excel.common.Common;
import com.genpus.java.excel.excel.ReadFromExcel;
import com.genpus.java.excel.vo.StudentInfo;

import java.io.IOException;
import java.util.List;

/**
 * @author supeng/ supeng87@126.com
 * @date 2019-04-15 18:00
 * @Modified By:
 * @Description:
 */
public class Client {

    public static void main(String[] args) throws IOException {
        String excel2003_2007 = Common.STUDENT_INFO_XLS_PATH;
        String excel2010 = Common.STUDENT_INFO_XLSX_PATH;
        // read the 2003-2007 excel
//        List<StudentInfo> list = new ReadFromExcel().readExcel(excel2003_2007);
//        if (list != null) {
//            for (StudentInfo student : list) {
//                System.out.println("xuehao. : " + student.getXuehao() + ", xingming : " + student.getXingming() + ", shouji : " + student.getShouji() + ", shenfenzhenghao : " + student.getShenfenzhenghao());
//            }
//        }
//        System.out.println("======================================");
        // read the 2010 excel
        List<StudentInfo> list1 = new ReadFromExcel().readExcel(excel2010);
        if (list1 != null) {
            for (StudentInfo student : list1) {
                System.out.println("xuehao. : " + student.getXuehao() + ", xingming : " + student.getXingming() + ", shouji : " + student.getShouji() + ", shenfenzhenghao : " + student.getShenfenzhenghao());
            }
        }

//        File dir = new File("./src/com/genpus/java/someFiles/student.xlsx");// 将字符串dirPath封装成文件
//
//        // 如果文件存在，而且是个目录执行下列操作
//        if (dir.exists() && dir.isDirectory()) {
//
//            String[] names = dir.list();// 文件目录列表存放到字符数组中
//            for (String name : names) {
//                System.out.println(name);
//
//            }
//        } else {
//
//            String info = "您输入的路径" + "../../someFiles/student.xlsx" + "是错误的，请重新输入！";
//        }



    }
}
