package ru.rudenko.task05_10.abstracthandler;

/*
 * @author Rudenko, Latuskin
 * @created 05/10/2021
 * @project AbstractHandler
 */

/**
 * ref: https://drive.google.com/drive/folders/1gj6yIVZb1ADzzOrO67UUMSHRf31gZ0Eg
 */
public class TXTHandler extends AbstractHandler{
    @Override
    public void pen() {
        System.out.println("Редактирование в TXT");
    }

    @Override
    public void create() {
        System.out.println("Создание файла в TXT");
    }

    @Override
    public void change() {
        System.out.println("Изменение файла в TXT");
    }

    @Override
    public void save() {
        System.out.println("Сохранение фалйа в TXT");
    }
}
