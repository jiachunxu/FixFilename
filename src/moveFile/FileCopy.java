package moveFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author adminjia
 */
public class FileCopy {


    public static void main(String[] args) throws IOException {
        String target = "C:\\Users\\adminjia\\Pictures\\test";
//        String src = "C:\\Users\\adminjia\\Pictures\\go语言权威指南 - 副本";
        String src = "C:\\Users\\adminjia\\Pictures\\Go语言开发实战";
        File file = new File(src);
        List<File> list = Arrays.stream(Objects.requireNonNull(file.listFiles())).filter(File::isFile).sorted((f1, f2) -> Math.toIntExact(f1.lastModified() - f2.lastModified())).toList();
//        System.out.println(list);
        int num = 1;
        for (File file1 : list) {

            String path = file1.getPath();
            var name = num + ".jpg";
            File file2 = new File(target, name);
            Files.copy(Path.of(path), new FileOutputStream(file2));
            num++;
        }
        System.out.println("完成");

    }

}
