package ro.uvt.models;

import ro.uvt.services.Visitor;

public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int id);
    void accept(Visitor v);
}
