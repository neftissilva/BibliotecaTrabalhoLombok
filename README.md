
---

# Projeto Final - Desenvolvimento de Software Através de Frameworks @ IFMT/2023

- **Biblioteca/Framework:** [Lombok](https://projectlombok.org/)
- **Tecnologias aplicadas:** Java
- **Integrantes:**
  - Marcelo Barcelar Ricardo
  - Marcos Roberto de Avila
  - [Néftis Caroline Araujo da Silva](https://github.com/neftissilva)
  - [Wellington de Carvalho Batista](https://github.com/w3ll1ngt0n)

## 1. Descrição da biblioteca/framework

[Lombok](https://projectlombok.org/) é uma biblioteca para Java que fornece anotações e funcionalidades visando a redução de códigos _boilerplate_ (código repetitivo) em projetos Java, tornando o desenvolvimento mais dinâmico,

**Objetivos** do Lombok: <br>
![Lombok-Objetivos](https://github.com/neftissilva/BibliotecaTrabalhoLombok/assets/61604244/316b2ba0-bbba-4754-a0d3-f43f143ca004)


## 2. Descrição do problema

Elabore uma situação hipotética que pode ser resolvida com a aplicação desta biblioteca/framework. Fique à vontade para utilizar recursos como diagramas, fotos, vídeos, etc.

Java é uma linguagem bastante verbosa, isso acontece por diferentes motivos, mas um dos principais motivos é a existência de código _boilerplate_.

_Boilerplate_ se refere a seções de código que devem ser incluídas em muitos lugares com pouca ou nenhuma alteração. No desenvolvimento de aplicações Java é um padrão conhecida como POJO (Plain Old Java Object).

Exemplos: 

![LOMBOK-removebg-preview](https://github.com/neftissilva/BibliotecaTrabalhoLombok/assets/61604244/af91c361-7e28-4fc5-945b-bc742f549bca)

--

Para apresentar o uso da Lombok em um caso hipotético, utilizaremos como exemplo o projeto [Biblioteca IFMT](https://github.com/adrianoneres/biblioteca-ifmt) utilizado na disciplina de `Desenvolvimento de Software através de Frameworks` pelo Professor [Adriano Neres Araújo de Souza](https://github.com/adrianoneres) no curso de `Pós Graduação Lato Sensu em Engenharia DevOps`.

- A seguir temos os códigos da Entidade Livro.java no qual utilizamos: `Get()`; `Set()`; `toString()`; `equals()`; `hasCode()`; e `Class`

#### [:page_facing_up: | ../entities/Livro.java](https://github.com/neftissilva/BibliotecaTrabalhoLombok/blob/master/src/main/java/br/edu/ifmt/biblioteca/entities/Livro.java)
```
package br.edu.ifmt.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.validation.constraints.NotEmpty;

import java.util.Objects;
import java.util.UUID;

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

```

## 3. Solução

- Agora temos a utilização do Lombok com a utilização de: `@Getter`; `@Setter`; `@AllArgsConstructor`; `@EqualsAndHashCode`; `@ToString`; e `@Builder`

- Verifiquem a redução de linhas de códigos comparado ao código JAVA anterior.

#### [:page_facing_up: | ../entities/Livro.java (utilizando Lombok)](https://github.com/neftissilva/BibliotecaTrabalhoLombok/blob/master/src/main/java/br/edu/ifmt/biblioteca/entities/LivroLombok.java)

```
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

```

--

- A seguir temos um vídeo apresentando os códigos em Java e utilizando Lombok, forma comparativa realizada e validado no Intellij:

https://github.com/neftissilva/BibliotecaTrabalhoLombok/assets/61604244/58383fd0-fa09-451d-9b71-b5081ceef8ff


## 4. Referências

- https://projectlombok.org/ <br>
- https://imasters.com.br/back-end/projeto-lombok-escrevendo-menos-codigo-em-java <br>
- https://medium.com/collabcode/projeto-lombok-escrevendo-menos-c%C3%B3digo-em-java-8fc87b379209 <br>
- https://www.treinaweb.com.br/blog/projeto-lombok-acelerando-o-desenvolvimento-java <br>
- https://medium.com/dev-cave/reduzindo-c%C3%B3digo-com-projeto-lombok-utilizando-intellij-a7711c2212bb <br>
- https://receitasdecodigo.com.br/java/como-usar-o-lombok-em-projetos-java <br>
- https://blog.cvinicius.com.br/2017/03/melhorando-qualidade-do-codigo-com.html <br>
