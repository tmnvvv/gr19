package ru.rudenko.task30_09.documentworker;

/**
 * @author Rudenko
 * @created 01/10/2021
 * @project ProDocumentWorker
 */

/**
 * ref https://docs.google.com/document/d/1X8c_KuZ8hvAo1krStu9UOi05icX950ZF1ETNYVOUojM/edit
 */
public class ProDocumentWorker extends DocumentWorker {
    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        super.editDocument();
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        super.saveDocument();
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
