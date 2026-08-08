package com.rportaldev.apipedidosecommerce.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class PedidoResponseDTO {

	private Long id;
	private String correoUsuario;
	private LocalDateTime fecha;
	private BigDecimal total;
	private String estado;
	private List<DetallePedidoResponseDTO> detalles;
}
