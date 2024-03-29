package com.io;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class Sc_escel {
	public static void main(String[] args) throws Exception {
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("测试环境");
		HSSFRow row0=sheet.createRow(0);
		row0.createCell(0).setCellValue("年级");
		row0.createCell(1).setCellValue("班级班号");
		row0.createCell(2).setCellValue("班级名称");
		row0.createCell(3).setCellValue("项目名称");
		row0.createCell(4).setCellValue("测试老师");
		row0.createCell(5).setCellValue("测试时间");
		row0.createCell(6).setCellValue("测试地点");
		row0.createCell(7).setCellValue("测试器材");
		row0.createCell(8).setCellValue("测试方法(手工/仪器)");
		Path bjxx=Paths.get("D:\\班级信息.txt");
		List<String> lines=Files.readAllLines(bjxx);
		int j=0;
		for(String line:lines) {
			String[] zfcsz=line.split("\t");
		
		for(int i=j*10+1;i<j*10+11;i++) {
			HSSFRow rowi=sheet.createRow(i);
			rowi.createCell(0).setCellValue("42");
			rowi.createCell(1).setCellValue(zfcsz[0]);
			rowi.createCell(2).setCellValue(zfcsz[1]);
			if(i%10==1) {
				rowi.createCell(3).setCellValue("身高");
				rowi.createCell(4).setCellValue("高家明");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
			if(i%10==2) {
				rowi.createCell(3).setCellValue("体重");
				rowi.createCell(4).setCellValue("刘思齐");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("3");
			}	
			if(i%10==3) {
				rowi.createCell(3).setCellValue("跳高");
				rowi.createCell(4).setCellValue("高家明");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
			if(i%10==4) {
				rowi.createCell(3).setCellValue("跳远");
				rowi.createCell(4).setCellValue("高家明");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
			if(i%10==5) {
				rowi.createCell(3).setCellValue("俯卧撑");
				rowi.createCell(4).setCellValue("高家明");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
			if(i%10==6) {
				rowi.createCell(3).setCellValue("引体向上");
				rowi.createCell(4).setCellValue("高家明");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
			if(i%10==7) {
				rowi.createCell(3).setCellValue("引体向上");
				rowi.createCell(4).setCellValue("高家明");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
			if(i%10==8) {
				rowi.createCell(3).setCellValue("引体向上");
				rowi.createCell(4).setCellValue("高家明");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
			if(i%10==9) {
				rowi.createCell(3).setCellValue("引体向上");
				rowi.createCell(4).setCellValue("高家明");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
			if(i%10==0) {
				rowi.createCell(3).setCellValue("1000米跑");
				rowi.createCell(4).setCellValue("高家明");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(7).setCellValue("");
				rowi.createCell(8).setCellValue("2");
			}
		FileOutputStream fout=new FileOutputStream("D:\\测试模板.xls");
		wb.write(fout);
		fout.close();
		}
		j++;
		}
	}
}
