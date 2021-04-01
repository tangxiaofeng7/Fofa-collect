package com.suyu.utils;

import java.io.*;

public class FileTools
{
    public static byte[] getBytesByFile(final String filePath) throws IOException {
        final InputStream in = new FileInputStream(filePath);
        final byte[] data = toByteArray(in);
        in.close();
        return data;
    }
    
    public static byte[] toByteArray(final InputStream in) throws IOException {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final byte[] buffer = new byte[4096];
        final boolean var3 = false;
        int n;
        while ((n = in.read(buffer)) != -1) {
            out.write(buffer, 0, n);
        }
        return out.toByteArray();
    }
    
    public static byte[] readToBytes(final String path) throws IOException {
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        final File ff = new File(path);
        final FileInputStream fs = new FileInputStream(ff);
        final byte[] temp = new byte[4096];
        final boolean var5 = false;
        int len;
        while ((len = fs.read(temp)) != -1) {
            bos.write(temp, 0, len);
        }
        fs.close();
        final byte[] data = bos.toByteArray();
        bos.close();
        return data;
    }
    
    public static String readFileToString(final String path) throws IOException {
        final byte[] data = readToBytes(path);
        final String str = new String(data, "UTF-8");
        return str;
    }
    
    public static void writeFile(final String filePath, final String content) {
        try {
            final OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(filePath), "utf-8");
            final BufferedWriter writer = new BufferedWriter(write);
            writer.write(content);
            writer.close();
        }
        catch (IOException var4) {
            var4.printStackTrace();
        }
    }
    
    public static String readOneLineTxtFile(final String filePath) {
        try {
            final String encoding = "utf-8";
            final File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                final InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
                final BufferedReader bufferedReader = new BufferedReader(read);
                final String lineTxt = bufferedReader.readLine();
                bufferedReader.close();
                read.close();
            }
            else {
                System.out.println("\u627e\u4e0d\u5230\u6307\u5b9a\u7684\u6587\u4ef6,\u67e5\u770b\u6b64\u8def\u5f84\u662f\u5426\u6b63\u786e:" + filePath);
            }
        }
        catch (Exception var6) {
            System.out.println("\u8bfb\u53d6\u6587\u4ef6\u5185\u5bb9\u51fa\u9519");
        }
        return "";
    }
    
    public static String readFileAllContent(final String filePath, final String encoding) {
        final StringBuffer fileContent = new StringBuffer();
        try {
            final File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                final InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
                final BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    fileContent.append(lineTxt);
                    fileContent.append("\n");
                }
                read.close();
            }
            else {
                System.out.println("\u627e\u4e0d\u5230\u6307\u5b9a\u7684\u6587\u4ef6,\u67e5\u770b\u6b64\u8def\u5f84\u662f\u5426\u6b63\u786e:" + filePath);
            }
        }
        catch (Exception var7) {
            System.out.println("\u8bfb\u53d6\u6587\u4ef6\u5185\u5bb9\u51fa\u9519");
        }
        return fileContent.toString();
    }
}
