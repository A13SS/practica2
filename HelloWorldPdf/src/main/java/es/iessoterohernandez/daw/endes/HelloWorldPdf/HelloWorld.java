package es.iessoterohernandez.daw.endes.HelloWorldPdf;

/**
 * Hello world!
 *
 */
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorld {
	public static void main(String[] args) {
		Document document = new Document();
		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorldIn.PDF"));
			document.open();
			document.add(new Paragraph("HelloWorld"));
			document.close();
			writer.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
