package com.example.tempaper1.service;

import com.example.tempaper1.model.FileMassageException;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;

public interface FilesService {
    boolean saveSockToFile(String json);

    String readSocksFromFile() throws FileMassageException;

    void cleanFile(String fileName) throws FileNotFoundException, FileMassageException;

    Path createTempFile(String suffix);

    File getFileSOck();

    void cleanSockFile() throws FileMassageException, FileNotFoundException;

}
