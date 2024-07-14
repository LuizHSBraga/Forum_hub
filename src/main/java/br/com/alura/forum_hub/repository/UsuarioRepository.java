package br.com.alura.forum_hub.repository;

import br.com.alura.forum_hub.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByEmail(String email);

    boolean existsByEmail(String email);
}
