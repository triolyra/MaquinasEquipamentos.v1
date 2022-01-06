package br.com.itau.maquinas_equipamentos.adapter.datastore.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.BemEntity;

public interface BemJpaRepository extends JpaRepository<BemEntity, String>{

	String findByIdBem(BemEntity idBem);
}
