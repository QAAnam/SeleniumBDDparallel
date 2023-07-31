package utilClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import frameWorkConstans.FrameWorkConstant;

public class ExcelUtility 
{
	public static void writeExcelWithList(List<String> list, int columnNum,String FileName)
	{
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Anam");
		XSSFRow row ;
		XSSFCell cell;
		int rowNum=(list.size()/columnNum);
		int index = 0;
		try
		{
			for(int j=0;j<rowNum;j++)
			{
				row=sheet.createRow(j);
				for(int i =0;i<columnNum;i++)
				{
					cell=row.createCell(i);
					cell.setCellValue(list.get(index));
					index++;
				}
			}
			File file= new File(FrameWorkConstant.getINSTANCE().getExcelPath()+FileName);
			FileOutputStream fos =new FileOutputStream(file);
			wb.write(fos);
			fos.close();
			wb.close();
			UtilClass.printutil("file written");
		} 
		catch (Exception e)
		{
			UtilClass.printutil("erro in Write excel");e.printStackTrace();
		}
		
	}
	public static Map<Integer, List<String>> readExcelWithList(String FileName1)
	{
		Map<Integer, List<String>> map=null;
		try {
			File file= new File(FrameWorkConstant.getINSTANCE().getExcelPath()+FileName1);
			FileInputStream fis =new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Anam");
			XSSFRow row ;
			XSSFCell cell;
			int rowCount = sheet.getLastRowNum();
			int cellCount = sheet.getRow(0).getLastCellNum();
			map=new HashMap<Integer, List<String>>();
			for(int i=0;i<rowCount;i++)
			{
				row=sheet.getRow(i);
				List<String> li= new ArrayList<String>();
				for(int j=0;j<cellCount;j++)
				{
					cell=row.getCell(j);
					li.add(cell.getStringCellValue());
					
				}
				map.put(i, li);
			}
			
		} catch (Exception e) {
			UtilClass.printutil(FileName1);e.printStackTrace();
		}
		return map;
	}
	public static void printMap(String FileName)
	{
		Map<Integer, List<String>> p = readExcelWithList(FileName);
		Set<Integer> keys = p.keySet();
		Collection<List<String>> val = p.values();
		for(Integer key:keys)
		{
			val.forEach(e->
			{
				System.out.println(e.toString());
			e.forEach(e1->
			{
				System.out.println(e1.toString());
			}
			);
			}
			);
		}
	}

}
