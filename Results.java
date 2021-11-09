package com.onpy;
import com.onpy.triangle;

import java.io.IOException;
import java.util.ArrayList;

public class Results {

    public static final int MARK_COUNT = 5;
    ArrayList<triangle> examResults;

    public void ExamResults() {
        this.examResults = new ArrayList<>();
    }
    void saveFile(String fileName) throws IOException, IOException {
        File saveToFile = new File();
        saveToFile.saveBinary(examResults, fileName);
    }

    void loadFile(String fileName) throws IOException {
        File loadToBase = new File();
        loadToBase.loadBinary(examResults, fileName);
    }
}