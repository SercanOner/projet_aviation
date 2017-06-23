package pDao;

import java.util.List;

import JPAClass.ClienPhysique;
import JPAClass.Client;
import JPAClass.ClientPhysique;
import JPAClass.Login;
import JPAClass.Passager;
import aubay.formation.model.Difficulty;
import aubay.formation.model.Formation;
import aubay.formation.model.Matiere;
import pDaoProjetJPA.ClienPhysiqueDao;
import pDaoProjetJPA.ClientDao;
import pDaoProjetJPA.LoginDao;
import pDaoProjetJPA.PassagerDao;

public class TestFormationWithDao {

	public static void main(String[] args) {
		//MatiereDao matiereDao = Application.getInstance().getMatiereDao();
		
		/*Matiere jpa = new Matiere("JPA", Difficulty.facile);
		
		matiereDao.create(jpa);
		
		FormationDao formationdao = Application.getInstance().getFormationDao();
		Formation formation = new Formation();
		formation.setNom("Spring");
		formationdao.create(formation);
		*/
		/*ClienPhysiqueDao cpDao = Application.getInstance().getClienPhysiqueDao();
		ClienPhysique cp = new ClienPhysique();
		cp.setPrenom("Toto");
		cp.setNom("Titi");
		cp.setNumeroTel(03);
		cp.setNumeroFax(06);
		cp.setEmail("v.brosse");
		
		cpDao.create(cp);*/
		
		LoginDao lgDao  = Application.getInstance().getLoginDao();
		Login lg = new Login();
		lg.setLogin("vbrosse");
		lg.setMotDePasse("nini");
		lgDao.create(lg);
		
		PassagerDao psDao = Application.getInstance().getPassagerDao();
		Passager ps = new Passager();
		ps.setNom("Roger");
		ps.setPrenom("VIVI");
		psDao.create(ps);
		
		ClientDao clDao = Application.getInstance().getClientDao();
		ClienPhysique cl = new ClienPhysique();
		cl.setPrenom("Toto");
		cl.setNom("Titi");
		cl.setNumeroTel(03);
		cl.setNumeroFax(06);
		cl.setEmail("v.brosse");
		clDao.create(cl);
			
	}

}
