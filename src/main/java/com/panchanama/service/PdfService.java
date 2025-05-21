package com.panchanama.service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class PdfService {

	public byte[] generatePdf(String content) throws DocumentException, IOException {
		Document document = new Document();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PdfWriter.getInstance(document, outputStream);
		document.open();

		// Load the Devanagari Unicode Font
		String fontPath = "src/main/resources/fonts/SHREE-DEV7-0714 Regular.ttf"; // Change this if using another
																						// font
		BaseFont baseFont = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
		Font font = new Font(baseFont, 14, Font.NORMAL, BaseColor.BLACK);

		// Add Marathi Content
		document.add(new Paragraph(content, font));
		document.close();

		return outputStream.toByteArray();
	}

}