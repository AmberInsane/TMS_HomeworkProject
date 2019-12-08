package hw_14.task_5;

import java.io.File;
import java.util.List;

public interface CatFileRider { // Reader
    List<Cat> readCatFromFile(File file);
}
