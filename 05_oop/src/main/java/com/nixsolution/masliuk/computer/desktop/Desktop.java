package com.nixsolution.masliuk.computer.desktop;

import com.nixsolution.masliuk.computer.Computer;
import com.nixsolution.masliuk.computer.interfaces.IDesktop;

public class Desktop extends Computer implements IDesktop {

    private boolean opticalDrive;
    private int driveHDD;

    /**
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
     * @param videoAdapterType          Тип видеоадаптера* @param connectorsAndIOPorts   *
     * @param opticalDrive
     * @param driveHDD
     */
    public Desktop(int id, String brand, String model, int year, String dimensionsEdit, double weight, int price,
                   String cPU, String numberOfProcessorCores, String cPUCache, String rAM, String processorBaseFrequencyGHz,
                   String rAMType, String driveType, String sSDCapacity, String videoAdapter, String connectorsAndIOPorts,
                   String webCamera, String wirelessConnection, String videoAdapterType, boolean opticalDrive, int driveHDD) {

        super(id, brand, model, year, dimensionsEdit, weight, price, cPU, numberOfProcessorCores, cPUCache, rAM,
                processorBaseFrequencyGHz, rAMType, driveType, sSDCapacity, videoAdapter, connectorsAndIOPorts,
                webCamera, wirelessConnection, videoAdapterType);
        this.driveHDD = driveHDD;
        this.opticalDrive = opticalDrive;
    }

    @Override
    public boolean isOpticalDrive() {
        return opticalDrive;
    }

    @Override
    public int getDriveHDD() {
        return driveHDD;
    }

    /**
     * Выводит тип компьютера.
     *
     * @return тип компьютера
     */
    @Override
    public String getMessageTypeComputer() {
        return "Desktop";
    }

    /**
     * Вывоит характеристики блока компьютера.
     *
     * @return все характеристики блока компьютера.
     */
    @Override
    public String toString() {
        return "Desktop{" +
                "opticalDrive=" + opticalDrive +
                ", driveHDD=" + driveHDD +
                "} " + super.toString();
    }
}
