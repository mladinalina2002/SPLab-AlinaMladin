package ro.uvt.info.splab;

public interface Element {
    default void print() {
    }

    default void add(Element element) {
    }

    void remove(Element element);
    Element get(int id);
}
