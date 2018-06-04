package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

//简单xls格式的excel导出
public class TestPrintExcel {

	public static void main(String[] args) {
			List<Persons> persons = new ArrayList<>();
			persons.add(new TestPrintExcel().new Persons("亚索", "男", 23));
			persons.add(new TestPrintExcel().new Persons("亚索1", "男",19));
			persons.add(new TestPrintExcel().new Persons("亚索2", "男", 21));
			
			HSSFWorkbook hssfWorkbook =TestPrintExcel.export_text(persons);
			
			try {
				File file = new File("E:\\testExcel.xls");
				if (!file.exists()) {
					file.createNewFile();
				}
				hssfWorkbook.write(file);
				System.out.println("导入成功");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

	
	
	// 标题样式
	public static HSSFCellStyle headStyle(HSSFWorkbook wbook) {
		HSSFCellStyle headCellStyle = wbook.createCellStyle();
		HSSFFont headFont = wbook.createFont();
		headFont.setFontName("微软雅黑");
		headFont.setBold(true);
		headFont.setColor(HSSFFont.COLOR_RED);
		
		//headCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		headCellStyle.setFont(headFont);
		
		return headCellStyle;
	}

	// 内容样式
	public static HSSFCellStyle contentStyle(HSSFWorkbook wbook) {
		HSSFCellStyle contentCellStyle = wbook.createCellStyle();
		HSSFFont contentFont = wbook.createFont();
		contentFont.setFontName("微软雅黑");
		contentFont.setBold(true);
		contentFont.setColor(HSSFFont.COLOR_NORMAL);
		
		contentCellStyle.setFont(contentFont);
		return contentCellStyle;
	}

	// 工作薄对象
	public static HSSFWorkbook export_text(List<Persons> list) {
		
		//创建工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		//创建标题样式
		HSSFCellStyle headStyle = headStyle(workbook);
		//创建内容样式
		HSSFCellStyle contentStyle = contentStyle(workbook);
		
		//创建表
		HSSFSheet sheet_1 = workbook.createSheet("人员信息");
		//创建表的默认列宽
		sheet_1.setDefaultColumnWidth(30);
		//创建标题行
		HSSFRow headRow_1 = sheet_1.createRow(0);
		//创建第一列
		HSSFCell headCell_1 = headRow_1.createCell(0);
		//第一列内容
		headCell_1.setCellValue("姓名");
		//第一列样式
		headCell_1.setCellStyle(headStyle);
		
	
		//创建第二列
		HSSFCell headCell_2 = headRow_1.createCell(1);
		headCell_2.setCellValue("性别");
		headCell_2.setCellStyle(headStyle);
		
		//创建第三列
		HSSFCell headCell_3 = headRow_1.createCell(2);
		headCell_3.setCellValue("年龄");
		headCell_3.setCellStyle(headStyle);
		
		
		//为内容添加数据和样式
		for (int i = 0; i < list.size(); i++) {
			HSSFRow contentRow = sheet_1.createRow(i+1);
			contentRow.setRowStyle(contentStyle);
			//姓名
			contentRow.createCell(0).setCellValue(list.get(i).getName());
			
			//性别
			contentRow.createCell(1).setCellValue(list.get(i).getSex());
			
			//年龄
			contentRow.createCell(2).setCellValue(list.get(i).getAge());
			
		}
		
		return workbook;
				
	}
	
	class Persons{
		private String name;
		private String sex;
		private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Persons(String name, String sex, int age) {
			super();
			this.name = name;
			this.sex = sex;
			this.age = age;
		}
		
		
	}

}
