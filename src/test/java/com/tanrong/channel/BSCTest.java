package com.tanrong.channel;

import org.junit.Test;

public class BSCTest {
    @Test
    public void send() throws Exception {
        System.out.println("test1");
        int[] data=new int[]{1,0,1,1,1,0};
        int[] r= BSC.send(data,0.2);
        com.tanrong.channelCode.ChannelCodeUtilTest.println("send",r);
    }

    @Test
    public void test2() throws Exception {

        System.out.println("test2");
        int[] data=new int[]{1,0,1,1,1,0};
        int[] r= BSC.send2(data,0.2,0.1);
        com.tanrong.channelCode.ChannelCodeUtilTest.println("send",r);
    }
    @Test
    public void tes3() throws Exception {

        System.out.println("test3");
        int[] data=new int[]{1,0,1,1,1,0};
        int[] r= BSC.send2(data,0.2,0.3);
        com.tanrong.channelCode.ChannelCodeUtilTest.println("send",r);
    }

}