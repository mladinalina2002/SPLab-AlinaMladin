package ro.uvt.services;

import ro.uvt.models.Context;
import ro.uvt.models.Paragraph;

public interface AlignStrategy {
    public void render(Paragraph paragraph, Context context);
}
