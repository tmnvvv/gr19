package ru.rudenko.task05_10.abstracthandler;

public class Main {

    public static void main(String[] args) {
        DOCHandler doc = new DOCHandler();
        doc.create();
        doc.pen();
        doc.change();
        doc.save();

        TXTHandler txt = new TXTHandler();
        txt.create();
        txt.pen();
        txt.change();
        txt.save();

        XMLHandler xml = new XMLHandler();
        xml.create();
        xml.pen();
        xml.change();
        xml.save();
    }
}
