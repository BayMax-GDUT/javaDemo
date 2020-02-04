package com.demo.Utils;

import com.demo.entity.Member;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.poi.hssf.usermodel.*;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExcelUtil {


    /**
     * 导入excel文件
     * @param path
     * @return
     */
//    public static HashMap<BigInteger, Member> output(String path) {
//
//        //创建输入流
//
//        try (InputStream stream = new FileInputStream(path)) {
//            //获取Excel文件对象
//
//            Workbook rwb = Workbook.getWorkbook(stream);
//            //获取文件的指定工作表 默认的第一个
//
//            Sheet sheet = rwb.getSheet(0);
//            HashMap<BigInteger, Member> allMap = new HashMap<>();
//            //循环插入实体
//            for (int i = 0; i < sheet.getRows(); i++) {
//                if (i < 1) {
//                    continue;
//                }
//                Member member = new Member();
//                member.setId(Long.parseLong(sheet.getCell(0, i).getContents()));
//                member.setName(sheet.getCell(1, i).getContents());
//                member.setAddress(sheet.getCell(3, i).getContents());
//                member.setIdCardNum(new BigInteger(sheet.getCell(2, i).getContents()));
//                allMap.put(member.getIdCardNum(), member);
//            }
//            return allMap;
//        } catch (BiffException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    /**
     * 导入excel文件
     * 通用版本
     * @param path 操作的目标文件绝对路径
     * @param keyIndex 根据哪一列的数据做唯一性的key 从0开始
     * @param sheetIndex 所操作的工作表 从0开始
     * @param startRowIndex 开始获取的下标
     * @return
     */
    public static HashMap<String, List<String>> output(String path, int keyIndex, int sheetIndex, int startRowIndex) {

        //创建输入流

        try (InputStream stream = new FileInputStream(path)) {

            //获取Excel文件对象
            Workbook rwb = Workbook.getWorkbook(stream);

            //获取文件的指定工作表 默认的第一个
            Sheet sheet = rwb.getSheet(sheetIndex);
            HashMap<String, List<String>> data = new HashMap<>();
            //循环插入实体
            for (int i = startRowIndex; i < sheet.getRows(); i++) {
                List<String> dataList = new ArrayList<>();
                for(int j = 0; j < sheet.getRow(i).length; j++) {
                    dataList.add(sheet.getCell(j, i).getContents());
                }
                data.put(dataList.get(keyIndex), dataList);
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 导入excel文件
     * 通用版本
     * @param path 操作的目标文件绝对路径
     * @param keyIndex 根据哪一列的数据做唯一性的key 从0开始
     * @param sheetIndex 所操作的工作表 从0开始
     * @param startRowIndex 开始获取的下标 包含
     * @param endRowIndex 停止获取的下标 不包含
     * @return
     */
    public static HashMap<String, List<String>> output(String path, int keyIndex, int sheetIndex, int startRowIndex, int endRowIndex) {

        //创建输入流

        try (InputStream stream = new FileInputStream(path)) {

            //获取Excel文件对象
            Workbook rwb = Workbook.getWorkbook(stream);

            //获取文件的指定工作表 默认的第一个
            Sheet sheet = rwb.getSheet(sheetIndex);
            HashMap<String, List<String>> data = new HashMap<>();
            //循环插入实体
            for (int i = startRowIndex; i < endRowIndex; i++) {
                List<String> dataList = new ArrayList<>();
                for(int j = 0; j < sheet.getRow(i).length; j++) {
                    dataList.add(sheet.getCell(j, i).getContents());
                }
                data.put(dataList.get(keyIndex), dataList);
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 导出生成一个excel文件
     * @param data 数据内容
     * @param path 文件路径
     * @param titles 表格表头
     */
    public static void export(HashMap<String, List<String>> data, String path, String[] titles) {
        try {
            //创建工作薄对象
            HSSFWorkbook workbook = new HSSFWorkbook();//这里也可以设置sheet的Name
            //创建工作表对象
            HSSFSheet sheet = workbook.createSheet();
            //创建工作表的行
            // 设置表头
            HSSFRow row = sheet.createRow(0);//设置第一行，从零开始
            for (int i = 0; i < titles.length; i++) {
                row.createCell(i).setCellValue(titles[i]);
            }
            // 插入每一行的数据
            int i = 0;
            for (List<String> list : data.values()) {
                row = sheet.createRow(i + 1);
                for(int j = 0; j < list.size(); j++) {
                    row.createCell(j).setCellValue(list.get(j));
                }
//                row.createCell(0).setCellValue(member.getId());
//                row.createCell(1).setCellValue(member.getName());
//                row.createCell(2).setCellValue(member.getIdCardNum().toString());
//                row.createCell(3).setCellValue(member.getAddress());
                i++;
            }

            //文档输出
            FileOutputStream out = new FileOutputStream(path);
            workbook.write(out);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
