package net.shop.base.util;

import java.util.Random;
import org.apache.commons.lang.StringUtils;

public class ConvertUtil {
    private static final String CHARSET_NAME = "UTF-8";
    private static final Random random = new Random();

    public static String replaceUrlParam(String url, String name, String value) {
        if (StringUtils.isNotBlank(url) && StringUtils.isNotBlank(value)) {
            url = url.replaceAll("(" + name + "=[^&]*)", name + "=" + value);
        }
        return url;
    }

    public static String createRandom(boolean isNeedPrefix) {
        StringBuilder sb = new StringBuilder();
        if (isNeedPrefix) {
            sb.append(DateUtil.getCurrDateStr("yyyyMMdd"));
        }

        return sb.append(random.nextInt(10000)).toString();
    }

    public static String getSimpleExceptionDesc(Throwable e) {
        if (e == null) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            String exceptionClass = e.getClass().getSimpleName() + ": ";
            exceptionClass = exceptionClass.replace("ServiceException: ", "").replace("ControllerException: ", "");
            sb.append(exceptionClass);
            String msg = e.getMessage() == null ? "null" : e.getMessage();
            if (msg.length() > 80) {
                msg = msg.substring(0, 80) + "...";
            }

            sb.append(msg);
            if (e.getCause() != null) {
                sb.append(" [Caused by: ").append(e.getCause().getClass().getSimpleName()).append(": ");
                msg = e.getCause().getMessage() == null ? "null" : e.getCause().getMessage();
                if (msg.length() > 80) {
                    msg = msg.substring(0, 80) + "...";
                }

                sb.append(msg).append("]");
            }

            return sb.toString();
        }
    }

}
