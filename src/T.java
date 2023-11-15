import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author adminjia
 */
public class T {
    public static void main(String[] args) throws IOException {

        String in = "0123456789abcdefghijklmnopqrstuvwxyz";
        int length = in.length();
        System.out.println(length);
        int a = 36 * 36 * 36;


        for (int i = 0; i < length; i++) {
            for (int i1 = 0; i1 < length; i1++) {
                for (int i2 = 0; i2 < length; i2++) {
                    // 字符串比较数字小于字母
                    String fileName = "D:\\密码字典\\he\\8位密码(数字+小写字母)" + in.charAt(i) + in.charAt(i1) + in.charAt(i2) + "-" + a + ".txt";

                    System.out.println(fileName);
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
                    for (int i3 = 0; i3 < length; i3++) {
                        for (int i4 = 0; i4 < length; i4++) {
                            for (int i5 = 0; i5 < length; i5++) {
                                for (int i6 = 0; i6 < length; i6++) {
                                    for (int i7 = 0; i7 < length; i7++) {
                                        String string = "" + in.charAt(i) + in.charAt(i1) + in.charAt(i2) + in.charAt(i3) + in.charAt(i4) + in.charAt(i5) + in.charAt(i6) + in.charAt(i7);
                                        bufferedWriter.write(string);
                                        bufferedWriter.newLine();
                                        bufferedWriter.flush();
                                    }
                                }

                            }
                        }

                    }
                    bufferedWriter.close();
                }
            }
        }


    }

}

