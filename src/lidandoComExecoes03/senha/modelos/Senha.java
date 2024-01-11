package lidandoComExecoes03.senha.modelos;

import lidandoComExecoes03.senha.excecoes.SenhaInvalidaException;

public class Senha {
    private String senha;

    public Senha(String senha){
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("Senha inválida. Sua lidandoComExecoes03.senha deve ter 8 digitos ou mais.");
        }
        this.senha = senha;
    }
}
