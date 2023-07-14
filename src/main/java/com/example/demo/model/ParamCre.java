package com.example.demo.model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "param_cre")
public class ParamCre {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="SEQUENCE1", allocationSize=1)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(length = 5)
    private String codeDomaine;

    @Column(length = 5)
    private String codeApplication;

    @Column(length = 15, unique = true)
    private String codeEvenement;

    @Column(length = 19)
    private String codeStructure;

    @Column(length = 6)
    private String codeEmetteur;

    @Column(length = 3)
    private String aEnrichir;

    @Column(length = 1)
    private String aComptabiliser;

    @Column(length = 8)
    private Date dateMiseProd;

    @Column(length = 2)
    private String etatInitial;

    @Column(length = 1)
    private String topAggraCdc;

    @Column(length = 2)
    private String valAggraCdc;

    @Column(length = 8)
    private Date dateMajAggraCdc;

    @Column(length = 1)
    private String topAggraCtx;

    @Column(length = 2)
    private String valAggraCtx;

    @Column(length = 8)
    private Date dateMajAggraCtx;

    @Column(length = 3)
    private String rib;

  

	@Column(length = 8)
    private Date dateDerPassage;

    @Column(length = 9)
    private String ligneValide;

    @Column(length = 9)
    private String ligneRejete;

    @Column(length = 9)
    private String compteurEven;

    @Column(length = 1)
    private String topAggraPrec;

    @Column(length = 2)
    private String valAggraPrec;

    @Column(length = 8)
    private Date dateMajAggraPrec;

    @Column(length = 1)
    private String TopDesac="N";

    @Column(length = 8)
    private LocalDate DateDesac=null;
	public ParamCre() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public ParamCre(String codeDomaine, String codeApplication, String codeEvenement, String codeStructure,
			String codeEmetteur, String aEnrichir, String aComptabiliser, Date dateMiseProd, String etatInitial,
			String topAggraCdc, String valAggraCdc, Date dateMajAggraCdc, String topAggraCtx, String valAggraCtx,
			Date dateMajAggraCtx, String rib, Date dateDerPassage, String ligneValide, String ligneRejete,
			String compteurEven, String topAggraPrec, String valAggraPrec, Date dateMajAggraPrec, String topDesac,
			Date dateDesac) {
		super();
		this.codeDomaine = codeDomaine;
		this.codeApplication = codeApplication;
		this.codeEvenement = codeEvenement;
		this.codeStructure = codeStructure;
		this.codeEmetteur = codeEmetteur;
		this.aEnrichir = aEnrichir;
		this.aComptabiliser = aComptabiliser;
		this.dateMiseProd = dateMiseProd;
		this.etatInitial = etatInitial;
		this.topAggraCdc = topAggraCdc;
		this.valAggraCdc = valAggraCdc;
		this.dateMajAggraCdc = dateMajAggraCdc;
		this.topAggraCtx = topAggraCtx;
		this.valAggraCtx = valAggraCtx;
		this.dateMajAggraCtx = dateMajAggraCtx;
		this.rib = rib;
		this.dateDerPassage = dateDerPassage;
		this.ligneValide = ligneValide;
		this.ligneRejete = ligneRejete;
		this.compteurEven = compteurEven;
		this.topAggraPrec = topAggraPrec;
		this.valAggraPrec = valAggraPrec;
		this.dateMajAggraPrec = dateMajAggraPrec;
		this.TopDesac = "N";
		DateDesac = null;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	  public Date getDateMiseProd() {
			return dateMiseProd;
		}


		public void setDateMiseProd(Date dateMiseProd) {
			this.dateMiseProd = dateMiseProd;
		}


		public Date getDateMajAggraCdc() {
			return dateMajAggraCdc;
		}


		public void setDateMajAggraCdc(Date dateMajAggraCdc) {
			this.dateMajAggraCdc = dateMajAggraCdc;
		}


		public Date getDateMajAggraCtx() {
			return dateMajAggraCtx;
		}


		public void setDateMajAggraCtx(Date dateMajAggraCtx) {
			this.dateMajAggraCtx = dateMajAggraCtx;
		}


		public Date getDateDerPassage() {
			return dateDerPassage;
		}


		public void setDateDerPassage(Date dateDerPassage) {
			this.dateDerPassage = dateDerPassage;
		}


		public Date getDateMajAggraPrec() {
			return dateMajAggraPrec;
		}


		public void setDateMajAggraPrec(Date dateMajAggraPrec) {
			this.dateMajAggraPrec = dateMajAggraPrec;
		}


		public LocalDate getDateDesac() {
			return DateDesac;
		}


		public void setDateDesac(LocalDate localDate) {
			DateDesac = localDate;
		}


		public void setLigneValide(String ligneValide) {
			this.ligneValide = ligneValide;
		}


		public void setLigneRejete(String ligneRejete) {
			this.ligneRejete = ligneRejete;
		}


		public void setCompteurEven(String compteurEven) {
			this.compteurEven = compteurEven;
		}


	public String getCodeDomaine() {
		return codeDomaine;
	}

	public void setCodeDomaine(String codeDomaine) {
		this.codeDomaine = codeDomaine;
	}

	public String getCodeApplication() {
		return codeApplication;
	}

	public void setCodeApplication(String codeApplication) {
		this.codeApplication = codeApplication;
	}

	public String getCodeEvenement() {
		return codeEvenement;
	}

	public void setCodeEvenement(String codeEvenement) {
		this.codeEvenement = codeEvenement;
	}

	public String getCodeStructure() {
		return codeStructure;
	}

	public void setCodeStructure(String codeStructure) {
		this.codeStructure = codeStructure;
	}

	public String getCodeEmetteur() {
		return codeEmetteur;
	}

	public void setCodeEmetteur(String codeEmetteur) {
		this.codeEmetteur = codeEmetteur;
	}

	public String getaEnrichir() {
		return aEnrichir;
	}

	public void setaEnrichir(String aEnrichir) {
		this.aEnrichir = aEnrichir;
	}

	public String getaComptabiliser() {
		return aComptabiliser;
	}

	public void setaComptabiliser(String aComptabiliser) {
		this.aComptabiliser = aComptabiliser;
	}



	public String getEtatInitial() {
		return etatInitial;
	}

	public void setEtatInitial(String etatInitial) {
		this.etatInitial = etatInitial;
	}

	public String getTopAggraCdc() {
		return topAggraCdc;
	}

	public void setTopAggraCdc(String topAggraCdc) {
		this.topAggraCdc = topAggraCdc;
	}

	public String getValAggraCdc() {
		return valAggraCdc;
	}

	public void setValAggraCdc(String valAggraCdc) {
		this.valAggraCdc = valAggraCdc;
	}



	public String getTopDesac() {
		return TopDesac;
	}

	public void setTopDesac(String topDesac) {
		TopDesac = topDesac;
	}


	

	public String getTopAggraCtx() {
		return topAggraCtx;
	}

	public void setTopAggraCtx(String topAggraCtx) {
		this.topAggraCtx = topAggraCtx;
	}

	public String getValAggraCtx() {
		return valAggraCtx;
	}

	public void setValAggraCtx(String valAggraCtx) {
		this.valAggraCtx = valAggraCtx;
	}



	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}


	

	public String getLigneValide() {
		return ligneValide;
	}


	public String getLigneRejete() {
		return ligneRejete;
	}

	

	public String getCompteurEven() {
		return compteurEven;
	}


	public String getTopAggraPrec() {
		return topAggraPrec;
	}

	public void setTopAggraPrec(String topAggraPrec) {
		this.topAggraPrec = topAggraPrec;
	}

	public String getValAggraPrec() {
		return valAggraPrec;
	}

	public void setValAggraPrec(String valAggraPrec) {
		this.valAggraPrec = valAggraPrec;
	}

	

	private String getCurrentDate() {
	    LocalDateTime currentDateTime = LocalDateTime.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    return currentDateTime.format(formatter);
	}

}
