package br.gov.sp.fatec.domain.entity;

import br.gov.sp.fatec.domain.enums.AluguelStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Aluguel {

    @Id
    @GeneratedValue
    private Long id;
    private Date dataInicio;
    private Date dataFim;
    private double valor;

    @Enumerated(value = EnumType.STRING)
    private AluguelStatus status;

    @ManyToOne
    private Carro carro;

    @ManyToOne
    private Cliente cliente;
}
