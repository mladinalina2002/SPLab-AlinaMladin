<<<<<<< HEAD
package ro.uvt.services;

import ro.uvt.models.*;

public interface Visitor{
    void visitBook(Book book);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContents tableOfContents);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
}
=======
package ro.uvt.services;

import ro.uvt.models.*;

public interface Visitor{
    void visitBook(Book book);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContents tableOfContents);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
}
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
