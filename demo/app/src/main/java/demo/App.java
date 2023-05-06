import java.io.File;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.html2pdf.HtmlConverter;

public class HtmlToPDFConverter {

   public static void main(String[] args) {
      String inputFilePath = "input.html";
      String outputFilePath = "output.pdf";
      try {
         // Create a PDF document object
         PdfDocument pdfDoc = new PdfDocument(new PdfWriter(outputFilePath));
         Document doc = new Document(pdfDoc);
         
         // Convert HTML file to PDF and add to the PDF document
         File inputFile = new File(inputFilePath);
         HtmlConverter.convertToPdf(inputFile, pdfDoc, doc);
         
         // Close the PDF document
         doc.close();
         pdfDoc.close();
         System.out.println("PDF file created successfully!");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
