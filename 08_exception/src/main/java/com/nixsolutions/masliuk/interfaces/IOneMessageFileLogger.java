package com.nixsolutions.masliuk.interfaces;


/**
 * Log messages having specific format to new file
 */

public interface IOneMessageFileLogger {
    String MESSAGE_STARTS_WITH = "MESSAGE: ";
    /**
     * @param message = massage that will be logged to file (should start with {@value
     * #MESSAGE_STARTS_WITH})
     * @throws java.io.IOException if IO error happened during writing message to file or file already
     * /@throws MessageIsNotFormattedException if message does not start with {@value #MESSAGE_STARTS_WITH}
     */

    void log(String message) throws Exception;
}
