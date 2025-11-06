package br.com.raoni.composicao;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable //ele vai ser colocado dentro da tabela de fornecedor e usuario
public class endereco {

    //marcado como embedabble ele pega os atributos dentro de endereço e joga dentro da tabela fornecedor e funcionario

    private String logradouro;
    private String complemento;

    //serve pra compartilhar atributos em comuns entre as tabelas

}
