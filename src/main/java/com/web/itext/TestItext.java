package com.web.itext;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;

public class TestItext {
	public static void main(String[] args) throws FileNotFoundException {
		
		// CREATE PDF
	/*	
		String path = "G:\\iText\\demo.pdf";
		PdfWriter pdfWriter = new PdfWriter(path);
		
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
		pdfDocument.addNewPage();
		
		Document document = new Document(pdfDocument);
		
		document.close();
		System.out.println("created");
	*/
		
		// CREATE PARAGRAPH
	
	/*
		String path = "G:\\iText\\demo.pdf";
		PdfWriter pdfWriter = new PdfWriter(path);
		
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
		pdfDocument.addNewPage();
		
		Document document = new Document(pdfDocument);
		
		String para = "Un texte r�pond de fa�on plus ou moins pertinente � des crit�res qui en d�terminent"
				+ " la qualit� litt�raire. On retient en particulier la structure d'ensemble, la syntaxe et"
				+ " la ponctuation, l'orthographe lexicale et grammaticale, la pertinence et la richesse du"
				+ " vocabulaire, la pr�sence de figures de style, le registre de langue et la fonction recherch�e "
				+ "(narrative, descriptive, expressive, "
				+ "argumentative, injonctive, po�tique). C'est l'objet de l'analyse litt�raire.";
		
		Paragraph paragraph = new Paragraph(para);
		document.add(paragraph);
		
		document.close();
		System.out.println("created");
	*/
		
		// CREATE LIST
		
	/*	String path = "G:\\iText\\demo.pdf";
		PdfWriter pdfWriter = new PdfWriter(path);
		
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
		pdfDocument.addNewPage();
		
		List list = new List();
		
		list.add("Quang");
		list.add("Huy");
		list.add("Phung");
		
		Document document = new Document(pdfDocument);
		document.add(list);
		
		document.close();
		System.out.println("created");
		
	*/
	}
	
		// CREATE IMAGE

}
