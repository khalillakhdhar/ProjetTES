package sprint1.classes;

public class Client {
private int id;
private String nom,prenom,email,adresse,telephone;
private int codeapplication;
private double solde;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public int getCodeapplication() {
	return codeapplication;
}
public void setCodeapplication(int codeapplication) {
	this.codeapplication = codeapplication;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public Client(int id, String nom, String prenom, String email, String adresse, String telephone, int codeapplication,
		double solde) {
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.adresse = adresse;
	this.telephone = telephone;
	this.codeapplication = codeapplication;
	this.solde = solde;
}
public Client(String nom, String prenom, String email, String adresse, String telephone, int codeapplication,
		double solde) {
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.adresse = adresse;
	this.telephone = telephone;
	this.codeapplication = codeapplication;
	this.solde = solde;
}
public Client() {
}
@Override
public String toString() {
	return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse=" + adresse
			+ ", telephone=" + telephone + ", codeapplication=" + codeapplication + ", solde=" + solde + "]";
}








}
