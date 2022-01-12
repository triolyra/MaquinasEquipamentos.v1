package br.com.itau.maquinas_equipamentos.port.repository;
import br.com.itau.maquinas_equipamentos.domain.model.Bem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.itau.maquinas_equipamentos.adapter.datastore.repository.impl.BemRepositoryImpl;

@Repository
public interface BemRepository extends JpaRepository<Bem, Long> {

}