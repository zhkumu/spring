package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			String fileName=(String)model.get("filename");
			setContentType("application/octet-stream;charset=utf-8");
			response.setHeader("Content-Dispostion", "attachment;filename="+new String(fileName.getBytes(),"utf-8"));
			
			String[] headers=(String[])model.get("head");
			HSSFSheet sheet=workbook.createSheet();
			HSSFRow row = sheet.createRow(0);
			for(int i=0;i<headers.length;i++  ){
				row.createCell(i).setCellValue(headers[i]);
			}
			
			List<String[]> contents=(List<String[]>)model.get("content");
			for (int i = 0; i < contents.size(); ) {
				String[] contentList=contents.get(i);
				HSSFRow rowTmp=sheet.createRow(i++);
				for (int j = 0; j < contentList.length; j++) {
					rowTmp.createCell(j).setCellValue(contentList[j]);
				}
			}
	}

}
