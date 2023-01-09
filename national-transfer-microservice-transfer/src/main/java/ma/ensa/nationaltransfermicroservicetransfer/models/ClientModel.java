package ma.ensa.nationaltransfermicroservicetransfer.models;

public class ClientModel {
    private Long id;
    private Wallet wallet;

    public ClientModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
