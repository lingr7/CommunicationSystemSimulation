package com.tanrong.channelCode;

import org.junit.Test;

import static com.tanrong.channelCode.ChannelCodeUtilTest.println;
import static org.junit.Assert.*;
import com.tanrong.channelCode.ChannelCodeUtil;


import static org.junit.Assert.assertArrayEquals;

import com.tanrong.Main;

import junit.framework.*;
public class TestHamming {
    @Test
    public void Hammingcode() throws Exception {
        //无编码
        int type=3;
        int[] data=new int[]{1,0,1,0};
        int[] encode= ChannelCodeUtil.encode(type,data);
        int[] expected = new int[]{1,0,1,1,0,1,0};
//        int[] r=new int[list.size()];
        println("encode",encode);
        assertArrayEquals(encode,expected);
    }

}