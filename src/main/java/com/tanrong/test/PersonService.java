package com.tanrong.test;

public class PersonService {
    private final IPersonDao personDao;

    public PersonService(IPersonDao personDao) {
        this.personDao = personDao;
    }

    public boolean update(int id, String name) {
        Person person = personDao.getPerson(id);
        if (person == null) {
            return false;
        }
        Person personUpdate = new Person(person.getId(), name);
//        接口的用法，怎么像是重复定义了。我内部拥有一个接口。说白了就是抽象方法有的还没有被实现。
        return personDao.update(personUpdate);
    }
}
