package com.suyu.utils;

import java.net.*;
import java.io.*;

public class Path
{
    public static String getRootPath() {
        final URL url = Path.class.getProtectionDomain().getCodeSource().getLocation();
        String filePath = "";
        try {
            filePath = URLDecoder.decode(url.getPath(), "UTF-8");
        }
        catch (Exception ex) {}
        filePath = filePath.replace("\\", "/").replace("//", "/");
        if (filePath.contains(":/") && filePath.startsWith("/")) {
            filePath = filePath.substring(1);
        }
        if (filePath.endsWith(".jar")) {
            filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);
        }
        return filePath;
    }
    
    public static String getClassResources() {
        String cpath = new Object() {
            public String getPath() {
                return this.getClass().getResource("").getPath();
            }
        }.getPath();
        cpath = URLDecoder.decode(cpath.replaceAll("file:/", ""));
        if (cpath.indexOf(":") != 1) {
            cpath = File.separator + cpath;
        }
        return cpath;
    }
}
