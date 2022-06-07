package br.com.triersistemas.macc.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
public class FarmaceuticoModel {
    private String nome;
    private LocalDate aniver;
    private String cpf;
    private int id;
}
