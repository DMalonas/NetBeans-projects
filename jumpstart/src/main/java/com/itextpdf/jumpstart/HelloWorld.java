
package com.itextpdf.jumpstart;

import com.itextpdf.io.IOException;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileNotFoundException;





public class HelloWorld {
            public static final String DEST = "results/chapter01/rick_astley.pdf";
            public static final String IMAGE = "C:\\Users\\Dimit\\Documents\\NetBeansProjects\\jumpstart\\src\\main\\java\\com\\itextpdf\\jumpstart\\GBA.bmp";
            

    public static void main(String args[]) throws IOException, FileNotFoundException, java.io.IOException {
       File file = new File(DEST);
            file.getParentFile().mkdirs();
            new HelloWorld().createPdf(DEST);
    }




    public void createPdf(String dest) throws IOException, FileNotFoundException, java.io.IOException {

        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        // Create a PdfFont
        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
                Image img = new Image(ImageDataFactory.create(IMAGE));

        // Add a Paragraph
        document.add(new Paragraph("BRITISH GLIDING ASSOCIATION CERTIFICATE:").setFont(font)).add(img);

        // Create a List
        List list = new List()
            .setSymbolIndent(12)
            .setListSymbol("\u2022")
            .setFont(font)
            .setBackgroundColor(Color.GREEN);
        // Add ListItem objects
        list.add(new ListItem("Field 1"))
            .add(new ListItem("Field 2"))
            .add(new ListItem("Field 3"))
            .add(new ListItem("Field 4"))
            .add(new ListItem("Field 5"))
            .add(new ListItem("Field 6"));
        // Add the list
        document.add(list);

        
        
        document.close();
    }

}

