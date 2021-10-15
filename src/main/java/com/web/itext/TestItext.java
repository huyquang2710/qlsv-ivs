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
		
		String para = "Un texte répond de façon plus ou moins pertinente à des critères qui en déterminent"
				+ " la qualité littéraire. On retient en particulier la structure d'ensemble, la syntaxe et"
				+ " la ponctuation, l'orthographe lexicale et grammaticale, la pertinence et la richesse du"
				+ " vocabulaire, la présence de figures de style, le registre de langue et la fonction recherchée "
				+ "(narrative, descriptive, expressive, "
				+ "argumentative, injonctive, poétique). C'est l'objet de l'analyse littéraire.";
		
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
