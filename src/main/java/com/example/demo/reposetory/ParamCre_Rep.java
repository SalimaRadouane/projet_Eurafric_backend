package com.example.demo.reposetory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.ParamCre;

public interface ParamCre_Rep extends JpaRepository<ParamCre, Long> {

	@Query("SELECT p FROM ParamCre p WHERE p.codeDomaine = :codeDomaine OR p.codeApplication = :codeApplication " +
		       "OR p.codeEvenement = :codeEvenement OR p.codeStructure = :codeStructure OR p.codeEmetteur= :codeEmetteur")
		List<ParamCre> findByCodes(@Param("codeDomaine") String codeDomaine, @Param("codeApplication") String codeApplication,
		                           @Param("codeEvenement") String codeEvenement, @Param("codeStructure") String codeStructure,
		                           @Param("codeEmetteur") String codeEmetteur);



}
