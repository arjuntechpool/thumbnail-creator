package com.techpool.tech.utils;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;

public class FileTypeUtil {
    public static String detectMimeType(File file) throws IOException {
        return new Tika().detect(file);
    }
}
