package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WORKSTATIONS")
public class Workstation {
    @Id
    @Column(name = "WORKSTATION_ID")
    private long id;

    @Column(name = "NAME")
    private String name;
    
    @OneToOne(mappedBy = "workstation")
    private Worker worker;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Workstation [id=" + id + ", name=" + name + ", worker=" + worker.getName() + "]";
    }
}
