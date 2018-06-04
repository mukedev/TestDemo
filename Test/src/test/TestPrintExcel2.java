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

//����ʽ�򵥵�������excel
public class TestPrintExcel2 {
	public static void main(String[] args) {
		/*List<Persons> persons = new ArrayList<>();
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
		}*/
		
		File file = new File("E:\\testExcel2.xls");
		try {
			readExcel(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// ����excel
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
	
	
	// ��ȡexcel
	public static void readExcel(File file) throws IOException {
		//��ȡ��
		InputStream is = new FileInputStream(file);
		
		//��ȡ������
		HSSFWorkbook readWorkBook = new HSSFWorkbook(is);
		
		//��ȡ������
		HSSFSheet readSheet = readWorkBook.getSheetAt(0);
		
		//��ȡ��
		//HSSFRow readRow = readSheet.getRow(1);
		
		System.out.println(readSheet.getPhysicalNumberOfRows());
		for (int i = 1; i < readSheet.getPhysicalNumberOfRows(); i++) {
			//��ȡ��
			HSSFRow readRow = readSheet.getRow(i);
			
			System.out.println("������"+readRow.getCell(0)+",�Ա�"+readRow.getCell(1)+",���䣺"+readRow.getCell(2));
		
			
		}
	}
}
