package lidandoComExecoes03.github.modelo;

import lidandoComExecoes03.github.excecao.ErroConsultaGitHubException;

public class Usuario {
    private String nome;
    private String fotoPerfil;

    public Usuario(String nome, String fotoPerfil) {
        this.nome = nome;
        this.fotoPerfil = fotoPerfil;
    }

    public Usuario(UsuarioGit usuarioGit) {
        if (usuarioGit.login() == null) {
            throw new ErroConsultaGitHubException("Usuário não encontrado");
        }
        this.nome = usuarioGit.login();
        this.fotoPerfil = usuarioGit.avatar_url();
    }

    @Override
    public String toString() {
        return "Perfil: " + this.nome + this.fotoPerfil;
    }
}
