<<<<<<< HEAD
package ro.uvt.services;

import ro.uvt.models.Context;
import ro.uvt.models.Paragraph;
import ro.uvt.services.AlignStrategy;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int length = text.length();
        int pageWidth = context.getPageWidth();

        int spacesNeeded = pageWidth - length;

        for (int i = 0; i < spacesNeeded; i++) {
            System.out.print(" ");
        }

        System.out.println(text);
    }
=======
package ro.uvt.services;

import ro.uvt.models.Context;
import ro.uvt.models.Paragraph;
import ro.uvt.services.AlignStrategy;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int length = text.length();
        int pageWidth = context.getPageWidth();

        int spacesNeeded = pageWidth - length;

        for (int i = 0; i < spacesNeeded; i++) {
            System.out.print(" ");
        }

        System.out.println(text);
    }
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
}