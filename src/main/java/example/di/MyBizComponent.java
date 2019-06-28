package example.di;

public class MyBizComponent {

    private final MyDao dao;

    public MyBizComponent(MyDao dao){
        this.dao = dao;
    }

    public void changePersonStatus(Person person, String status){
        Person personNew = dao.readPerson(person.getId());
        personNew.setStatus(status);
        dao.update(person);
    }
}
