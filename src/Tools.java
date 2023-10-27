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
     *                 <p>
     *                 删除目录下数字后缀的文件(不删除子目录)
     */
    public static void RemoveFile(File pathName) {
        if (!pathName.isDirectory()) {
            return;
        }
        List<File> collect = Arrays.stream(Objects.requireNonNull(pathName.listFiles()))
                .filter(File::isFile)
                .toList();
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

    /**
     * @param pathName   目录
     * @param removePart 删除部分文件名
     */
    public static void FixFileName(File pathName, String removePart) {
        if (!pathName.isDirectory() || removePart == null || removePart.isEmpty()) {
            return;
        }
        List<File> collect = Arrays.stream(Objects.requireNonNull(pathName.listFiles()))
                .filter(File::isFile)
                .toList();
        if (collect.isEmpty()) {
            return;
        }
        for (File file : collect) {
            String name = file.getName();
            if (!name.contains(removePart)) {
                continue;
            }
            String reName = name.replace(removePart, "");
            File file1 = new File(file.getParent(), reName);
            file.renameTo(file1);

        }


    }

}
