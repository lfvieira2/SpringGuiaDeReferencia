package spring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpj(String cnpj);

}
