import java.io.File;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author adminjia
 */
public class Tools {


    /**
     * @param pathName 目录
     *                 <p>
     *                 删除目录下数字后缀的文件(不删除子目录)
     */
    public static int RemoveFile(File pathName) {
        int a = 0;
        if (!pathName.isDirectory()) {
            return 0;
        }
        List<File> collect = Arrays.stream(Objects.requireNonNull(pathName.listFiles()))
                .filter(File::isFile)
                .toList();
        if (collect.isEmpty()) {
            return 0;
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
            a++;
        }
        return a;
    }

    /**
     * @param pathName   目录
     * @param removePart 删除部分文件名
     */
    public static int FixFileName(File pathName, String removePart) {
        int a = 0;
        if (!pathName.isDirectory() || removePart == null || removePart.isEmpty()) {
            return a;
        }
        List<File> collect = Arrays.stream(Objects.requireNonNull(pathName.listFiles()))
                .filter(File::isFile)
                .toList();
        if (collect.isEmpty()) {
            return a;
        }
        for (File file : collect) {
            String name = file.getName();
            if (!name.contains(removePart)) {
                continue;
            }
            String reName = name.replace(removePart, "");
            File file1 = new File(file.getParent(), reName);
            file.renameTo(file1);
            a++;

        }
        return a;


    }

    public static Map<String, String> map = new LinkedHashMap<>();

    static {
        map.put("小乔妹妹", "【小乔妹妹】");
        map.put("24K小金条", "【24K小金条】");
        map.put("湖南小橙子", "【湖南小橙子】");
        map.put("ly萱萱", "【ly萱萱】");
        map.put("vivi小小酥", "【vivi小小酥】");
        map.put("芝士宝宝", "【芝士宝宝】");
        map.put("小欢喜T", "【小欢喜T】");
        map.put("林软软", "【林软软】");
        map.put("ANJONI小玖", "【ANJONI小玖】");
        map.put("AzZ、夏一晴", "【AzZ夏一晴】");
        map.put("AzZ夏一晴", "【AzZ夏一晴】");
        map.put("AzZ丶可爱兔", "【AzZ可爱兔】");
        map.put("AzZ丶小Q旺", "【AzZ小Q旺】");
        map.put("AzZ元小巴", "【AzZ元小巴】");
        map.put("minana呀", "【Minana呀】【米娜】");
        map.put("Minana呀", "【Minana呀】【米娜】");
        map.put("MH玹儿", "【MH玹儿】");
        map.put("HR乔鹿鹿766", "【HR乔鹿鹿766】");
        map.put("i宝宝星", "【i宝宝星】");
        map.put("Ky帝", "【Ky帝】");
        map.put("HR梗梗", "【HR梗梗】");
        map.put("MH丶啵啵", "【MH啵啵】");
        map.put("139小燃燃", "【小燃燃】");
        map.put("小燃燃", "【小燃燃】");
        map.put("brem嘉嘉", "【brem嘉嘉】");
        map.put("Chance喵", "【Chance喵】");
        map.put("CK李纯儿", "【CK李纯儿】");
        map.put("Ck奶酪小迪佳", "【Ck奶酪小迪佳】");
        map.put("Ck软糖-金琳爱睡觉", "【Ck软糖-金琳爱睡觉】");
        map.put("ella亦亦", "【ella亦亦】");
        map.put("DS夏安安", "【DS夏安安】");
        map.put("MH丶月亮", "【MH月亮】");
        map.put("MH丶千雅", "【MH千雅】");
        map.put("Miu初彤", "【Miu初彤】");
        map.put("Miu林薇薇", "【Miu林薇薇】");
        map.put("Miu苏晓", "【Miu苏晓】");
        map.put("Miu甜甜", "【Miu甜甜】");
        map.put("nian念儿", "【nian念儿】");
        map.put("Nice丶奶思丶", "【Nice丶奶思丶】");
        map.put("PiPi糖布妹", "【PiPi糖布妹】");
        map.put("车老板", "【车老板】");
        map.put("车模小静静", "【车模小静静】");
        map.put("白妖妖", "【白妖妖】");
        map.put("大慕慕吖", "【大慕慕吖】");
        map.put("大宝好哇塞呀", "【大宝好哇塞呀】");
        map.put("丹纯er", "【丹纯er】");
        map.put("毒毒呢", "【毒毒呢】");
        map.put("坏空空", "【坏空空】");
        map.put("华耀学姐", "【华耀学姐】");
        map.put("嘉映小奶糕", "【嘉映小奶糕】");
        map.put("嘉映小瓶盖", "【嘉映小瓶盖】");
        map.put("王雨檬呀", "【王雨檬呀】【王指导】");
        map.put("小野马", "【小野马】");
        map.put("小杨同学", "【小杨同学】");
        map.put("小小金同学", "【小小金同学】");
        map.put("小渔火ya", "【小渔火ya】");
        map.put("小微微", "【小微微】");
        map.put("小微微伴", "【小微微伴】");
        map.put("小水熙", "【小水熙】");
        map.put("星莱郭郭酱", "【星莱郭郭酱】");
        map.put("小师妹", "【小师妹】");
        map.put("芯芯yo", "【芯芯yo】");
        map.put("雪哥", "【雪哥】");
        map.put("MH甜芯儿", "【MH甜芯儿】");
        map.put("yoyo哟", "【yoyo哟】");
        map.put("一个磨人的小甜饼", "【一个磨人的小甜饼】");
        map.put("一只小猫呀m", "【一只小猫呀m】");
        map.put("一颗小胖斤", "【一颗小胖斤】");
        map.put("七哥张琪格", "【七哥张琪格】");
        map.put("三岁伊丶", "【三岁伊丶】");
        map.put("上架学姐", "【上架学姐】");
        map.put("书香、柔软", "【书香、柔软】");
        map.put("书香茶兔兔", "【书香茶兔兔】");
        map.put("优优yoki", "【优优yoki】");
        map.put("何菱", "【何菱】");
        map.put("你是个咩咩", "【你是个咩咩】");
        map.put("你是什么蒙萌", "【你是什么蒙萌】");
        map.put("你的11r", "【你的11r】");
        map.put("你的琳", "【你的琳】");
        map.put("你要尝一块面包吗", "【你要尝一块面包吗】");
        map.put("依依呀", "【依依呀】");
        map.put("依阳BABY", "【依阳BABY】");
        map.put("元宝er", "【元宝er】");
        map.put("兮兮", "【兮兮】");
        map.put("凌烟烟霸王强徒", "【凌烟烟霸王强徒】");
        map.put("刘钞钞", "【刘钞钞】");
        map.put("华耀兮儿", "【华耀兮儿】");
        map.put("华耀啊豆豆", "【华耀啊豆豆】");
        map.put("南妹儿呀", "【南妹儿呀】");
        map.put("原来是Kiki", "【原来是Kiki】");
        map.put("可可可可宝儿", "【可可可可宝儿】");
        map.put("同桌小美", "【同桌小美】");
        map.put("尹恩恩1", "【尹恩恩1】");
        map.put("小蛋糕", "【小蛋糕】");
        map.put("小c甜", "【小c甜】");
        map.put("夏菲", "【夏菲】");
        map.put("咸味小甜酒", "【咸味小甜酒】");
        map.put("小火龙", "【咸味小甜酒】");
        map.put(" -环星小梦mm", "【环星小梦mm】");
        map.put("环星小梦mm", "【环星小梦mm】");

    }

    /**
     * @param pathName 目录
     *                 <p>
     *                 优雅文件名
     */
    public static int ElegantFileName(File pathName) {
        AtomicInteger count = new AtomicInteger();
        if (!pathName.isDirectory()) {
            return count.get();
        }
        List<File> collect = Arrays.stream(Objects.requireNonNull(pathName.listFiles()))
                .filter(File::isFile)
                .toList();
        if (collect.isEmpty()) {
            return count.get();
        }
        for (File file : collect) {
            String name = file.getName();
            map.forEach((k, v) -> {
                if (!name.contains("【") && name.contains(k)) {
                    String reName = name.replace(k, map.get(k));
                    File file1 = new File(file.getParent(), reName);
                    file.renameTo(file1);
                    count.getAndIncrement();

                }
            });
        }
        return count.get();
    }
}
