package example.di;

import javax.sql.DataSource;

public class MyDao {
    //в оригинале:  protected DataSource dataSource = null;
    private final DataSource dataSource;

    public MyDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    //data access methods...
    public Person readPerson(int primaryKey) {
        return null;
    }

    public void update(Person person) {
    }
}
