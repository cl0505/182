package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class input_shili {

	public static void main(String[] args) throws Exception {
		File file=new File("d:\\tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for(File file2:wenjian_jihe) {
			System.out.println(file2);
			dwj(file2);
		}
	}
	public static void dwj(File wjm) throws Exception {
		FileInputStream fin=new FileInputStream(wjm);
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for (int i = 0; i < rows; i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			System.out.println(xuehao);
			XSSFCell cell16=row.getCell(15);
			String zuo=cell16.getStringCellValue();
			System.out.println(zuo);
			XSSFCell cell17=row.getCell(16);
			String you_shili=cell17.getStringCellValue();
			//System.out.println(you);
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dddd?characterEncoding=utf8","root","123456");
			java.sql.Statement yuju=lianjie.createStatement();
			String sql="UPDATE sheet1 SET `左眼裸眼视力`='"+zuo+"'WHERE `学号`='"+xuehao+"'";
			System.out.println(sql);
			yuju.execute(sql);
	}
	}

}
