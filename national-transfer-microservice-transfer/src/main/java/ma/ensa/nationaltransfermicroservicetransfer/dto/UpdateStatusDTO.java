package ma.ensa.nationaltransfermicroservicetransfer.dto;

import ma.ensa.nationaltransfermicroservicetransfer.enums.TransferStatus;

import java.io.Serializable;

public class UpdateStatusDTO implements Serializable {
    private Long id;
    private TransferStatus transferStatus;

    public UpdateStatusDTO(Long id, TransferStatus transferStatus) {
        this.id = id;
        this.transferStatus = transferStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransferStatus getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
    }
}
