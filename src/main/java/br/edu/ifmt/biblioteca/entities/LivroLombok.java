package br.edu.ifmt.biblioteca.entities;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
//@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder

// classe POJO
public class LivroLombok {

    private String id;

    @NotEmpty
    private String titulo;

    @NotEmpty
    private String autor;

    @NotEmpty
    private String editora;

    @NotEmpty
    private String tradutor;

    @NotEmpty
    private Integer anoEdicao;


    @NotEmpty
    private String formato;

    @NotEmpty
    private String encadernacao;

    @NotEmpty
    private String idioma;

    @NotEmpty
    private String pais;


    @NotEmpty
    private Integer numPaginas;

    @NotEmpty
    private Long comprimento;

    @NotEmpty
    private Long largura;

    @NotEmpty
    private Long peso;

}

