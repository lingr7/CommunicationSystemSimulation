package com.tanrong.test;
//啥叫接口？
public interface IPersonDao {
//基本懂了，下面是两个抽象的方法
    Person getPerson(int id);
    boolean update(Person person);
}
