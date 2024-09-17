package br.com.trabalho_individual.utils;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Util { 
    private static Logger logger = Logger.getLogger(Util.class.getName());
    private Util() {

        throw new IllegalStateException(Util.class.getName());
    }

    public static Logger setupLogger() {
        if (logger.getHandlers().length == 0) {
            ConsoleHandler customHandler = new ConsoleHandler();
            customHandler.setFormatter(new Formatter() {
                @Override
                public String format(LogRecord rec) {
                    return rec.getMessage() + "";
                }
            });
            logger.addHandler(customHandler);
        }

        logger.setUseParentHandlers(false); // Desabilita a herança de handlers
        return logger;
    }


    // Remove todos os Handlers extras do Logger
    public static void customizer() {
        if (logger.getHandlers().length > 1) {
            for (Handler log : logger.getHandlers()) {// iteracao
                logger.removeHandler(log);
                if (logger.getHandlers().length == 1) {
                    break;
                }
            }
        }
    }

}