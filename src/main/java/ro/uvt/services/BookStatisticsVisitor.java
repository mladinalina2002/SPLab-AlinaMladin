package ro.uvt.services;

import ro.uvt.models.*;

public class BookStatisticsVisitor implements Visitor{
    private int nrBooks;
    private int nrSection;
    private int nrTableOfContents;
    private int nrParagraph;
    private int nrImageProxy;
    private int nrImage;
    private int nrTable;
    public void printStatistics(){
        System.out.println("BookStatisticsVisitor{" +
                "nrBooks=" + nrBooks +
                ", nrSection=" + nrSection +
                ", nrTableOfContents=" + nrTableOfContents +
                ", nrParagraph=" + nrParagraph +
                ", nrImageProxy=" + nrImageProxy +
                ", nrImage=" + nrImage +
                ", nrTable=" + nrTable +
                '}');
    }

    @Override
    public void visitBook(Book book) {
        book.print();
        nrBooks++;
    }

    @Override
    public void visitSection(Section section) {
        section.print();
        nrSection++;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        tableOfContents.print();
        nrTableOfContents++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraph.print();
        nrParagraph++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.print();
        nrImageProxy++;
    }

    @Override
    public void visitImage(Image image) {
        image.print();
        nrImage++;
    }

    @Override
    public void visitTable(Table table) {
        table.print();
        nrTable++;
    }
}