package DesignPattern.dao;

public class AddressBookWithDao {

    public static void main(String[] args) {
        Person p;
        PersonDao personDao = new PersonDaoImpl();

        System.out.println("--- Inserting...");
        p = new Person("Seonyoung Kim", "1 Hongji Dong");
        personDao.insert(p);
        p = new Person("Jangkwon Lee", "2 Hongji Dong");
        personDao.insert(p);

        System.out.println("--- Finding all...");
        for (Person person : personDao.findAll()) {
            System.out.println("Reading... " + person);
        }

        System.out.println("--- Updating...");
        p = personDao.findAll().get(0);
        p.setName("Sooyoung Lim");
        personDao.update(p.getId(), p);

        System.out.println("--- See if updated...");
        p = personDao.findById(1);
        if (p != null) {
            System.out.println(p);
        }

        System.out.println("--- Deleting...");
        personDao.delete(1);
        System.out.println("--- Finding all after deleting...");
        for (Person person : personDao.findAll()) {
            System.out.println("reading... " + person);
        }
    }
}
