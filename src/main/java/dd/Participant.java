package dd;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PARTICIPANTS")
public class Participant {
    @Id
    @Column(name = "PARTICIPANT_ID")
    private long id;

    @Column
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "PARTICIPANT_PROJECT", //
            joinColumns = @JoinColumn(name = "PARTICIPANT_ID"), //
            inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
    Set<Project> projects;

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

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Participant [id=" + id + ", name=" + name + "]";
    }
}
