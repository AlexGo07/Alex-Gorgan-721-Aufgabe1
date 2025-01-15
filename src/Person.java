import java.sql.Date;

public class Person {
    Integer id;
    String name;
    Haus haus;
    String erreignis;
    Date date;

    public Person(Integer id, String name, Haus haus, String erreignis, Date date) {
        this.id = id;
        this.name = name;
        this.haus = haus;
        this.erreignis = erreignis;
        this.date = date;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Haus getHaus() {
        return haus;
    }
    public void setHaus(Haus haus) {
        this.haus = haus;
    }
    public String getErreignis() {
        return erreignis;
    }
    public void setErreignis(String erreignis) {
        this.erreignis = erreignis;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

}
