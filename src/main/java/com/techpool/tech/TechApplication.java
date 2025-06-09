package com.techpool.tech;

import java.util.Arrays;
import javax.imageio.ImageIO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableCaching
public class TechApplication {
	private static final Logger logger = LoggerFactory.getLogger(ThumbnailService.class);

	public static void main(String[] args) {
		SpringApplication.run(TechApplication.class, args);
	}

	@PostConstruct
	public void initImageIO() {
		// Ensure TwelveMonkeys plugins are registered
		ImageIO.scanForPlugins();
		logger.info("Available image readers: {}", Arrays.toString(ImageIO.getReaderFormatNames()));
		logger.info("Available image writers: {}", Arrays.toString(ImageIO.getWriterFormatNames()));
	}

}
