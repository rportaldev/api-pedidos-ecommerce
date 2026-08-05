package com.rportaldev.apipedidosecommerce.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.rportaldev.apipedidosecommerce.enums.EstadoPedido;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", 
				nullable = false)
	private Usuario usuario;
	
	@Column(name = "fecha_pedido",
			nullable = false)
	private LocalDateTime fecha;
	
	@Column(name = "total",
			nullable = false,
			precision = 10,
			scale = 2)
	private BigDecimal total;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "estado_pedido", 
			nullable = false)
	private EstadoPedido estado;
	
	@OneToMany(mappedBy = "pedido", 
			cascade = CascadeType.ALL, 
			orphanRemoval = true)
	private List<DetallePedido> detalles;
	
}
