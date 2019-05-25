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
@Table(name = "PROJECTS")
public class Project {
    @Id
    @Column(name = "PROJECT_ID")
    private long id;

    @Column
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "PARTICIPANT_PROJECT", //
            joinColumns = @JoinColumn(name = "PROJECT_ID"), //
            inverseJoinColumns = @JoinColumn(name = "PARTICIPANT_ID"))
    Set<Participant> participants;

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

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Project [id=" + id + ", name=" + name + "]";
    }
}
