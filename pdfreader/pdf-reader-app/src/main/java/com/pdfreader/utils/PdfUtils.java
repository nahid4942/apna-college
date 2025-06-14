package com.pdfreader.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfUtils {

    public static String loadPdf(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new IOException("File not found: " + filePath);
        }
        PDDocument document = PDDocument.load(file);
        return document.toString();
    }

    public static String extractTextFromPdf(String filePath) throws IOException {
        PDDocument document = PDDocument.load(new File(filePath));
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(document);
        document.close();
        return text;
    }

    public static void savePdf(String content, String outputPath) throws IOException {
        Files.write(Paths.get(outputPath), content.getBytes());
    }
}