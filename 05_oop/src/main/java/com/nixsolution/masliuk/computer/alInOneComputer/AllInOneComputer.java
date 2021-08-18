package com.nixsolution.masliuk.computer.alInOneComputer;

import com.nixsolution.masliuk.computer.Computer;
import com.nixsolution.masliuk.computer.interfaces.IAlInOneComputer;

public class AllInOneComputer extends Computer implements IAlInOneComputer {

    private String matrixType;
    private String screenResolution;
    private int screen;
    private String typeOfStandForTheScreen;

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
     * @param typeOfStandForTheScreen
     */
    public AllInOneComputer(int id, String brand, String model, int year, String dimensionsEdit, double weight, int price,
                            String cPU, String numberOfProcessorCores, String cPUCache, String rAM, String processorBaseFrequencyGHz,
                            String rAMType, String driveType, String sSDCapacity, String videoAdapter, String connectorsAndIOPorts,
                            String webCamera, String wirelessConnection, String videoAdapterType, String typeOfStandForTheScreen) {

        super(id, brand, model, year, dimensionsEdit, weight, price, cPU, numberOfProcessorCores, cPUCache, rAM,
                processorBaseFrequencyGHz, rAMType, driveType, sSDCapacity, videoAdapter, connectorsAndIOPorts,
                webCamera, wirelessConnection, videoAdapterType);
        this.screen = screen;
        this.typeOfStandForTheScreen = typeOfStandForTheScreen;
    }

    /**
     * Выводит тип компьютера.
     *
     * @return тип компьютера
     */
    @Override
    public String getMessageTypeComputer() {
        return "Al-in-One computer";
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
    public String getTypeOfStandForTheScreen() {
        return typeOfStandForTheScreen;
    }

    /**
     * Вывоит характеристики моноблока.
     *
     * @return все характеристики моноблока.
     */
    @Override
    public String toString() {
        return "AllInOneComputer{" +
                "matrixType='" + matrixType + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", screen=" + screen +
                ", typeOfStandForTheScreen='" + typeOfStandForTheScreen + '\'' +
                "} " + super.toString();
    }
}
