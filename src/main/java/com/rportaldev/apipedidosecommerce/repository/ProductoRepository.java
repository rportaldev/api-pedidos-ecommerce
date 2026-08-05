package com.rportaldev.apipedidosecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rportaldev.apipedidosecommerce.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

	
}
