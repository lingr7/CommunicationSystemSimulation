package com.tanrong.test;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import java.util.List;

/**
 * PersonService Tester.
 *
 * @author <Authors name>
 * @since <pre>06/22/2020</pre>
 * @version 1.0
 */
public class PersonServiceTest {
    //表明要用到的依赖
    private IPersonDao mockDao;
    private PersonService personService;

    @Before
    public void before() throws Exception {
//      如果这里的接口是真的桩子
        mockDao = mock(IPersonDao.class);
//      如果getPerson(1)被调用过，那么就返回一个Person对象
//
        when(mockDao.getPerson(2)).thenReturn(new Person(2,"mst"));
//      如果isA被调用过，那么返回True
        when(mockDao.update(isA(Person.class))).thenReturn(true);
//      return的东西没有用上
        personService = new PersonService(mockDao);
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: update(int id, String name)
     *
     */
    @Test
    public void testUpdate() throws Exception {
        boolean result = personService.update(2,"md");
// personService要调用update 方法的话，就需要一个接口，这个接口是个桩子，没有Person类？当经过那个接口的时候，就会记录下来操作的结果是什么样？
//        assertTrue(result);
//懂了的感觉。
//        new per_ret
//        /* 验证返回结果 */
//        String ret = (String)list.get(0);
//        Assert.assertEquals(ret, "111");

        //验证是否执行过一次getPerson(1) 很抽象，到底执行过还是没有执行过呢，这个接口到底有没有update方法实现 ,mockDao的方法，调用过几次，怎么调用的。
        verify(mockDao,times(1)).getPerson(eq(2));
        //验证是否执行过一次update
        verify(mockDao,times(1)).update(isA(Person.class));
    }

//    @Test
//    public void testUpdateNotFind() throws Exception {
//        boolean result = personService.update(2, "md");
//
//        assertFalse( result);
//
//        //验证是否执行过一次getPerson(1)
//        verify(mockDao, times(1)).getPerson(eq(1));
//        //验证是否执行过一次update
//        verify(mockDao, never()).update(isA(Person.class));
//    }


//    @Mock
//    List list;
//
//    public PersonServiceTest(){
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testList(){
//        when(list.add(isA(Object.class))).thenReturn(true);
//        list.add(2);
//        list.add(5);
//        boolean re = list.add(1);
//        assertTrue(re);
//    }

}