package javase.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;

/**
 * Created by zhao on 2017/9/8.
 * 使用Apache的commons-io包进行文件操作
 */
public class ApacheCommonIOApi {

    /**
     * 读取每行数据   适用于读取大文件
     * @param filePath
     * @throws IOException
     */
    public void readLineForBigFile(File filePath) throws IOException {
        LineIterator it = FileUtils.lineIterator(filePath, "UTF-8");
        while (it.hasNext()) {
            String line = it.nextLine();
            // do something with line
            System.out.println(line);
        }
        LineIterator.closeQuietly(it);
    }
}
