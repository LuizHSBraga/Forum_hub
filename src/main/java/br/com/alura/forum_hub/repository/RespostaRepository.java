package br.com.alura.forum_hub.repository;

import br.com.alura.forum_hub.domain.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespostaRepository extends JpaRepository<Resposta, Long> {
}
