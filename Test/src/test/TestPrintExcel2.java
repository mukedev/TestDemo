package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import test.TestPrintExcel.Persons;

//无样式简单导出导入excel
public class TestPrintExcel2 {
	public static void main(String[] args) {
		/*List<Persons> persons = new ArrayList<>();
		persons.add(new TestPrintExcel().new Persons("陈浩然", "男", 22));
		persons.add(new TestPrintExcel().new Persons("陈菲菲", "女", 21));
		persons.add(new TestPrintExcel().new Persons("陈一一", "男", 22));

		HSSFWorkbook wb = workbook(persons);

		// 写入excel
		try {
			File file = new File("E:\\testExcel2.xls");
			if (!file.exists()) {
				file.createNewFile();
			}
			wb.write(file);
			System.out.println("导出excel2成功。。。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				wb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		File file = new File("E:\\testExcel2.xls");
		try {
			readExcel(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 创建excel
	public static HSSFWorkbook workbook(List<Persons> persons) {
		// 实例工作薄
		HSSFWorkbook wBook = new HSSFWorkbook();

		// 创建表
		HSSFSheet sheet_1 = wBook.createSheet("人员信息1");

		// 创建标题行
		HSSFRow headRow = sheet_1.createRow(0);

		// 创建标题列
		headRow.createCell(0).setCellValue("姓名");

		headRow.createCell(1).setCellValue("性别");

		headRow.createCell(2).setCellValue("年龄");

		for (int i = 0; i < persons.size(); i++) {

			// 创建标题行
			HSSFRow contentRow = sheet_1.createRow(i + 1);

			// 创建标题列
			contentRow.createCell(0).setCellValue(persons.get(i).getName());

			contentRow.createCell(1).setCellValue(persons.get(i).getSex());

			contentRow.createCell(2).setCellValue(persons.get(i).getAge());
		}

		return wBook;
	}
	
	
	// 读取excel
	public static void readExcel(File file) throws IOException {
		//获取流
		InputStream is = new FileInputStream(file);
		
		//读取工作簿
		HSSFWorkbook readWorkBook = new HSSFWorkbook(is);
		
		//读取工作表
		HSSFSheet readSheet = readWorkBook.getSheetAt(0);
		
		//读取行
		//HSSFRow readRow = readSheet.getRow(1);
		
		System.out.println(readSheet.getPhysicalNumberOfRows());
		for (int i = 1; i < readSheet.getPhysicalNumberOfRows(); i++) {
			//读取行
			HSSFRow readRow = readSheet.getRow(i);
			
			System.out.println("姓名："+readRow.getCell(0)+",性别："+readRow.getCell(1)+",年龄："+readRow.getCell(2));
		
			
		}
	}
}
