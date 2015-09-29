package demo.Model;

import javax.persistence.*;

/**
 * Created by nilpanescoll on 25/9/15.
 */
@Entity
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;


    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
