import java.io.File;

/**
 * @author adminjia
 */
public class Main {


    public static void main(String[] args) {
//        File file = new File("D:\\aria2\\专业录制");
        File path = new File("D:\\aria2\\test");
        Tools.RemoveFile(path);
        Tools.FixFileName(path, "-账号已注销-账号已注销-哔哩哔哩视频");
        Tools.FixFileName(path, "斗鱼-");
        Tools.FixFileName(path, "网易CC-");
        Tools.FixFileName(path, "抖音-");
        System.out.println("完成");

    }

}
