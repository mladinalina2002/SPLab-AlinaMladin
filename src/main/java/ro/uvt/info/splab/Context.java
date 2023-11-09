package ro.uvt.info.splab;

import lombok.Getter;

@Getter
public class Context {
    private int pageWidth=156;

    public Context() {
    }

    public Context(int pageWidth) {
        this.pageWidth = pageWidth;
    }

    public void setPageWidth(int pageWidth) {
        this.pageWidth = pageWidth;
    }
}