package com.genpus.java.excel.util;

import com.genpus.java.excel.common.Common;

/**
 * @author supeng/ supeng87@126.com
 * @date 2019-04-15 17:34
 * @Modified By:
 * @Description:
 */
public class Util {
    public static String getPostfix(String path) {
        if (path == null || Common.EMPTY.equals(path.trim())) {
            return Common.EMPTY;
        }
        if (path.contains(Common.POINT)) {
            return path.substring(path.lastIndexOf(Common.POINT) + 1, path.length());
        }
        return Common.EMPTY;
    }
}
