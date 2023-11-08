package br.edu.ifmt.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Objects;
import java.util.UUID;
/*@Getter
@Setter
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
*/
// classe POJO
@Builder
public class Livro {

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

    public Livro(String id, String titulo, String autor, String editora, String tradutor, Integer anoEdicao,
                 String formato, String encadernacao, String idioma, String pais, Integer numPaginas, Long comprimento,
                 Long largura, Long peso) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.tradutor = tradutor;
        this.anoEdicao = anoEdicao;
        this.formato = formato;
        this.encadernacao = encadernacao;
        this.idioma = idioma;
        this.pais = pais;
        this.numPaginas = numPaginas;
        this.comprimento = comprimento;
        this.largura = largura;
        this.peso = peso;
    }

    public Livro() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public Integer getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(Integer anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getEncadernacao() {
        return encadernacao;
    }

    public void setEncadernacao(String encadernacao) {
        this.encadernacao = encadernacao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Long getComprimento() {
        return comprimento;
    }

    public void setComprimento(Long comprimento) {
        this.comprimento = comprimento;
    }

    public Long getLargura() {
        return largura;
    }

    public void setLargura(Long largura) {
        this.largura = largura;
    }

    public Long getPeso() {
        return peso;
    }

    public void setPeso(Long peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", tradutor='" + tradutor + '\'' +
                ", anoEdicao=" + anoEdicao +
                ", formato='" + formato + '\'' +
                ", encadernacao='" + encadernacao + '\'' +
                ", idioma='" + idioma + '\'' +
                ", pais='" + pais + '\'' +
                ", numPaginas=" + numPaginas +
                ", comprimento=" + comprimento +
                ", largura=" + largura +
                ", peso=" + peso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

