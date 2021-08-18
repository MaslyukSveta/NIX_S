package com.nixsolution.masliuk.computer;

import com.nixsolution.masliuk.computer.interfaces.IComputer;

public class Computer implements IComputer {

    public int id;
    public String brand;
    public String model;
    public int year;
    public String dimensionsEdit;
    public double weight;
    public int price;
    public String cPU;
    public String numberOfProcessorCores;
    public String cPUCache;
    public String rAM;
    public String processorBaseFrequencyGHz;
    public String rAMType;
    public String driveType;
    public String sSDCapacity;
    public String videoAdapter;
    public String connectorsAndIOPorts;
    public String webCamera;
    public String wirelessConnection;
    public String videoAdapterType;


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
     */
    public Computer(int id, String brand, String model, int year, String dimensionsEdit, double weight, int price, String cPU,
                    String numberOfProcessorCores, String cPUCache, String rAM, String processorBaseFrequencyGHz, String rAMType,
                    String driveType, String sSDCapacity, String videoAdapter, String connectorsAndIOPorts, String webCamera,
                    String wirelessConnection, String videoAdapterType) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.dimensionsEdit = dimensionsEdit;
        this.weight = weight;
        this.price = price;
        this.cPU = cPU;
        this.numberOfProcessorCores = numberOfProcessorCores;
        this.cPUCache = cPUCache;
        this.rAM = rAM;
        this.processorBaseFrequencyGHz = processorBaseFrequencyGHz;
        this.rAMType = rAMType;
        this.driveType = driveType;
        this.sSDCapacity = sSDCapacity;
        this.videoAdapter = videoAdapter;
        this.connectorsAndIOPorts = connectorsAndIOPorts;
        this.webCamera = webCamera;
        this.wirelessConnection = wirelessConnection;
        this.videoAdapterType = videoAdapterType;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getConnectorsAndIOPorts() {
        return connectorsAndIOPorts;
    }

    @Override
    public String getcPU() {
        return cPU;
    }

    @Override
    public String getcPUCache() {
        return cPUCache;
    }

    @Override
    public String getDimensionsEdit() {
        return dimensionsEdit;
    }

    @Override
    public String getDriveType() {
        return driveType;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getNumberOfProcessorCores() {
        return numberOfProcessorCores;
    }

    @Override
    public String getProcessorBaseFrequencyGHz() {
        return processorBaseFrequencyGHz;
    }

    @Override
    public String getrAM() {
        return rAM;
    }

    @Override
    public String getrAMType() {
        return rAMType;
    }

    @Override
    public String getsSDCapacity() {
        return sSDCapacity;
    }

    @Override
    public String getVideoAdapter() {
        return videoAdapter;
    }

    @Override
    public String getVideoAdapterType() {
        return videoAdapterType;
    }

    @Override
    public String getWebCamera() {
        return webCamera;
    }

    @Override
    public String getWirelessConnection() {
        return wirelessConnection;
    }

    /**
     * Выводит тип компьютера.
     *
     * @return тип компьютера
     */
    @Override
    public String getMessageTypeComputer() {
        return "Type computer";
    }

    /**
     * Вывоит характеристики компьютера.
     *
     * @return характеристики компьютера.
     */
    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", dimensionsEdit='" + dimensionsEdit + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", cPU='" + cPU + '\'' +
                ", numberOfProcessorCores='" + numberOfProcessorCores + '\'' +
                ", cPUCache='" + cPUCache + '\'' +
                ", rAM='" + rAM + '\'' +
                ", processorBaseFrequencyGHz='" + processorBaseFrequencyGHz + '\'' +
                ", rAMType='" + rAMType + '\'' +
                ", driveType='" + driveType + '\'' +
                ", sSDCapacity='" + sSDCapacity + '\'' +
                ", videoAdapter='" + videoAdapter + '\'' +
                ", connectorsAndIOPorts='" + connectorsAndIOPorts + '\'' +
                ", webCamera='" + webCamera + '\'' +
                ", wirelessConnection='" + wirelessConnection + '\'' +
                ", videoAdapterType='" + videoAdapterType + '\'' +
                '}';
    }
}
