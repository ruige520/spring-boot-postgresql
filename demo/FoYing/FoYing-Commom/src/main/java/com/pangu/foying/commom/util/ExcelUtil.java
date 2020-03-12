package com.pangu.foying.commom.util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2018/9/25 11:11
 * @Modified By
 */
public class ExcelUtil {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(ExcelUtil.class);

    //默认单元格内容为数字时格式
    private static DecimalFormat df = new DecimalFormat("0");
    // 默认单元格格式化日期字符串
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // 格式化数字
    private static DecimalFormat nf = new DecimalFormat("0.000");

    /**
     * 读取Excel文件（默认读取excel中所有的工作表）
     * @param file (xls文件或xlsx文件)
     * @return 将返回结果存储在ArrayList内，存储结构与二位数组类似，
     * 			lists.get(0).get(0)表示过去Excel中0行0列单元格
     * @throws Exception
     */
    public static ArrayList<ArrayList<Object>> readExcel(File file) throws Exception{
        if(file == null){
            return null;
        }
        if(file.getName().endsWith("xlsx")){
            //处理ecxel2007
            return readExcel2007(file);
        }else{
            //处理ecxel2003
            return readExcel2003(file);
        }
    }
    /**
     * 读取Excel文件 指定读取第几张工作表
     * @param file (xls文件或xlsx文件)
     * @param pageIndex 工作表索引(从 1 开始)
     * @return 将返回结果存储在ArrayList内，存储结构与二位数组类似，
     * 			lists.get(0).get(0)表示过去Excel中0行0列单元格
     * @throws Exception
     */
    public static ArrayList<ArrayList<Object>> readExcel(File file, int pageIndex) throws Exception{
        if(file == null){
            return null;
        }
        if(file.getName().endsWith("xlsx")){
            //处理ecxel2007
            return readExcel2007(file, pageIndex);
        }else{
            //处理ecxel2003
            return readExcel2003(file, pageIndex);
        }
    }

    /**
     * 读取xls文件（默认读取excel中所有的工作表）
     * @param file excle2003文件
     * @return 将返回结果存储在ArrayList内，存储结构与二位数组类似，
     * 		   lists.get(0).get(0)表示过去Excel中0行0列单元格
     * @throws IOException
     * @throws Exception
     */
    public static ArrayList<ArrayList<Object>> readExcel2003(File file) throws Exception{
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(file);
            ArrayList<ArrayList<Object>> rowList = new ArrayList<ArrayList<Object>>();
            ArrayList<Object> colList;
            HSSFWorkbook wb = new HSSFWorkbook(fileInputStream);
            //工作表的总页数
            int numberOfSheets = wb.getNumberOfSheets();
            for(int pageIndex = 0; pageIndex < numberOfSheets; pageIndex++){
//				System.out.println("第  " + (pageIndex + 1) + " 工作表");
                HSSFSheet sheet = wb.getSheetAt(pageIndex);
                HSSFRow row;
                HSSFCell cell;
                Object value;
                for(int i = sheet.getFirstRowNum() , rowCount = 0; rowCount < sheet.getPhysicalNumberOfRows() ; i++ ){
                    row = sheet.getRow(i);
                    colList = new ArrayList<Object>();
                    if(row == null){
                        //当读取行为空时
                        if(i != sheet.getPhysicalNumberOfRows()){//判断是否是最后一行
                            rowList.add(colList);
                        }
                        continue;
                    }else{
                        rowCount++;
                    }
                    for( int j = row.getFirstCellNum() ; j <= row.getLastCellNum() ;j++){
                        cell = row.getCell(j);
                        if(cell == null || cell.getCellType() == CellType.BLANK){
                            //当该单元格为空
                            if(j != row.getLastCellNum()){//判断是否是该行中最后一个单元格
                                colList.add("");
                            }
                            continue;
                        }
                        switch(cell.getCellType()){
                            case STRING:
                                //System.out.println(i + "行" + j + " 列 is String type");
                                value = cell.getStringCellValue();
                                break;
                            case NUMERIC:
                                if ("@".equals(cell.getCellStyle().getDataFormatString())) {
                                    value = df.format(cell.getNumericCellValue());
                                } else if ("General".equals(cell.getCellStyle().getDataFormatString())) {
                                    value = nf.format(cell.getNumericCellValue());
                                } else {
                                    value = sdf.format(HSSFDateUtil.getJavaDate(cell.getNumericCellValue()));
                                }
                                //System.out.println(i + "行" + j + " 列 is Number type ; DateFormt:"+ value.toString());
                                break;
                            case BOOLEAN:
                                //System.out.println(i + "行" + j + " 列 is Boolean type");
                                value = Boolean.valueOf(cell.getBooleanCellValue());
                                break;
                            case BLANK:
                                //System.out.println(i + "行" + j + " 列 is Blank type");
                                value = "";
                                break;
                            default:
                                //System.out.println(i + "行" + j + " 列 is default type");
                                value = cell.toString();
                        }// end switch
                        colList.add(value);
                    }//end for j
                    rowList.add(colList);
                }//end for i
            }
            return rowList;
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally{
            if(fileInputStream != null){
                fileInputStream.close();
            }
        }
    }
    /**
     * 读取xls文件,指定读取第几张工作表
     * @param file excle2003文件
     * @param pageIndex 工作表索引(从 1 开始)
     * @return 将返回结果存储在ArrayList内，存储结构与二位数组类似，
     * 		   lists.get(0).get(0)表示过去Excel中0行0列单元格
     * @throws Exception
     */
    public static ArrayList<ArrayList<Object>> readExcel2003(File file, int pageIndex) throws Exception{
        FileInputStream fileInputStream = null;
        try{
            ArrayList<ArrayList<Object>> rowList = new ArrayList<ArrayList<Object>>();
            ArrayList<Object> colList;
            fileInputStream = new FileInputStream(file);
            HSSFWorkbook wb = new HSSFWorkbook(fileInputStream);
            if(pageIndex < 1){
                return null;
            }
            int numberOfSheet = wb.getNumberOfSheets();
            if(pageIndex > numberOfSheet){
                return null;
            }
//			System.out.println("第  " + pageIndex + " 工作表");
            HSSFSheet sheet = wb.getSheetAt(pageIndex - 1);
            HSSFRow row;
            HSSFCell cell;
            Object value;
            for(int i = sheet.getFirstRowNum() , rowCount = 0; rowCount < sheet.getPhysicalNumberOfRows() ; i++ ){
                row = sheet.getRow(i);
                colList = new ArrayList<Object>();
                if(row == null){
                    //当读取行为空时
                    if(i != sheet.getPhysicalNumberOfRows()){//判断是否是最后一行
                        rowList.add(colList);
                    }
                    continue;
                }else{
                    rowCount++;
                }
                for( int j = row.getFirstCellNum() ; j <= row.getLastCellNum() ;j++){
                    cell = row.getCell(j);
                    if(cell == null || cell.getCellType() == CellType.BLANK){
                        //当该单元格为空
                        if(j != row.getLastCellNum()){//判断是否是该行中最后一个单元格
                            colList.add("");
                        }
                        continue;
                    }
                    switch(cell.getCellType()){
                        case STRING:
                            //System.out.println(i + "行" + j + " 列 is String type");
                            value = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            if ("@".equals(cell.getCellStyle().getDataFormatString())) {
                                value = df.format(cell.getNumericCellValue());
                            } else if ("General".equals(cell.getCellStyle().getDataFormatString())) {
                                value = nf.format(cell.getNumericCellValue());
                            } else {
                                value = sdf.format(HSSFDateUtil.getJavaDate(cell.getNumericCellValue()));
                            }
                            //System.out.println(i + "行" + j + " 列 is Number type ; DateFormt:"+ value.toString());
                            break;
                        case BOOLEAN:
                            //System.out.println(i + "行" + j + " 列 is Boolean type");
                            value = Boolean.valueOf(cell.getBooleanCellValue());
                            break;
                        case BLANK:
                            //System.out.println(i + "行" + j + " 列 is Blank type");
                            value = "";
                            break;
                        default:
                            //System.out.println(i + "行" + j + " 列 is default type");
                            value = cell.toString();
                    }// end switch
                    colList.add(value);
                }//end for j
                rowList.add(colList);
            }//end for i
            return rowList;
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally{
            if(fileInputStream != null){
                fileInputStream.close();
            }
        }
    }

    /**
     * 读取xlsx文件（默认读取excel中所有的工作表）
     * @param file excle2007文件
     * @return 将返回结果存储在ArrayList内，存储结构与二位数组类似，
     * 		   lists.get(0).get(0)表示过去Excel中0行0列单元格
     * @throws Exception
     */
    public static ArrayList<ArrayList<Object>> readExcel2007(File file) throws Exception{
        FileInputStream fileInputStream = null;
        try{
            ArrayList<ArrayList<Object>> rowList = new ArrayList<ArrayList<Object>>();
            ArrayList<Object> colList;
            fileInputStream = new FileInputStream(file);
            XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
            //工作表的总页数
            int numberOfSheets = wb.getNumberOfSheets();
//            System.out.println(numberOfSheets);
            for(int pageIndex = 0; pageIndex < numberOfSheets; pageIndex++){
//				System.out.println("第  " + (pageIndex + 1) + " 工作表");
                XSSFSheet sheet = wb.getSheetAt(pageIndex);
                XSSFRow row;
                XSSFCell cell;
                Object value;
                for(int i = sheet.getFirstRowNum(), rowCount = 0; rowCount < sheet.getPhysicalNumberOfRows(); i++ ){
                    row = sheet.getRow(i);
                    colList = new ArrayList<Object>();
                    if(row == null){
                        //当读取行为空时
                        if(i != sheet.getPhysicalNumberOfRows()){//判断是否是最后一行
                            rowList.add(colList);
                        }
                        continue;
                    }else{
                        rowCount++;
                    }
                    for( int j = row.getFirstCellNum() ; j <= row.getLastCellNum() ;j++){
                        cell = row.getCell(j);
                        if(cell == null || cell.getCellType() == CellType.BLANK){
                            //当该单元格为空
                            if(j != row.getLastCellNum()){//判断是否是该行中最后一个单元格
                                colList.add("");
                            }
                            continue;
                        }
                        switch(cell.getCellType()){
                            case STRING:
                                //System.out.println(i + "行" + j + " 列 is String type");
                                value = cell.getStringCellValue();
                                break;
                            case NUMERIC:
                                if ("@".equals(cell.getCellStyle().getDataFormatString())) {
                                    value = df.format(cell.getNumericCellValue());
                                } else if ("General".equals(cell.getCellStyle().getDataFormatString())) {
                                    value = nf.format(cell.getNumericCellValue());
                                } else {
                                    value = sdf.format(HSSFDateUtil.getJavaDate(cell.getNumericCellValue()));
                                }
                                //System.out.println(i + "行" + j + " 列 is Number type ; DateFormt:" + value.toString());
                                break;
                            case BOOLEAN:
                                //System.out.println(i + "行" + j + " 列 is Boolean type");
                                value = Boolean.valueOf(cell.getBooleanCellValue());
                                break;
                            case BLANK:
                                //System.out.println(i + "行" + j + " 列 is Blank type");
                                value = "";
                                break;
                            default:
                                //System.out.println(i + "行" + j + " 列 is default type");
                                value = cell.toString();
                        }// end switch
                        colList.add(value);
                    }//end for j
                    rowList.add(colList);
                }//end for i
            }
            return rowList;
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally{
            if(fileInputStream != null){
                fileInputStream.close();
            }
        }
    }

    /**
     * 读取xlsx 指定读取第几张工作表
     * @param file excle2007文件
     * @param pageIndex 工作表索引(从 1 开始)
     * @return 将返回结果存储在ArrayList内，存储结构与二位数组类似，
     * 		   lists.get(0).get(0)表示过去Excel中0行0列单元格
     * @throws Exception
     */
    public static ArrayList<ArrayList<Object>> readExcel2007(File file, int pageIndex) throws Exception{
        FileInputStream fileInputStream = null;
        try{
            ArrayList<ArrayList<Object>> rowList = new ArrayList<ArrayList<Object>>();
            ArrayList<Object> colList;
            fileInputStream = new FileInputStream(file);
            XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
            if(pageIndex < 1){
                return null;
            }
            int numberOfSheet = wb.getNumberOfSheets();
            if(pageIndex > numberOfSheet){
                return null;
            }

//			System.out.println("第  " + pageIndex + " 工作表");
            XSSFSheet sheet = wb.getSheetAt(pageIndex - 1);
            XSSFRow row;
            XSSFCell cell;
            Object value;
            for(int i = sheet.getFirstRowNum(), rowCount = 0; rowCount < sheet.getPhysicalNumberOfRows(); i++ ){
                row = sheet.getRow(i);
                colList = new ArrayList<Object>();
                if(row == null){
                    //当读取行为空时
                    if(i != sheet.getPhysicalNumberOfRows()){//判断是否是最后一行
                        rowList.add(colList);
                    }
                    continue;
                }else{
                    rowCount++;
                }
                for( int j = row.getFirstCellNum() ; j <= row.getLastCellNum() ;j++){
                    cell = row.getCell(j);
                    if(cell == null || cell.getCellType() == CellType.BLANK){
                        //当该单元格为空
                        if(j != row.getLastCellNum()){//判断是否是该行中最后一个单元格
                            colList.add("");
                        }
                        continue;
                    }
                    switch(cell.getCellType()){
                        case STRING:
                            //System.out.println(i + "行" + j + " 列 is String type");
                            value = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            if ("@".equals(cell.getCellStyle().getDataFormatString())) {
                                value = df.format(cell.getNumericCellValue());
                            } else if ("General".equals(cell.getCellStyle().getDataFormatString())) {
                                value = nf.format(cell.getNumericCellValue());
                            } else {
                                value = sdf.format(HSSFDateUtil.getJavaDate(cell.getNumericCellValue()));
                            }
                            //System.out.println(i + "行" + j + " 列 is Number type ; DateFormt:" + value.toString());
                            break;
                        case BOOLEAN:
                            //System.out.println(i + "行" + j + " 列 is Boolean type");
                            value = Boolean.valueOf(cell.getBooleanCellValue());
                            break;
                        case BLANK:
                            //System.out.println(i + "行" + j + " 列 is Blank type");
                            value = "";
                            break;
                        default:
                            //System.out.println(i + "行" + j + " 列 is default type");
                            value = cell.toString();
                    }// end switch
                    colList.add(value);
                }//end for j
                rowList.add(colList);
            }//end for i
            return rowList;
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally{
            if(fileInputStream != null){
                fileInputStream.close();
            }
        }
    }

    public static void writeExcel(ArrayList<ArrayList<Object>> result,String path) throws Exception{
        if(result == null){
            return;
        }
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("sheet1");
        for(int i = 0 ;i < result.size() ; i++){
            HSSFRow row = sheet.createRow(i);
            if(result.get(i) != null){
                for(int j = 0; j < result.get(i).size() ; j ++){
                    HSSFCell cell = row.createCell(j);
                    cell.setCellValue(result.get(i).get(j).toString());
                }
            }
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        File file = new File(path);//Excel文件生成后存储的位置。
        OutputStream fos  = null;
        try{
            wb.write(os);
            byte[] content = os.toByteArray();
            fos = new FileOutputStream(file);
            fos.write(content);
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally{
            if(os != null){
                os.close();
            }
            if(fos != null){
                fos.close();
            }
        }
    }

    public static DecimalFormat getDf() {
        return df;
    }
    public static void setDf(DecimalFormat df) {
        ExcelUtil.df = df;
    }
    public static SimpleDateFormat getSdf() {
        return sdf;
    }
    public static void setSdf(SimpleDateFormat sdf) {
        ExcelUtil.sdf = sdf;
    }
    public static DecimalFormat getNf() {
        return nf;
    }
    public static void setNf(DecimalFormat nf) {
        ExcelUtil.nf = nf;
    }
}
