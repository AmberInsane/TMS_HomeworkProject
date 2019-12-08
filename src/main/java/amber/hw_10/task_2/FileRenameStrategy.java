package hw_10.task_2;

import java.io.File;

public enum FileRenameStrategy {
    TO_LOW_STRATEGY {
        @Override
        public String getNewFileName(File file) {
            String fileName = file.getName();
            fileName = fileName.toLowerCase();
            return fileName;
        }
    },
    TO_INITCAP_STRATEGY {
        @Override
        public String getNewFileName(File file) {
            String fileName = file.getName();
            fileName = fileName.substring(0, 1).toUpperCase() + fileName.substring(1).toLowerCase();
            return fileName;
        }
    },
    TO_UPPER_STRATEGY {
        @Override
        public String getNewFileName(File file) {
            String fileName = file.getName();
            fileName = fileName.toUpperCase();
            return fileName;
        }
    };

    public abstract String getNewFileName(File file);

    public boolean renameFile(File file) {
        return file.renameTo(new File(file.getParentFile().getAbsolutePath() + "\\" + getNewFileName(file)));
    }
}
