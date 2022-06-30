package com.api.produtor.repositories;

import com.api.produtor.models.LaboratorioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratorioRepository extends JpaRepository<LaboratorioModel, Integer> {
}
