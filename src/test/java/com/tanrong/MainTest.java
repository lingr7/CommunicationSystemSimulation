package com.tanrong;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test1() throws Exception {
        String[] args=new String[]{"0.6","8","1","1","3","0.1","0.2"};
        Main.main(args);
    }
    @Test
    public void test2() throws Exception {
        String[] args=new String[]{"0.3","9","1","3","2","0.1","0.3"};
        Main.main(args);
    }
    @Test
    public void test3() throws Exception {
        String[] args=new String[]{"0.5","15","1","2","1","0.2","0.3"};
        Main.main(args);
    }
    @Test
    public void test4() throws Exception {
        String[] args=new String[]{"0.6","8","2","1","3","0.1","0.3"};
        Main.main(args);
    }
    @Test
    public void test5() throws Exception {
        String[] args=new String[]{"0.3","9","2","3","2","0.1","0.3"};
        Main.main(args);
    }
    @Test
    public void test6() throws Exception {
        String[] args=new String[]{"0.5","15","2","2","1","0.2","0.3"};
        Main.main(args);
    }

    @Test
    public void test7() throws Exception {
        String[] args=new String[]{"0.6","8","3","1","3","0.1","0.3"};
        Main.main(args);
    }
    @Test
    public void test8() throws Exception {
        String[] args=new String[]{"0.3","9","3","3","2","0.1","0.3"};
        Main.main(args);
    }
    @Test
    public void test9() throws Exception {
        String[] args=new String[]{"0.5","15","3","2","1","0.2","0.3"};
        Main.main(args);
    }

}