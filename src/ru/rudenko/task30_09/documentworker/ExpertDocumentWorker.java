package ru.rudenko.task30_09.documentworker;

/**
 * @author Rudenko
 * @created 01/10/2021
 * @project ExpertDocumentWorker
 */
public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        super.editDocument();
    }

    @Override
    public void saveDocument() {
        super.saveDocument();
        System.out.println("Документ сохранен в новом формате");
    }
}
