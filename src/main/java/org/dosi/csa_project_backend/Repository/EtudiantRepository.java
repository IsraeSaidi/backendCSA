package org.dosi.csa_project_backend.Repository;

import org.dosi.csa_project_backend.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,String> {
}
