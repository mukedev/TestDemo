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

//��xls��ʽ��excel����
public class TestPrintExcel {

	public static void main(String[] args) {
			List<Persons> persons = new ArrayList<>();
			persons.add(new TestPrintExcel().new Persons("����", "��", 23));
			persons.add(new TestPrintExcel().new Persons("����1", "��",19));
			persons.add(new TestPrintExcel().new Persons("����2", "��", 21));
			
			HSSFWorkbook hssfWorkbook =TestPrintExcel.export_text(persons);
			
			try {
				File file = new File("E:\\testExcel.xls");
				if (!file.exists()) {
					file.createNewFile();
				}
				hssfWorkbook.write(file);
				System.out.println("����ɹ�");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

	
	
	// ������ʽ
	public static HSSFCellStyle headStyle(HSSFWorkbook wbook) {
		HSSFCellStyle headCellStyle = wbook.createCellStyle();
		HSSFFont headFont = wbook.createFont();
		headFont.setFontName("΢���ź�");
		headFont.setBold(true);
		headFont.setColor(HSSFFont.COLOR_RED);
		
		//headCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		headCellStyle.setFont(headFont);
		
		return headCellStyle;
	}

	// ������ʽ
	public static HSSFCellStyle contentStyle(HSSFWorkbook wbook) {
		HSSFCellStyle contentCellStyle = wbook.createCellStyle();
		HSSFFont contentFont = wbook.createFont();
		contentFont.setFontName("΢���ź�");
		contentFont.setBold(true);
		contentFont.setColor(HSSFFont.COLOR_NORMAL);
		
		contentCellStyle.setFont(contentFont);
		return contentCellStyle;
	}

	// ����������
	public static HSSFWorkbook export_text(List<Persons> list) {
		
		//����������
		HSSFWorkbook workbook = new HSSFWorkbook();
		//����������ʽ
		HSSFCellStyle headStyle = headStyle(workbook);
		//����������ʽ
		HSSFCellStyle contentStyle = contentStyle(workbook);
		
		//������
		HSSFSheet sheet_1 = workbook.createSheet("��Ա��Ϣ");
		//�������Ĭ���п�
		sheet_1.setDefaultColumnWidth(30);
		//����������
		HSSFRow headRow_1 = sheet_1.createRow(0);
		//������һ��
		HSSFCell headCell_1 = headRow_1.createCell(0);
		//��һ������
		headCell_1.setCellValue("����");
		//��һ����ʽ
		headCell_1.setCellStyle(headStyle);
		
	
		//�����ڶ���
		HSSFCell headCell_2 = headRow_1.createCell(1);
		headCell_2.setCellValue("�Ա�");
		headCell_2.setCellStyle(headStyle);
		
		//����������
		HSSFCell headCell_3 = headRow_1.createCell(2);
		headCell_3.setCellValue("����");
		headCell_3.setCellStyle(headStyle);
		
		
		//Ϊ����������ݺ���ʽ
		for (int i = 0; i < list.size(); i++) {
			HSSFRow contentRow = sheet_1.createRow(i+1);
			contentRow.setRowStyle(contentStyle);
			//����
			contentRow.createCell(0).setCellValue(list.get(i).getName());
			
			//�Ա�
			contentRow.createCell(1).setCellValue(list.get(i).getSex());
			
			//����
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
