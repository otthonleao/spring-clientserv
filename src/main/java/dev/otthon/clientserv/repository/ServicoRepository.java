package dev.otthon.clientserv.repository;

import dev.otthon.clientserv.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
