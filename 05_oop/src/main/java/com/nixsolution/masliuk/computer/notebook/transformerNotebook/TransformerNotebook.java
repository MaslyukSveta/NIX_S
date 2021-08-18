package com.nixsolution.masliuk.computer.notebook.transformerNotebook;

import com.nixsolution.masliuk.computer.interfaces.IComputer;
import com.nixsolution.masliuk.computer.interfaces.ITransformerNotebook;
import com.nixsolution.masliuk.computer.notebook.Notebook;

public class TransformerNotebook extends Notebook implements ITransformerNotebook, IComputer {

    private String typeOfTransformerMechanism;

    /**
     * Конструктор
     * @param id номер
     * @param brand марка
     * @param model модель
     * @param year год випуска
     * @param dimensionsEdit размеры
     * @param weight вес
     * @param price цена
     * @param cPU CPU процесора
     * @param numberOfProcessorCores Количество ядер процессора
     * @param cPUCache Кеш-память процессора
     * @param rAM Оперативная память
     * @param processorBaseFrequencyGHz Базовая частота процессора, ГГц
     * @param rAMType Тип оперативной памяти
     * @param driveType Тип накопителя
     * @param sSDCapacity Объем SSD
     * @param videoAdapter Видеоадаптер
     * @param connectorsAndIOPorts Разъемы и порты ввода-вывода
     * @param webCamera Web-камера
     * @param wirelessConnection Беспроводная связь
     * @param videoAdapterType Тип видеоадаптера
     * @param connectorsAndIOPorts
     * @param battery Battery
     * @param matrixType Тип матрицы
     * @param screenResolution Разрешение экрана
     * @param screen Экран
     * @param touchScreen сенсорній єкран
     * @param typeOfTransformerMechanism поворотный механизм
     */
    public TransformerNotebook(int id, String brand, String model, int year, String dimensionsEdit,
                        double weight, int price, String cPU, String numberOfProcessorCores, String cPUCache,
                        String rAM, String processorBaseFrequencyGHz, String rAMType, String driveType,
                        String sSDCapacity, String videoAdapter, String connectorsAndIOPorts, String webCamera,
                        String wirelessConnection, String videoAdapterType, String battery, String matrixType,
                        String screenResolution, int screen, boolean touchScreen, String typeOfTransformerMechanism) {
        super(id, brand, model, year, dimensionsEdit, weight, price, cPU, numberOfProcessorCores,
                cPUCache, rAM, processorBaseFrequencyGHz, rAMType, driveType, sSDCapacity, videoAdapter,
                connectorsAndIOPorts, webCamera, wirelessConnection, videoAdapterType, battery, matrixType,
                screenResolution, screen, touchScreen);
        this.typeOfTransformerMechanism = typeOfTransformerMechanism;
    }

    /**
     * Выводит тип компьютера.
     * @return тип компьютера
     */
    @Override
    public String getMessageTypeComputer() {
        return "Transformer notebook";
    }
    @Override
    public String getTypeOfTransformerMechanism() {
        return typeOfTransformerMechanism;
    }

    /**
     * Вывоит характеристики ноутбука трансформера.
     * @return все характеристики ноутбука трансформера.
     */
    @Override
    public String toString() {
        return "TransformerNotebook{" +
                "typeOfTransformerMechanism='" + typeOfTransformerMechanism + '\'' +
                "} " + super.toString();
    }
}
