package com.diogovc.clients.repositories;

import com.diogovc.clients.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
