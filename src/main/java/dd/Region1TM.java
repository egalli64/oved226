package dd;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "REGIONS")
public class Region1TM {
    @Id
    @Column(name = "REGION_ID")
    private long id;

    @Column(name = "REGION_NAME")
    private String name;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<CountryMT1> countries;

    public Region1TM() {
    }

    public Region1TM(long id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Region1TM [id=" + id + ", name=" + name + "]";
    }

    public Set<CountryMT1> getCountries() {
        return countries;
    }
}
