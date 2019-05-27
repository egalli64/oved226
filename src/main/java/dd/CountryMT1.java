package dd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRIES")
public class CountryMT1 {
    @Id
    @Column(name = "COUNTRY_ID")
    private String id;

    @Column(name = "COUNTRY_NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "REGION_ID")
    private Region region;

    public CountryMT1() {
    }

    public CountryMT1(String id, String name, Region region) {
        this.id = id;
        this.name = name;
        this.region = region;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Region getRegion() {
        return region;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Country [id=" + id + ", name=" + name + ", region=" + region + "]";
    }
}
