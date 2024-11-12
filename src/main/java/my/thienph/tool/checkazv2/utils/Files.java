package my.thienph.tool.checkazv2.utils;

import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;


@Slf4j
public class Files {

    public static String open(Frame f) {
        FileDialog dialog = new FileDialog(f, "Chọn tệp cần mở:");
        dialog.setLocationRelativeTo(null);
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        dialog.dispose();
        String path = dialog.getDirectory();
        String name = dialog.getFile();
        return path != null ? path + name : null;
    }

    public static boolean delete(String path) {
        return new File(path).delete();
    }

    public static String read(String path) {
        return read(new File(path));
    }

    public static boolean overwrite(String path, Object data) {
        return overwrite(new File(path), data);
    }

    public static boolean overwrite(File file, Object data) {
        if (file.exists()) {
            file.delete();
        }
        try {
            OutputStream os = java.nio.file.Files.newOutputStream(file.toPath());
            os.write(data.toString().getBytes());
            os.close();
            return true;
        } catch (IOException e) {
        }
        return false;
    }

    public static String read(File file) {
        try {
            InputStream is = java.nio.file.Files.newInputStream(file.toPath());
            BufferedReader buff = toBufferedReader(is);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = buff.readLine()) != null) {
                sb.append(line).append("\n");
            }
            is.close();
            return sb.toString();
        } catch (IOException e) {
        }
        return null;
    }

    public static BufferedReader toBufferedReader(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
    }
}
