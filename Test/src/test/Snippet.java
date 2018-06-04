package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import test.TestPrintExcel.Persons;

//����ʽ�򵥵���excel
public class Snippet {
	public static void main(String[] args) {
		List<Persons> persons = new ArrayList<>();
		persons.add(new TestPrintExcel().new Persons("�º�Ȼ", "��", 22));
		persons.add(new TestPrintExcel().new Persons("�·Ʒ�", "Ů", 21));
		persons.add(new TestPrintExcel().new Persons("��һһ", "��", 22));

		HSSFWorkbook wb = workbook(persons);

		// д��excel
		try {
			File file = new File("E:\\testExcel2.xls");
			if (!file.exists()) {
				file.createNewFile();
			}
			wb.write(file);
			System.out.println("����excel2�ɹ�������");
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
		// ʵ��������
		HSSFWorkbook wBook = new HSSFWorkbook();

		// ������
		HSSFSheet sheet_1 = wBook.createSheet("��Ա��Ϣ1");

		// ����������
		HSSFRow headRow = sheet_1.createRow(0);

		// ����������
		headRow.createCell(0).setCellValue("����");

		headRow.createCell(1).setCellValue("�Ա�");

		headRow.createCell(2).setCellValue("����");

		for (int i = 0; i < persons.size(); i++) {

			// ����������
			HSSFRow contentRow = sheet_1.createRow(i + 1);

			// ����������
			contentRow.createCell(0).setCellValue(persons.get(i).getName());

			contentRow.createCell(1).setCellValue(persons.get(i).getSex());

			contentRow.createCell(2).setCellValue(persons.get(i).getAge());
		}

		return wBook;
	}
}
