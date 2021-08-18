package com.nixsolution.masliuk.serializable;

import java.io.Serializable;

/**
 * Bean который при десериализации всегда возвращает один и тоже объект
 *
 * @author yura
 *
 */
public interface SingletonBean extends Serializable {
}
