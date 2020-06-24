package com.tanrong.test;
import com.tanrong.Main;
import org.junit.Test;
import static org.junit.Assert.*;
import com.tanrong.channelCode.ChannelCodeUtil;
import junit.framework.*;
import static com.tanrong.test.ChannelCodeUtilTest.println;
public class TestNocode {
    @Test
    public void noEncode() throws Exception {
        //无编码
        int type=1;
        int[] data=new int[]{1,0,1,0,1};
        int[] encode=ChannelCodeUtil.encode(type,data);
        int[] expected = new int[]{1,0,1,0,1};
//        int[] r=new int[list.size()];
        println("encode",encode);
        assertArrayEquals(encode,expected);
    }

}
