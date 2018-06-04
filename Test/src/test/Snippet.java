package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import test.TestPrintExcel.Persons;

//无样式简单导出excel
public class Snippet {
	public static void main(String[] args) {
		List<Persons> persons = new ArrayList<>();
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
		}

	}

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
}
