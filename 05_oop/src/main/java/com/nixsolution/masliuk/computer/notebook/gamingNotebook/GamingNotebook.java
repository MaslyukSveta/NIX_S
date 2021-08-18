package com.nixsolution.masliuk.computer.notebook.gamingNotebook;

import com.nixsolution.masliuk.computer.interfaces.IGamingNotebook;
import com.nixsolution.masliuk.computer.notebook.Notebook;

public class GamingNotebook extends Notebook implements IGamingNotebook {

    private String coolingType;
    private int numberOfCoolers;

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
     * @param videoAdapterType          Тип видеоадаптера* @param connectorsAndIOPorts
     * @param battery                   Battery
     * @param matrixType                Тип матрицы
     * @param screenResolution          Разрешение экрана
     * @param screen                    Экран
     * @param touchScreen
     * @param coolingType
     * @param numberOfCoolers
     */
    public GamingNotebook(int id, String brand, String model, int year, String dimensionsEdit,
                          double weight, int price, String cPU, String numberOfProcessorCores,
                          String cPUCache, String rAM, String processorBaseFrequencyGHz,
                          String rAMType, String driveType, String sSDCapacity, String videoAdapter,
                          String connectorsAndIOPorts, String webCamera, String wirelessConnection,
                          String videoAdapterType, String battery, String matrixType,
                          String screenResolution, int screen, boolean touchScreen, String coolingType, int numberOfCoolers) {

        super(id, brand, model, year, dimensionsEdit, weight, price, cPU, numberOfProcessorCores,
                cPUCache, rAM, processorBaseFrequencyGHz, rAMType, driveType, sSDCapacity, videoAdapter,
                connectorsAndIOPorts, webCamera, wirelessConnection, videoAdapterType, battery, matrixType,
                screenResolution, screen, touchScreen);
        this.coolingType = coolingType;
        this.numberOfCoolers = numberOfCoolers;
    }

    @Override
    public int getNumberOfCoolers() {
        return numberOfCoolers;
    }

    @Override
    public String getCoolingType() {
        return coolingType;
    }

    /**
     * Выводит тип компьютера.
     *
     * @return тип компьютера
     */
    @Override
    public String getMessageTypeComputer() {
        return "Gaming notebook";
    }

    /**
     * Вывоит характеристики игрового ноутбука.
     *
     * @return все характеристики игрового ноутбука.
     */
    @Override
    public String toString() {
        return "GamingNotebook{" +
                "coolingType='" + coolingType + '\'' +
                ", numberOfCoolers=" + numberOfCoolers +
                "} " + super.toString();
    }
}
