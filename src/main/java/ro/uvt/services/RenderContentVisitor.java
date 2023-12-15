<<<<<<< HEAD
package ro.uvt.services;

import ro.uvt.models.*;

public class RenderContentVisitor implements Visitor{

    @Override
    public void visitBook(Book book) {
        book.print();
    }

    @Override
    public void visitSection(Section section) {
        section.print();
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        tableOfContents.print();
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraph.print();
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.print();
    }

    @Override
    public void visitImage(Image image) {
        image.print();
    }

    @Override
    public void visitTable(Table table) {
        table.print();
    }
=======
package ro.uvt.services;

import ro.uvt.models.*;

public class RenderContentVisitor implements Visitor{

    @Override
    public void visitBook(Book book) {
        book.print();
    }

    @Override
    public void visitSection(Section section) {
        section.print();
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        tableOfContents.print();
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraph.print();
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.print();
    }

    @Override
    public void visitImage(Image image) {
        image.print();
    }

    @Override
    public void visitTable(Table table) {
        table.print();
    }
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
}