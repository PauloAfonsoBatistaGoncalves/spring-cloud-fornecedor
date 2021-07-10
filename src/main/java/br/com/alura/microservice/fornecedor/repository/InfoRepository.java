package br.com.alura.microservice.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;

public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {

	InfoFornecedor findByEstado(String estado);
}
