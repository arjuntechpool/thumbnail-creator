# 📸 Thumbnail Generation Service

This project provides a `ThumbnailService` for generating thumbnails from images, videos, and documents.

---

## ✅ Prerequisites

Ensure the following are installed:

- Java 8+ (JDK)
- Maven
- FFmpeg (for video thumbnails)
- LibreOffice (for document conversion)
- GitHub account

---

## 📦 Adding to GitHub

### 1. Create a New Repository

1. Go to GitHub → **New repository**.
2. Name it (e.g., `thumbnail-generator-service`).
3. Choose visibility (Public/Private), optionally initialize with `README.md`.
4. Click **Create repository**.

### 2. Clone the Repository

```bash
git clone https://github.com/your-username/thumbnail-generator-service.git
cd thumbnail-generator-service

```
### 3. Add the Code
Create the folder structure:

swift
Copy
Edit
src/main/java/com/techpool/tech/ThumbnailService.java
Copy your ThumbnailService code into this file.

### 4. Add Maven Dependencies (pom.xml)
   <dependencies>
    <!-- Spring Boot Starter -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
        <version>2.7.0</version>
    </dependency>

    <!-- Apache Tika (MIME detection) -->
    <dependency>
        <groupId>org.apache.tika</groupId>
        <artifactId>tika-core</artifactId>
        <version>2.4.1</version>
    </dependency>

    <!-- PDFBox (PDF rendering) -->
    <dependency>
        <groupId>org.apache.pdfbox</groupId>
        <artifactId>pdfbox</artifactId>
        <version>2.0.27</version>
    </dependency>

    <!-- Thumbnailator (Image resizing) -->
    <dependency>
        <groupId>net.coobird</groupId>
        <artifactId>thumbnailator</artifactId>
        <version>0.4.18</version>
    </dependency>
</dependencies>

### 5. Commit & Push
bash
Copy
Edit
git add .
git commit -m "feat: Add ThumbnailService for generating thumbnails"
git push origin main
🚀 Usage
As a Spring Boot Component
java
Copy
Edit
@Autowired
private ThumbnailService thumbnailService;

thumbnailService.processPath(new File("/path/to/files"));
#### As a Standalone Java App
java
Copy
Edit
public static void main(String[] args) {
    ThumbnailService thumbnailService = new ThumbnailService();
    thumbnailService.processPath(new File("/path/to/files"));
}

### 🗂 Supported File Types
Type	Formats	Notes
Images	JPG, PNG, GIF, BMP	Uses Thumbnailator
Videos	MP4, AVI, MKV, MOV	Requires FFmpeg in PATH
Documents	PDF, DOC, DOCX, PPT, XLS	Converts to PDF via LibreOffice
Others	Unsupported files	Generates a default placeholder thumbnail

🔧 External Dependencies Setup
FFmpeg (for Video Thumbnails)
Linux / macOS
bash
Copy
Edit
sudo apt install ffmpeg        # Ubuntu/Debian
brew install ffmpeg            # macOS (Homebrew)
Windows
Download from ffmpeg.org

Add to system PATH

LibreOffice (for Document Conversion)
Linux / macOS
bash
Copy
Edit
sudo apt install libreoffice   # Ubuntu/Debian
brew install libreoffice       # macOS (Homebrew)
Windows
Download from libreoffice.org

Install and ensure soffice is in PATH

### 🛠 Troubleshooting
Issue	Solution
FFmpeg not found	Install FFmpeg and ensure it's in your PATH
LibreOffice conversion fails	Run soffice --version to verify install
Password-protected PDFs	Skipped or fallback to text extraction
Unsupported file formats	Placeholder thumbnail is generated

📄 License
This project is licensed under the MIT License.

text
Copy
Edit
MIT License

Copyright (c) [Year] [Your Name]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction...
