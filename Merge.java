package com.scott.code;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.util.PDFMergerUtility;
public class Merge {

	/**
	 * @param args
	 * @throws DocumentException 
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws COSVisitorException 
	 */
	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException, COSVisitorException {
             String dir = "E:\\ª§’’\\¬Ë¬Ë«©÷§\\visitor_lessthan_six_months";  
             File [] files = new File(dir).listFiles();
             for (File f : files ){
            	 if (f.getName().endsWith("jpg")){
                     Document convertJpgToPdf=new Document();
                     PdfWriter.getInstance(convertJpgToPdf, new FileOutputStream(
                    		 dir + File.separator + f.getName().replace(".jpg", ".pdf")));
                     convertJpgToPdf.open();
                     //Get the input image to Convert to PDF
                     Image convertJpg=Image.getInstance(f.getAbsolutePath());
                     //Add image to Document
//                     convertJpg.scalePercent(50);
                     float scaler = ((convertJpgToPdf.getPageSize().getWidth() - convertJpgToPdf.leftMargin()
                             - convertJpgToPdf.rightMargin() - 0) / convertJpg.getWidth()) * 100;
//                     convertJpg.scaleAbsolute(826, 1100);

                     convertJpg.scalePercent(scaler);
                     
                     convertJpgToPdf.add(convertJpg);
                     //Close Document
                     convertJpgToPdf.close();
                }
             }
             PDFMergerUtility ut = new PDFMergerUtility();
             files = new File(dir).listFiles();
          for (File f : files){
        	  if (f.getName().endsWith(".pdf")){
        		  ut.addSource(f);
        	  }
          }
          ut.setDestinationFileName(dir + File.separator + "form.pdf");
          ut.mergeDocuments();
          

	}

}
