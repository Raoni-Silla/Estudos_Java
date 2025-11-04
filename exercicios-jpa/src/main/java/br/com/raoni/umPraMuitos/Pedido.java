package br.com.raoni.umPraMuitos;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime data;

    @OneToMany(mappedBy = "pedido") //segundo atributo na parte bidirecional, usa o maped pra dizer onde ta o atributo que esta ligado
    private List<ItemPedido> itens;

    public Pedido() {
        setData(data);
    }

    public void setData(LocalDateTime data) {
        this.data = LocalDateTime.now();

    }
}
