package com.nixsolution.masliuk.computer.notebook;

import com.nixsolution.masliuk.computer.Computer;
import com.nixsolution.masliuk.computer.interfaces.INotebook;

public class Notebook extends Computer implements INotebook {

    public String battery;
    private String matrixType;
    private String screenResolution;
    private int screen;
    private boolean touchScreen;

    /**
     * Конструктор
     *
     * @param id                        номер
     * @param brand                     марка
     * @param model                     модель
     * @param year                      год випуска
     * @param dimensionsEdit            размеры
     * @param weight                    вес
     * @param price                     цена
     * @param cPU                       CPU процесора
     * @param numberOfProcessorCores    Количество ядер процессора
     * @param cPUCache                  Кеш-память процессора
     * @param rAM                       Оперативная память
     * @param processorBaseFrequencyGHz Базовая частота процессора, ГГц
     * @param rAMType                   Тип оперативной памяти
     * @param driveType                 Тип накопителя
     * @param sSDCapacity               Объем SSD
     * @param videoAdapter              Видеоадаптер
     * @param connectorsAndIOPorts      Разъемы и порты ввода-вывода
     * @param webCamera                 Web-камера
     * @param wirelessConnection        Беспроводная связь
     * @param videoAdapterType          Тип видеоадаптера
     * @param battery                   Battery
     * @param matrixType                Тип матрицы
     * @param screenResolution          Разрешение экрана
     * @param screen                    Экран
     * @param touchScreen               сенсорній єкран
     */
    public Notebook(int id, String brand, String model, int year, String dimensionsEdit,
                    double weight, int price, String cPU, String numberOfProcessorCores,
                    String cPUCache, String rAM, String processorBaseFrequencyGHz,
                    String rAMType, String driveType, String sSDCapacity, String videoAdapter,
                    String connectorsAndIOPorts, String webCamera, String wirelessConnection,
                    String videoAdapterType, String battery, String matrixType, String screenResolution,
                    int screen, boolean touchScreen) {

        super(id, brand, model, year, dimensionsEdit, weight, price, cPU, numberOfProcessorCores,
                cPUCache, rAM, processorBaseFrequencyGHz, rAMType, driveType, sSDCapacity,
                videoAdapter, connectorsAndIOPorts, webCamera, wirelessConnection, videoAdapterType);
        this.matrixType = matrixType;
        this.screen = screen;
        this.screenResolution = screenResolution;
        this.battery = battery;
        this.touchScreen = touchScreen;

    }

    @Override
    public int getScreen() {
        return screen;
    }

    @Override
    public String getMatrixType() {
        return matrixType;
    }

    @Override
    public String getScreenResolution() {
        return screenResolution;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public boolean isTouchScreen() {
        return touchScreen;
    }

    /**
     * Выводит тип компьютера.
     *
     * @return тип компьютера
     */
    @Override
    public String getMessageTypeComputer() {
        return "Notebook";
    }

    /**
     * Вывоит характеристики ноутбука.
     *
     * @return все характеристики ноутбука.
     */
    @Override
    public String toString() {
        return "Notebook{" +
                "matrixType='" + matrixType + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", screen=" + screen +
                ", touchScreen=" + touchScreen +
                ", battery='" + battery + '\'' +
                "} " + super.toString();
    }
}
