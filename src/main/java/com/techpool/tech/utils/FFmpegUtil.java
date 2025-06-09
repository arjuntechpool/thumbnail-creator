package com.techpool.tech.utils;

import java.io.File;
import java.io.IOException;

public class FFmpegUtil {
    public static void extractThumbnail(File videoFile) throws IOException {
        String output = videoFile.getParent() + "/thumb_" + videoFile.getName() + ".jpg";
        ProcessBuilder pb = new ProcessBuilder(
                "ffmpeg", "-i", videoFile.getAbsolutePath(),
                "-ss", "00:00:01.000", "-vframes", "1", output);
        pb.inheritIO();
        pb.start();
    }
}
