package com.rportaldev.apipedidosecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rportaldev.apipedidosecommerce.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByUsuarioCorreo(String correo);
	boolean existsByUsuarioId(Long usuarioId);
}
