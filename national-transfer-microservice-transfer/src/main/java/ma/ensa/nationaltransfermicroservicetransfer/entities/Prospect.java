package ma.ensa.nationaltransfermicroservicetransfer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prospect {
    @Id
    private Long id;

    public Prospect() {
    }

    public Prospect(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
