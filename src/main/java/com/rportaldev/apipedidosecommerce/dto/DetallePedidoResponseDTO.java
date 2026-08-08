package com.rportaldev.apipedidosecommerce.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class DetallePedidoResponseDTO {

	private Long productoId;
	private String nombreProducto;
	private Integer cantidad;
	private BigDecimal subtotal;
}
