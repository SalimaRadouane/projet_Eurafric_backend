package com.example.demo.service;
import java.io.BufferedReader;

import java.util.List;
import java.util.Optional;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.time.LocalDate;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exeption.ResourceNotFoundException;
import com.example.demo.model.ParamCre;
import com.example.demo.reposetory.ParamCre_Rep;
@Service
@Transactional

public class ParamCreService {
	   private final ParamCre_Rep PR;

	    @Autowired
	    public ParamCreService(ParamCre_Rep param_rep) {
	        this.PR = param_rep;
	    }

	    public ParamCre addParamCre(ParamCre paramcre) {
	        return PR.save(paramcre);
	    }

	    public List<ParamCre> getAllParamCres() {
	        return PR.findAll();
	    }

	    public ParamCre updateParamCre(ParamCre paramcre) {
	        Long id = paramcre.getId();

	        if (id != null) {
	            ParamCre existingParamCre = PR.findById(id).orElse(null);
	            
	            if (existingParamCre != null) {
	                // Ignore updates to the read-only fields
	                paramcre.setDateDerPassage(existingParamCre.getDateDerPassage());
	                paramcre.setLigneValide(existingParamCre.getLigneValide());
	                paramcre.setLigneRejete(existingParamCre.getLigneRejete());
	                paramcre.setCompteurEven(existingParamCre.getCompteurEven());
	                
	                return PR.save(paramcre);
	            }
	        }
	        
	        return null; 
	    }
	    public List<ParamCre> getParamCreBycodes(String codeDomaine,String codeApplication,String codeEvenement
	    		,String codeStructure,String codeEmetteur) {
	        return PR.findByCodes(codeDomaine, codeApplication, codeEvenement, codeStructure, codeEmetteur);
	    }

	    public Optional<ParamCre> getParamCreById(Long id) {
	        return PR.findById(id);
	    }
	    public void desactiver(Long id) {
	        ParamCre paramCre = PR.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("ParamCre not found with id: " + id));

	        paramCre.setTopDesac("O");
	        paramCre.setDateDesac(LocalDate.now());

	        PR.save(paramCre);
	    }

	    public void activer(Long id) {
	        ParamCre paramCre = PR.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("ParamCre not found with id: " + id));

	        paramCre.setTopDesac("N");
	        paramCre.setDateDesac(null);

	        PR.save(paramCre);
	    }
	   
}
