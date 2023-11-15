import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author adminjia
 */
public class Main {


    public static void main(String[] args) throws IOException {
        File path = new File("D:\\aria2\\专业录制");
//        File path = new File("D:\\aria2\\test");
        int i = Tools.RemoveFile(path);
        System.out.println("RemoveFile : " + i);
        int i1 = Tools.FixFileName(path, "-账号已注销-账号已注销-哔哩哔哩视频");
        i1 += Tools.FixFileName(path, "斗鱼-");
        i1 += Tools.FixFileName(path, "网易CC-");
        i1 += Tools.FixFileName(path, "抖音-");
        i1 += Tools.FixFileName(path, "虎牙-");
        i1 += Tools.FixFileName(path, "虎牙");

        System.out.println("FixFileName :" + i1);
        i = Tools.ElegantFileName(path);
        System.out.println("ElegantFileName :" + i);
        System.out.println("完成");
        File file = new File("hello.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(file));


 /*       List<String> list = Arrays.stream(Objects.requireNonNull(path.listFiles())).map(File::getName).filter(s -> s.contains("_")).map(s -> s.split("_")[0])
                .filter(s -> !s.contains("【"))
                .distinct()
                .filter(s -> !s.contains("-"))
                .toList();
        for (String s : list) {
            String s1 = "map.put(\"" + s + "\", \"【" + s + "】\");";
//            out.write(s1);
//            out.newLine();
        }
        System.out.println(list.size());*/
        out.close();
    }

}
