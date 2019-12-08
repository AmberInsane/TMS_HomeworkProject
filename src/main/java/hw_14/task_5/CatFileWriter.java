package hw_14.task_5;

import java.io.File;
import java.util.List;

@FunctionalInterface
// +
public interface CatFileWriter {
    void writeCatToFile(List<Cat> catList, File file);
}
