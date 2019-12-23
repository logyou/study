package nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author lyh
 * @date 2019/10/24 0024
 **/
public class CopyFile {

    public static void fastCopy(String src, String dist) throws IOException {
        /* 获得源文件的输入字节流 */
        FileInputStream fin = new FileInputStream(src);
        /* 获取输入字节流的文件通道 */
        FileChannel fcin = fin.getChannel();
        /* 获取目标文件的输出字节流 */
        FileOutputStream fout = new FileOutputStream(dist);
        /* 获取输出字节流的文件通道 */
        FileChannel fcout = fout.getChannel();
        /* 为缓冲区分配 1024 个字节 */
        ByteBuffer buffer = ByteBuffer.allocateDirect(100);
        /* 从输入通道中读取数据到缓冲区中 */
        while (fcin.read(buffer) != -1) {
            System.out.println("read..." + buffer.position());
            /* 切换读写 */
            buffer.flip();
            /* 把缓冲区的内容写入输出文件中 */
            fcout.write(buffer);
            /* 清空缓冲区 */
            buffer.clear();
        }
        fcout.close();
        fin.close();
        fout.close();
        fin.close();
    }
}
