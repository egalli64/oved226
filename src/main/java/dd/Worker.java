package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WORKERS")
public class Worker {
    @Id
    @Column(name = "WORKER_ID")
    private long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "WORKSTATION_ID")
    private Workstation workstation;

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

    public Workstation getWorkstation() {
        return workstation;
    }

    public void setWorkstation(Workstation workstation) {
        this.workstation = workstation;
    }

    @Override
    public String toString() {
        return "Worker [id=" + id + ", name=" + name + ", workstation=" + workstation + "]";
    }
}
