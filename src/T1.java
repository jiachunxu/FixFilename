import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author adminjia
 */
public class T1 {
    public static void main(String[] args) throws IOException {
        long num = 0;


        for (int i = 0; i < 10; i++) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\密码字典\\11位数密码_" + i + "开头.txt"));
            for (int i1 = 0; i1 < 10; i1++) {
                for (int i2 = 0; i2 < 10; i2++) {
                    for (int i3 = 0; i3 < 10; i3++) {
                        for (int i4 = 0; i4 < 10; i4++) {
                            for (int i5 = 0; i5 < 10; i5++) {
                                for (int i6 = 0; i6 < 10; i6++) {
                                    for (int i7 = 0; i7 < 10; i7++) {
                                        for (int i8 = 0; i8 < 10; i8++) {
                                            for (int i9 = 0; i9 < 10; i9++) {
                                                for (int i10 = 0; i10 < 10; i10++) {
                                                    String target = "" + i + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10;
                                                    bufferedWriter.write(target);
                                                    bufferedWriter.newLine();
                                                    System.out.print(++num + "\r");
                                                }

                                            }

                                        }
                                    }


                                }

                            }
                        }
                        bufferedWriter.flush();
                    }
                }
            }
            bufferedWriter.close();
        }


    }
}
