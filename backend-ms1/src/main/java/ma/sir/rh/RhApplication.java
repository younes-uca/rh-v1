package  ma.sir.rh;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.cache.annotation.EnableCaching;


import ma.sir.rh.bean.core.*;
import ma.sir.rh.service.facade.admin.*;

import ma.sir.rh.zynerator.security.common.AuthoritiesConstants;
import ma.sir.rh.zynerator.security.bean.User;
import ma.sir.rh.zynerator.security.bean.Permission;
import ma.sir.rh.zynerator.security.bean.Role;
import ma.sir.rh.zynerator.security.service.facade.UserService;
import ma.sir.rh.zynerator.security.service.facade.RoleService;


import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
//@EnableFeignClients("ma.sir.rh.required.facade")
public class RhApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(RhApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
    return (args) -> {
        if(true){

            createEducation();
            createCategorieEmploye();
            createCompagnieAssurance();
            createDemandeConge();
            createTypeDemandeConge();
            createReclamation();
            createNews();
            createDepartement();
            createSoldAnnuelConge();
            createSexe();
            createStation();
            createAssurance();
            createSiege();
            createTypeReclamation();
            createPromotion();
            createVille();
            createEmploye();
            createLienParente();
            createSociete();
            createEtatDemandeConge();
            createEtatReclamation();


    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }



    private void createEducation(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            Education item = new Education();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            educationService.create(item);
        }
    }
    private void createCategorieEmploye(){
        String code = "code";
        String libelle = "libelle";
        String description = "description";
        for (int i = 1; i < 100; i++) {
            CategorieEmploye item = new CategorieEmploye();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setDescription(fakeString(description, i));
            categorieEmployeService.create(item);
        }
    }
    private void createCompagnieAssurance(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            CompagnieAssurance item = new CompagnieAssurance();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            compagnieAssuranceService.create(item);
        }
    }
    private void createDemandeConge(){
        String ref = "ref";
        String startTime = "startTime";
        String endTime = "endTime";
         String nbrJourConge = "nbrJourConge";
        for (int i = 1; i < 100; i++) {
            DemandeConge item = new DemandeConge();
            item.setRef(fakeString(ref, i));
            item.setStartTime(fakeLocalDateTime(startTime, i));
            item.setEndTime(fakeLocalDateTime(endTime, i));
            item.setNbrJourConge(fakeInteger(nbrJourConge, i));
            demandeCongeService.create(item);
        }
    }
    private void createTypeDemandeConge(){
        String ref = "ref";
        String code = "code";
        String libelle = "libelle";
         String nbrJourConge = "nbrJourConge";
        for (int i = 1; i < 100; i++) {
            TypeDemandeConge item = new TypeDemandeConge();
            item.setRef(fakeString(ref, i));
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setNbrJourConge(fakeInteger(nbrJourConge, i));
            typeDemandeCongeService.create(item);
        }
    }
    private void createReclamation(){
        String reference = "reference";
        String dateReclamation = "dateReclamation";
        String message = "message";
        String dateTraitement = "dateTraitement";
        String dateReponse = "dateReponse";
        String commentaireTraiteur = "commentaireTraiteur";
        String objetReclamation = "objetReclamation";
        for (int i = 1; i < 100; i++) {
            Reclamation item = new Reclamation();
            item.setReference(fakeString(reference, i));
            item.setDateReclamation(fakeLocalDateTime(dateReclamation, i));
            item.setMessage(fakeString(message, i));
            item.setDateTraitement(fakeLocalDateTime(dateTraitement, i));
            item.setDateReponse(fakeLocalDateTime(dateReponse, i));
            item.setCommentaireTraiteur(fakeString(commentaireTraiteur, i));
            item.setObjetReclamation(fakeString(objetReclamation, i));
            reclamationService.create(item);
        }
    }
    private void createNews(){
        String ref = "ref";
        String libelle = "libelle";
        String image = "image";
        String description = "description";
        String dateNews = "dateNews";
         String archive = "archive";
         String numeroOrdre = "numeroOrdre";
        String destinataire = "destinataire";
        for (int i = 1; i < 100; i++) {
            News item = new News();
            item.setRef(fakeString(ref, i));
            item.setLibelle(fakeString(libelle, i));
            item.setImage(fakeString(image, i));
            item.setDescription(fakeString(description, i));
            item.setDateNews(fakeLocalDateTime(dateNews, i));
            item.setArchive(fakeBoolean(archive, i));
            item.setNumeroOrdre(fakeInteger(numeroOrdre, i));
            item.setDestinataire(fakeString(destinataire, i));
            newsService.create(item);
        }
    }
    private void createDepartement(){
         String nbrEmploye = "nbrEmploye";
         String moyenneAge = "moyenneAge";
        for (int i = 1; i < 100; i++) {
            Departement item = new Departement();
            item.setNbrEmploye(fakeInteger(nbrEmploye, i));
            item.setMoyenneAge(fakeBigDecimal(moyenneAge, i));
            departementService.create(item);
        }
    }
    private void createSoldAnnuelConge(){
         String annee = "annee";
         String nbrJourTotale = "nbrJourTotale";
         String nbrJourConsome = "nbrJourConsome";
         String nbrJourRestant = "nbrJourRestant";
        for (int i = 1; i < 100; i++) {
            SoldAnnuelConge item = new SoldAnnuelConge();
            item.setAnnee(fakeInteger(annee, i));
            item.setNbrJourTotale(fakeInteger(nbrJourTotale, i));
            item.setNbrJourConsome(fakeInteger(nbrJourConsome, i));
            item.setNbrJourRestant(fakeInteger(nbrJourRestant, i));
            soldAnnuelCongeService.create(item);
        }
    }
    private void createSexe(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            Sexe item = new Sexe();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            sexeService.create(item);
        }
    }
    private void createStation(){
        String code = "code";
        String adresse = "adresse";
        for (int i = 1; i < 100; i++) {
            Station item = new Station();
            item.setCode(fakeString(code, i));
            item.setAdresse(fakeString(adresse, i));
            stationService.create(item);
        }
    }
    private void createAssurance(){
        String numeroPolice = "numeroPolice";
        String courtier = "courtier";
        String malade = "malade";
        String dateConsultation = "dateConsultation";
        String dateTransmission = "dateTransmission";
        String natureBesoin = "natureBesoin";
         String fraisEnagage = "fraisEnagage";
        String dateEnvoi = "dateEnvoi";
        String observation = "observation";
        for (int i = 1; i < 100; i++) {
            Assurance item = new Assurance();
            item.setNumeroPolice(fakeString(numeroPolice, i));
            item.setCourtier(fakeString(courtier, i));
            item.setMalade(fakeString(malade, i));
            item.setDateConsultation(fakeLocalDateTime(dateConsultation, i));
            item.setDateTransmission(fakeLocalDateTime(dateTransmission, i));
            item.setNatureBesoin(fakeString(natureBesoin, i));
            item.setFraisEnagage(fakeBigDecimal(fraisEnagage, i));
            item.setDateEnvoi(fakeLocalDateTime(dateEnvoi, i));
            item.setObservation(fakeString(observation, i));
            assuranceService.create(item);
        }
    }
    private void createSiege(){
        String code = "code";
        String libelle = "libelle";
        String adresse = "adresse";
        String description = "description";
        for (int i = 1; i < 100; i++) {
            Siege item = new Siege();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setAdresse(fakeString(adresse, i));
            item.setDescription(fakeString(description, i));
            siegeService.create(item);
        }
    }
    private void createTypeReclamation(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            TypeReclamation item = new TypeReclamation();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            typeReclamationService.create(item);
        }
    }
    private void createPromotion(){
        String code = "code";
        String libelle = "libelle";
        String dateDebutProfession = "dateDebutProfession";
        String dateDebutContrat = "dateDebutContrat";
        for (int i = 1; i < 100; i++) {
            Promotion item = new Promotion();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setDateDebutProfession(fakeLocalDateTime(dateDebutProfession, i));
            item.setDateDebutContrat(fakeLocalDateTime(dateDebutContrat, i));
            promotionService.create(item);
        }
    }
    private void createVille(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            Ville item = new Ville();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            villeService.create(item);
        }
    }
    private void createEmploye(){
        String identifiantJlinx = "identifiantJlinx";
        String matricule = "matricule";
        String prenom = "prenom";
        String nom = "nom";
        String situation = "situation";
        String dateNaissance = "dateNaissance";
        String adresse = "adresse";
        String ville = "ville";
        String cin = "cin";
        String numeroAdhesion = "numeroAdhesion";
        String email = "email";
        String rib = "rib";
         String age = "age";
        String numeroTelephone = "numeroTelephone";
        String emergencyContact = "emergencyContact";
        String numeroSecuriteSociale = "numeroSecuriteSociale";
        String warnningNotice = "warnningNotice";
         String cost = "cost";
         String assuranceCost = "assuranceCost";
         String etude = "etude";
         String experience = "experience";
         String salaire = "salaire";
        for (int i = 1; i < 100; i++) {
            Employe item = new Employe();
            item.setIdentifiantJlinx(fakeString(identifiantJlinx, i));
            item.setMatricule(fakeString(matricule, i));
            item.setPrenom(fakeString(prenom, i));
            item.setNom(fakeString(nom, i));
            item.setSituation(fakeString(situation, i));
            item.setDateNaissance(fakeLocalDateTime(dateNaissance, i));
            item.setAdresse(fakeString(adresse, i));
            item.setVille(fakeString(ville, i));
            item.setCin(fakeString(cin, i));
            item.setNumeroAdhesion(fakeString(numeroAdhesion, i));
            item.setEmail(fakeString(email, i));
            item.setRib(fakeString(rib, i));
            item.setAge(fakeInteger(age, i));
            item.setNumeroTelephone(fakeString(numeroTelephone, i));
            item.setEmergencyContact(fakeString(emergencyContact, i));
            item.setNumeroSecuriteSociale(fakeString(numeroSecuriteSociale, i));
            item.setWarnningNotice(fakeString(warnningNotice, i));
            item.setCost(fakeBigDecimal(cost, i));
            item.setAssuranceCost(fakeBigDecimal(assuranceCost, i));
            item.setEtude(fakeBoolean(etude, i));
            item.setExperience(fakeBoolean(experience, i));
            item.setSalaire(fakeBigDecimal(salaire, i));
            employeService.create(item);
        }
    }
    private void createLienParente(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            LienParente item = new LienParente();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            lienParenteService.create(item);
        }
    }
    private void createSociete(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            Societe item = new Societe();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            societeService.create(item);
        }
    }
    private void createEtatDemandeConge(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            EtatDemandeConge item = new EtatDemandeConge();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            etatDemandeCongeService.create(item);
        }
    }
    private void createEtatReclamation(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            EtatReclamation item = new EtatReclamation();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            etatReclamationService.create(item);
        }
    }

    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return  10L * i;
    }
    private static Integer fakeInteger(String attributeName, int i) {
        return  10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return  BigDecimal.valueOf(i*1L*10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }
    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("Education.edit"));
        permissions.add(new Permission("Education.list"));
        permissions.add(new Permission("Education.view"));
        permissions.add(new Permission("Education.add"));
        permissions.add(new Permission("Education.delete"));
        permissions.add(new Permission("CategorieEmploye.edit"));
        permissions.add(new Permission("CategorieEmploye.list"));
        permissions.add(new Permission("CategorieEmploye.view"));
        permissions.add(new Permission("CategorieEmploye.add"));
        permissions.add(new Permission("CategorieEmploye.delete"));
        permissions.add(new Permission("CompagnieAssurance.edit"));
        permissions.add(new Permission("CompagnieAssurance.list"));
        permissions.add(new Permission("CompagnieAssurance.view"));
        permissions.add(new Permission("CompagnieAssurance.add"));
        permissions.add(new Permission("CompagnieAssurance.delete"));
        permissions.add(new Permission("DemandeConge.edit"));
        permissions.add(new Permission("DemandeConge.list"));
        permissions.add(new Permission("DemandeConge.view"));
        permissions.add(new Permission("DemandeConge.add"));
        permissions.add(new Permission("DemandeConge.delete"));
        permissions.add(new Permission("TypeDemandeConge.edit"));
        permissions.add(new Permission("TypeDemandeConge.list"));
        permissions.add(new Permission("TypeDemandeConge.view"));
        permissions.add(new Permission("TypeDemandeConge.add"));
        permissions.add(new Permission("TypeDemandeConge.delete"));
        permissions.add(new Permission("Reclamation.edit"));
        permissions.add(new Permission("Reclamation.list"));
        permissions.add(new Permission("Reclamation.view"));
        permissions.add(new Permission("Reclamation.add"));
        permissions.add(new Permission("Reclamation.delete"));
        permissions.add(new Permission("News.edit"));
        permissions.add(new Permission("News.list"));
        permissions.add(new Permission("News.view"));
        permissions.add(new Permission("News.add"));
        permissions.add(new Permission("News.delete"));
        permissions.add(new Permission("Departement.edit"));
        permissions.add(new Permission("Departement.list"));
        permissions.add(new Permission("Departement.view"));
        permissions.add(new Permission("Departement.add"));
        permissions.add(new Permission("Departement.delete"));
        permissions.add(new Permission("SoldAnnuelConge.edit"));
        permissions.add(new Permission("SoldAnnuelConge.list"));
        permissions.add(new Permission("SoldAnnuelConge.view"));
        permissions.add(new Permission("SoldAnnuelConge.add"));
        permissions.add(new Permission("SoldAnnuelConge.delete"));
        permissions.add(new Permission("Sexe.edit"));
        permissions.add(new Permission("Sexe.list"));
        permissions.add(new Permission("Sexe.view"));
        permissions.add(new Permission("Sexe.add"));
        permissions.add(new Permission("Sexe.delete"));
        permissions.add(new Permission("Station.edit"));
        permissions.add(new Permission("Station.list"));
        permissions.add(new Permission("Station.view"));
        permissions.add(new Permission("Station.add"));
        permissions.add(new Permission("Station.delete"));
        permissions.add(new Permission("Assurance.edit"));
        permissions.add(new Permission("Assurance.list"));
        permissions.add(new Permission("Assurance.view"));
        permissions.add(new Permission("Assurance.add"));
        permissions.add(new Permission("Assurance.delete"));
        permissions.add(new Permission("Siege.edit"));
        permissions.add(new Permission("Siege.list"));
        permissions.add(new Permission("Siege.view"));
        permissions.add(new Permission("Siege.add"));
        permissions.add(new Permission("Siege.delete"));
        permissions.add(new Permission("TypeReclamation.edit"));
        permissions.add(new Permission("TypeReclamation.list"));
        permissions.add(new Permission("TypeReclamation.view"));
        permissions.add(new Permission("TypeReclamation.add"));
        permissions.add(new Permission("TypeReclamation.delete"));
        permissions.add(new Permission("Promotion.edit"));
        permissions.add(new Permission("Promotion.list"));
        permissions.add(new Permission("Promotion.view"));
        permissions.add(new Permission("Promotion.add"));
        permissions.add(new Permission("Promotion.delete"));
        permissions.add(new Permission("Ville.edit"));
        permissions.add(new Permission("Ville.list"));
        permissions.add(new Permission("Ville.view"));
        permissions.add(new Permission("Ville.add"));
        permissions.add(new Permission("Ville.delete"));
        permissions.add(new Permission("Employe.edit"));
        permissions.add(new Permission("Employe.list"));
        permissions.add(new Permission("Employe.view"));
        permissions.add(new Permission("Employe.add"));
        permissions.add(new Permission("Employe.delete"));
        permissions.add(new Permission("LienParente.edit"));
        permissions.add(new Permission("LienParente.list"));
        permissions.add(new Permission("LienParente.view"));
        permissions.add(new Permission("LienParente.add"));
        permissions.add(new Permission("LienParente.delete"));
        permissions.add(new Permission("Societe.edit"));
        permissions.add(new Permission("Societe.list"));
        permissions.add(new Permission("Societe.view"));
        permissions.add(new Permission("Societe.add"));
        permissions.add(new Permission("Societe.delete"));
        permissions.add(new Permission("EtatDemandeConge.edit"));
        permissions.add(new Permission("EtatDemandeConge.list"));
        permissions.add(new Permission("EtatDemandeConge.view"));
        permissions.add(new Permission("EtatDemandeConge.add"));
        permissions.add(new Permission("EtatDemandeConge.delete"));
        permissions.add(new Permission("EtatReclamation.edit"));
        permissions.add(new Permission("EtatReclamation.list"));
        permissions.add(new Permission("EtatReclamation.view"));
        permissions.add(new Permission("EtatReclamation.add"));
        permissions.add(new Permission("EtatReclamation.delete"));
    }

    @Autowired
    EducationAdminService educationService;
    @Autowired
    CategorieEmployeAdminService categorieEmployeService;
    @Autowired
    CompagnieAssuranceAdminService compagnieAssuranceService;
    @Autowired
    DemandeCongeAdminService demandeCongeService;
    @Autowired
    TypeDemandeCongeAdminService typeDemandeCongeService;
    @Autowired
    ReclamationAdminService reclamationService;
    @Autowired
    NewsAdminService newsService;
    @Autowired
    DepartementAdminService departementService;
    @Autowired
    SoldAnnuelCongeAdminService soldAnnuelCongeService;
    @Autowired
    SexeAdminService sexeService;
    @Autowired
    StationAdminService stationService;
    @Autowired
    AssuranceAdminService assuranceService;
    @Autowired
    SiegeAdminService siegeService;
    @Autowired
    TypeReclamationAdminService typeReclamationService;
    @Autowired
    PromotionAdminService promotionService;
    @Autowired
    VilleAdminService villeService;
    @Autowired
    EmployeAdminService employeService;
    @Autowired
    LienParenteAdminService lienParenteService;
    @Autowired
    SocieteAdminService societeService;
    @Autowired
    EtatDemandeCongeAdminService etatDemandeCongeService;
    @Autowired
    EtatReclamationAdminService etatReclamationService;
}


