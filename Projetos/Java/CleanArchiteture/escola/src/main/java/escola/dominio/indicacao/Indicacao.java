package escola.indicacao;

import escola.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {
    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
    }
}
