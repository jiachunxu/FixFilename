import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author adminjia
 */
public class Tools {


    /**
     * @param pathName 目录
     *                 删除数字后缀的文件(不删除子目录)
     */
    public static void RemoveFile(File pathName) {
        if (!pathName.isDirectory()) {
            return;
        }
        List<File> collect = Arrays
                .stream(Objects.requireNonNull(pathName.listFiles()))
                .filter(File::isFile).toList();
        if (collect.isEmpty()) {
            return;
        }
        for (File file : collect) {
            String[] split = file.getName().split("\\.");
            String s = split[split.length - 1];
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                continue;
            }
            file.delete();
        }
    }

}
