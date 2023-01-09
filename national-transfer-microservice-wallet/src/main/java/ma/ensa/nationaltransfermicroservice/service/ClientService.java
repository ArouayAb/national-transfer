package ma.ensa.nationaltransfermicroservice.service;

import ma.ensa.nationaltransfermicroservice.Entity.Client;
import ma.ensa.nationaltransfermicroservice.Entity.User;
import ma.ensa.nationaltransfermicroservice.Entity.Wallet;
import ma.ensa.nationaltransfermicroservice.Repository.ClientRepository;
import ma.ensa.nationaltransfermicroservice.dto.CreateClientDto;
import ma.ensa.nationaltransfermicroservice.utility.GenerateWalletNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    @Autowired
    public void setClientRepository(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(CreateClientDto ccDto) {
        String generatedPassword = UUID.randomUUID().toString().replace("-","").substring(0, 10);

        // save Client to keycloak before saving on db

        User user = new User(ccDto.getEmail(), null); // password not saved in db, only keycloak

        Wallet wallet = new Wallet(
                GenerateWalletNumber.generateWalletNumber(),
                0.00f,
                5000.00f,
                4000.00f,
                LocalDateTime.now()
        );

        Client client = new Client(ccDto.getId(), user, wallet);

        return this.clientRepository.save(client);
    }

    public Optional<Client> findClientById(String id) {
        return this.clientRepository.findById(id);
    }

    public Float findWalletBalanceById(Long id) {
        return this.clientRepository.findWalletBalanceById(id);
    }
}
