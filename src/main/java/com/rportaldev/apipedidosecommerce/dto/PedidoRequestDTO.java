package com.rportaldev.apipedidosecommerce.dto;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class PedidoRequestDTO {

	@NotEmpty(message = "El pedido debe tener al menos un producto")
	@Valid
	private List<ItemPedidoRequestDTO> items;
}
