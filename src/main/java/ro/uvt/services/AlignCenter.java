package ro.uvt.services;

import ro.uvt.models.Context;
import ro.uvt.models.Paragraph;
import ro.uvt.services.AlignStrategy;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int length = text.length();
        int pageWidth = context.getPageWidth();

        int spacesNeeded = (pageWidth - length) / 2;


        for (int i = 0; i < spacesNeeded; i++) {
            System.out.print(" ");
        }

        System.out.print(text);

        for (int i = 0; i < spacesNeeded; i++) {
            System.out.print(" ");
        }

        System.out.println();
    }
}