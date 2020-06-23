package com.tanrong.test;
import com.tanrong.channelCode.ChannelCodeUtil;
import junit.framework.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import static com.tanrong.test.ChannelCodeUtilTest.println;
import static org.junit.Assert.assertArrayEquals;

@RunWith(value=Suite.class)
@SuiteClasses(value={NewTest.class, TestNocode.class, TestHamming.class, mockTest.class})

public class AllTests {
}
