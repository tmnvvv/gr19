package ru.rudenko.task05_10.playblerecordable;

/*
 * @author Rudenko, Latuskin
 * @created 05/10/2021
 * @project AbstractHandler
 */

/**
 * ref: https://drive.google.com/drive/folders/1gj6yIVZb1ADzzOrO67UUMSHRf31gZ0Eg
 */
public class Player implements Playable, Recordable{
    @Override
    public void play() {
        System.out.println("Начать воиспроизведение");
    }

    @Override
    public void record() {
        System.out.println("Начать запись");
    }

    @Override
    public void pause() {
        System.out.println("Поставить паузу");
    }

    @Override
    public void stop() {
        System.out.println("Остановить");
    }
}
