package ma.ensa.nationaltransfermicroservicetransfer.dao;

import ma.ensa.nationaltransfermicroservicetransfer.entities.Client;
import ma.ensa.nationaltransfermicroservicetransfer.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TransferDAO extends JpaRepository<Transfer, Long> {

    @Query("SELECT SUM(t.amount) FROM Transfer t WHERE t.senderClient = :sender AND t.transfer_date >= :starting")
    Double getTranferSumBySenderAndStartingDate(Client sender, Date starting);
}