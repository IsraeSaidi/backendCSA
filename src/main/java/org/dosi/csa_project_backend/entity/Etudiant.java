package org.dosi.csa_project_backend.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Etudiant {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NO_ETUDIANT_NAT")
    private String noEtudiantNat;
    @Basic
    @Column(name = "ANNEE_PRO")
    private String anneePro;
    @Basic
    @Column(name = "CODE_COM")
    private String codeCom;
    @Basic
    @Column(name = "NO_ETUDIANT_UBO")
    private String noEtudiantUbo;
    @Basic
    @Column(name = "SEXE")
    private String sexe;
    @Basic
    @Column(name = "NOM")
    private String nom;
    @Basic
    @Column(name = "PRENOM")
    private String prenom;
    @Basic
    @Column(name = "DATE_NAISSANCE")
    private Date dateNaissance;
    @Basic
    @Column(name = "LIEU_NAISSANCE")
    private String lieuNaissance;
    @Basic
    @Column(name = "SITUATION")
    private String situation;
    @Basic
    @Column(name = "NATIONALITE")
    private String nationalite;
    @Basic
    @Column(name = "TEL_PORT")
    private String telPort;
    @Basic
    @Column(name = "TEL_FIXE")
    private String telFixe;
    @Basic
    @Column(name = "EMAIL")
    private String email;
    @Basic
    @Column(name = "ACTU_ADRESSE")
    private String actuAdresse;
    @Basic
    @Column(name = "ACTU_CP")
    private String actuCp;
    @Basic
    @Column(name = "ACTU_VILLE")
    private String actuVille;
    @Basic
    @Column(name = "ACTU_PAYS")
    private String actuPays;
    @Basic
    @Column(name = "PERM_ADRESSE")
    private String permAdresse;
    @Basic
    @Column(name = "PERM_CP")
    private String permCp;
    @Basic
    @Column(name = "PERM_VILLE")
    private String permVille;
    @Basic
    @Column(name = "PERM_PAYS")
    private String permPays;
    @Basic
    @Column(name = "DERNIER_DIPLOME")
    private String dernierDiplome;
    @Basic
    @Column(name = "UNIVERSITE")
    private String universite;
    @Basic
    @Column(name = "SIGLE_ETU")
    private String sigleEtu;
    @Basic
    @Column(name = "COMPTE_CRI")
    private String compteCri;
    @Basic
    @Column(name = "UBO_EMAIL")
    private String uboEmail;
    @Basic
    @Column(name = "GRPE_ANGLAIS")
    private Byte grpeAnglais;
    @Basic
    @Column(name = "ABANDON_MOTIF")
    private String abandonMotif;
    @Basic
    @Column(name = "ABANDON_DATE")
    private Date abandonDate;
    @Basic
    @Column(name = "EST_DIPLOME")
    private String estDiplome;

    public String getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public String getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(String anneePro) {
        this.anneePro = anneePro;
    }

    public String getCodeCom() {
        return codeCom;
    }

    public void setCodeCom(String codeCom) {
        this.codeCom = codeCom;
    }

    public String getNoEtudiantUbo() {
        return noEtudiantUbo;
    }

    public void setNoEtudiantUbo(String noEtudiantUbo) {
        this.noEtudiantUbo = noEtudiantUbo;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActuAdresse() {
        return actuAdresse;
    }

    public void setActuAdresse(String actuAdresse) {
        this.actuAdresse = actuAdresse;
    }

    public String getActuCp() {
        return actuCp;
    }

    public void setActuCp(String actuCp) {
        this.actuCp = actuCp;
    }

    public String getActuVille() {
        return actuVille;
    }

    public void setActuVille(String actuVille) {
        this.actuVille = actuVille;
    }

    public String getActuPays() {
        return actuPays;
    }

    public void setActuPays(String actuPays) {
        this.actuPays = actuPays;
    }

    public String getPermAdresse() {
        return permAdresse;
    }

    public void setPermAdresse(String permAdresse) {
        this.permAdresse = permAdresse;
    }

    public String getPermCp() {
        return permCp;
    }

    public void setPermCp(String permCp) {
        this.permCp = permCp;
    }

    public String getPermVille() {
        return permVille;
    }

    public void setPermVille(String permVille) {
        this.permVille = permVille;
    }

    public String getPermPays() {
        return permPays;
    }

    public void setPermPays(String permPays) {
        this.permPays = permPays;
    }

    public String getDernierDiplome() {
        return dernierDiplome;
    }

    public void setDernierDiplome(String dernierDiplome) {
        this.dernierDiplome = dernierDiplome;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getSigleEtu() {
        return sigleEtu;
    }

    public void setSigleEtu(String sigleEtu) {
        this.sigleEtu = sigleEtu;
    }

    public String getCompteCri() {
        return compteCri;
    }

    public void setCompteCri(String compteCri) {
        this.compteCri = compteCri;
    }

    public String getUboEmail() {
        return uboEmail;
    }

    public void setUboEmail(String uboEmail) {
        this.uboEmail = uboEmail;
    }

    public Byte getGrpeAnglais() {
        return grpeAnglais;
    }

    public void setGrpeAnglais(Byte grpeAnglais) {
        this.grpeAnglais = grpeAnglais;
    }

    public String getAbandonMotif() {
        return abandonMotif;
    }

    public void setAbandonMotif(String abandonMotif) {
        this.abandonMotif = abandonMotif;
    }

    public Date getAbandonDate() {
        return abandonDate;
    }

    public void setAbandonDate(Date abandonDate) {
        this.abandonDate = abandonDate;
    }

    public String getEstDiplome() {
        return estDiplome;
    }

    public void setEstDiplome(String estDiplome) {
        this.estDiplome = estDiplome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Etudiant etudiant = (Etudiant) o;

        if (noEtudiantNat != null ? !noEtudiantNat.equals(etudiant.noEtudiantNat) : etudiant.noEtudiantNat != null)
            return false;
        if (anneePro != null ? !anneePro.equals(etudiant.anneePro) : etudiant.anneePro != null) return false;
        if (codeCom != null ? !codeCom.equals(etudiant.codeCom) : etudiant.codeCom != null) return false;
        if (noEtudiantUbo != null ? !noEtudiantUbo.equals(etudiant.noEtudiantUbo) : etudiant.noEtudiantUbo != null)
            return false;
        if (sexe != null ? !sexe.equals(etudiant.sexe) : etudiant.sexe != null) return false;
        if (nom != null ? !nom.equals(etudiant.nom) : etudiant.nom != null) return false;
        if (prenom != null ? !prenom.equals(etudiant.prenom) : etudiant.prenom != null) return false;
        if (dateNaissance != null ? !dateNaissance.equals(etudiant.dateNaissance) : etudiant.dateNaissance != null)
            return false;
        if (lieuNaissance != null ? !lieuNaissance.equals(etudiant.lieuNaissance) : etudiant.lieuNaissance != null)
            return false;
        if (situation != null ? !situation.equals(etudiant.situation) : etudiant.situation != null) return false;
        if (nationalite != null ? !nationalite.equals(etudiant.nationalite) : etudiant.nationalite != null)
            return false;
        if (telPort != null ? !telPort.equals(etudiant.telPort) : etudiant.telPort != null) return false;
        if (telFixe != null ? !telFixe.equals(etudiant.telFixe) : etudiant.telFixe != null) return false;
        if (email != null ? !email.equals(etudiant.email) : etudiant.email != null) return false;
        if (actuAdresse != null ? !actuAdresse.equals(etudiant.actuAdresse) : etudiant.actuAdresse != null)
            return false;
        if (actuCp != null ? !actuCp.equals(etudiant.actuCp) : etudiant.actuCp != null) return false;
        if (actuVille != null ? !actuVille.equals(etudiant.actuVille) : etudiant.actuVille != null) return false;
        if (actuPays != null ? !actuPays.equals(etudiant.actuPays) : etudiant.actuPays != null) return false;
        if (permAdresse != null ? !permAdresse.equals(etudiant.permAdresse) : etudiant.permAdresse != null)
            return false;
        if (permCp != null ? !permCp.equals(etudiant.permCp) : etudiant.permCp != null) return false;
        if (permVille != null ? !permVille.equals(etudiant.permVille) : etudiant.permVille != null) return false;
        if (permPays != null ? !permPays.equals(etudiant.permPays) : etudiant.permPays != null) return false;
        if (dernierDiplome != null ? !dernierDiplome.equals(etudiant.dernierDiplome) : etudiant.dernierDiplome != null)
            return false;
        if (universite != null ? !universite.equals(etudiant.universite) : etudiant.universite != null) return false;
        if (sigleEtu != null ? !sigleEtu.equals(etudiant.sigleEtu) : etudiant.sigleEtu != null) return false;
        if (compteCri != null ? !compteCri.equals(etudiant.compteCri) : etudiant.compteCri != null) return false;
        if (uboEmail != null ? !uboEmail.equals(etudiant.uboEmail) : etudiant.uboEmail != null) return false;
        if (grpeAnglais != null ? !grpeAnglais.equals(etudiant.grpeAnglais) : etudiant.grpeAnglais != null)
            return false;
        if (abandonMotif != null ? !abandonMotif.equals(etudiant.abandonMotif) : etudiant.abandonMotif != null)
            return false;
        if (abandonDate != null ? !abandonDate.equals(etudiant.abandonDate) : etudiant.abandonDate != null)
            return false;
        if (estDiplome != null ? !estDiplome.equals(etudiant.estDiplome) : etudiant.estDiplome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noEtudiantNat != null ? noEtudiantNat.hashCode() : 0;
        result = 31 * result + (anneePro != null ? anneePro.hashCode() : 0);
        result = 31 * result + (codeCom != null ? codeCom.hashCode() : 0);
        result = 31 * result + (noEtudiantUbo != null ? noEtudiantUbo.hashCode() : 0);
        result = 31 * result + (sexe != null ? sexe.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (dateNaissance != null ? dateNaissance.hashCode() : 0);
        result = 31 * result + (lieuNaissance != null ? lieuNaissance.hashCode() : 0);
        result = 31 * result + (situation != null ? situation.hashCode() : 0);
        result = 31 * result + (nationalite != null ? nationalite.hashCode() : 0);
        result = 31 * result + (telPort != null ? telPort.hashCode() : 0);
        result = 31 * result + (telFixe != null ? telFixe.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (actuAdresse != null ? actuAdresse.hashCode() : 0);
        result = 31 * result + (actuCp != null ? actuCp.hashCode() : 0);
        result = 31 * result + (actuVille != null ? actuVille.hashCode() : 0);
        result = 31 * result + (actuPays != null ? actuPays.hashCode() : 0);
        result = 31 * result + (permAdresse != null ? permAdresse.hashCode() : 0);
        result = 31 * result + (permCp != null ? permCp.hashCode() : 0);
        result = 31 * result + (permVille != null ? permVille.hashCode() : 0);
        result = 31 * result + (permPays != null ? permPays.hashCode() : 0);
        result = 31 * result + (dernierDiplome != null ? dernierDiplome.hashCode() : 0);
        result = 31 * result + (universite != null ? universite.hashCode() : 0);
        result = 31 * result + (sigleEtu != null ? sigleEtu.hashCode() : 0);
        result = 31 * result + (compteCri != null ? compteCri.hashCode() : 0);
        result = 31 * result + (uboEmail != null ? uboEmail.hashCode() : 0);
        result = 31 * result + (grpeAnglais != null ? grpeAnglais.hashCode() : 0);
        result = 31 * result + (abandonMotif != null ? abandonMotif.hashCode() : 0);
        result = 31 * result + (abandonDate != null ? abandonDate.hashCode() : 0);
        result = 31 * result + (estDiplome != null ? estDiplome.hashCode() : 0);
        return result;
    }
}
