package com.tanrong.test;
//import com.tanrong.channelCode.ChannelCodeUtil;
import com.tanrong.sourceCode.shannonFano.Sign;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import java.util.List;
public class mockTest {
    //表明要用到的依赖
    private Sign mockDao;
    @Before
    public void before() throws Exception {
        mockDao = mock(Sign.class);
        when(mockDao.GetSign()).thenReturn("5");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: update(int id, String name)
     */
    @Test
    public void testUpdate() throws Exception {
        String encoded = mockDao.GetSign();
        String expected = "5";
        assertEquals(encoded,expected);
    }
}
