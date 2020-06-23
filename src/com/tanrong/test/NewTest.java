package com.tanrong.test;
import com.tanrong.Main;
import org.junit.Test;
import static org.junit.Assert.*;
import com.tanrong.channelCode.ChannelCodeUtil;
import junit.framework.*;
import static com.tanrong.test.ChannelCodeUtilTest.println;

public class NewTest {
    @Test
    public void repEncode() throws Exception {
        //选择三次重复编码，每一个比特经过信道传输要重复自身三次
        int type=2;
        int[] data=new int[]{1,0,1,0,1};
        int[] encode=ChannelCodeUtil.encode(type,data);
        int[] expected = new int[]{1,1,1,0,0,0,1,1,1,0,0,0,1,1,1};
//        int[] r=new int[list.size()];
        println("encode",encode);
        assertArrayEquals(encode,expected);
    }


}
