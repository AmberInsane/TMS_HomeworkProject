package hw_14.task_5;

import java.io.File;

@FunctionalInterface
public interface CatFileWriter {
    void writeCatToFile(Cat cat, File file);
}
