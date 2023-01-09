package ma.ensa.nationaltransfermicroservicetransfer.entities;

import javax.persistence.*;

import java.util.List;

@Entity
public class Client {
    @Id
    private long clientId;

    public Client() {
    }

    public Client(long clientId) {
        this.clientId = clientId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
}
