package com.nixsolutions.masliuk.interfaces;

import com.nixsolutions.ppp.exceptions.Saver;

/**
 * Saves test to file
 */

public interface ISaver {
    /**
     * @param text - text to write to file
     * @param fileAbsolutePath - absolute path to file text will be saved to
     */
    void save(String text, String fileAbsolutePath);
}
