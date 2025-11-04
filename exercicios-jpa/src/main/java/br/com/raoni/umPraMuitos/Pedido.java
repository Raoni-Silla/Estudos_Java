package br.com.raoni.umPraMuitos;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime data;



    public Pedido() {
        setData(data);
    }

    public void setData(LocalDateTime data) {
        this.data = LocalDateTime.now();

    }
}
