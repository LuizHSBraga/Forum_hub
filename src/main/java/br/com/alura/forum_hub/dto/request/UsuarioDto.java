package br.com.alura.forum_hub.dto.request;

public record UsuarioDto(@NotBlank String nome,
                         @NotBlank @Email String email,
                         @NotBlank String senha) {
}
