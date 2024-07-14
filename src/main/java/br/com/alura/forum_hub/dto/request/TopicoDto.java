package br.com.alura.forum_hub.dto.request;

public record TopicoDto(@NotBlank String titulo,
                        @NotBlank String mensagem,
                        UsuarioIdDto autor,
                        CursoIdDto curso) {
}
