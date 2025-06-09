package com.techpool.tech;

import java.io.File;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/thumbnail")
public class ThumbnailController {

    @Autowired
    private ThumbnailService thumbnailService;

    @PostMapping("/generate")
    public ResponseEntity<String> generate(@RequestParam String path) {
        try {
            // Decode URL and handle spaces properly
            String decodedPath = URLDecoder.decode(path, StandardCharsets.UTF_8);
            // Convert to Windows-style path if needed
            decodedPath = decodedPath.replace('/', File.separatorChar);

            File input = new File(decodedPath);
            thumbnailService.processPath(input);
            return ResponseEntity.ok("Thumbnails generated successfully.");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error: " + e.getMessage());
        }
    }
}
