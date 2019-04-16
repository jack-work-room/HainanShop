package net.shop.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {

    private static final boolean IS_OPEN_LOG = false;
    private static Logger logger = LoggerFactory.getLogger(LogUtil.class);


    public static void error(String msg) {
        if (IS_OPEN_LOG) {
            logger.error(msg);
        }
    }

    public static void error(Throwable e) {
        error("", e);
    }

    public static void error(String msg, Throwable e) {
        if (IS_OPEN_LOG) {
            logger.error(msg, e);
        }
    }

}
