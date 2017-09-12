package com.isem.mvc.lov;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository	
public class LovDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Lov> objekatLov(String user) {
		
		Query query = entityManager.createNativeQuery(
				"select id, naziv as name "
				+ "from objekat "
				+ "where (mesto_id in (select id from mesto where opstina_id = (select opstina_id from mesto where id = (select mesto_id from user where username like :user))) "
				+ "		and (select authority_id from user_authority where user_id = (select id from user where username like :user)) in (2,4)) "
				+ " or "
				+ "		(id in (select objekat_id from korisnik_objekat where korisnik_id = (select id from user where username like :user)) "
				+ "		and (select authority_id from user_authority where user_id = (select id from user where username like :user)) in (3)) "
				+ "or ((select authority_id from user_authority where user_id = "
 				+ "		(select u.id from user u where username like :user)) in (1))",
				"Lov"
				).setParameter("user", user);
		
		return query.getResultList();		

	}
	
	
	@SuppressWarnings("unchecked")
	public List<Lov> objekatLov(String user, Long opsId, Long mesId, Long gruId, Long podgruId) {
		
		Query query = entityManager.createNativeQuery(
				"select o.id, o.naziv as name "
				+ "from objekat o join mesto m on o.mesto_id = m.id "
				+ "		join podgrupa p on o.podgrupa_id = p.id "
				+ "		join opstina op on m.opstina_id = op.id "
				+ "		join grupa g on p.grupa_id = g.id "
				+ "where ((mesto_id in (select id from mesto where opstina_id = (select opstina_id from mesto where id = (select mesto_id from user where username like :user))) "
				+ "			and (select authority_id from user_authority where user_id = (select id from user where username like :user)) in (1,2,4)) "
				+ " 		or "
				+ "			(o.id in (select objekat_id from korisnik_objekat where korisnik_id = (select id from user where username like :user)) "
				+ "			and (select authority_id from user_authority where user_id = (select id from user where username like :user)) in (3))"
				+ "			or ((select authority_id from user_authority where user_id = "
 				+ "				(select u.id from user u where username like :user)) in (1)))"
				+ "		and (op.id = :opsId or :opsId = 0) "
				+ "		and (m.id = :mesId or :mesId = 0) "
				+ "		and (g.id = :gruId or :gruId = 0) "
				+ "		and (p.id = :podgruId or :podgruId = 0) "
				,"Lov"
				).setParameter("user", user)
				 .setParameter("opsId", opsId)
				 .setParameter("mesId", mesId)
				 .setParameter("gruId", gruId)
				 .setParameter("podgruId", podgruId);
	
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lov> objekatLov(String user, Long opsId, Long mesId, Long gruId, Long podgruId, Long nacFinId) {
		
		Query query = entityManager.createNativeQuery(
				"select o.id, o.naziv as name "
				+ "from objekat o join mesto m on o.mesto_id = m.id "
				+ "		join podgrupa p on o.podgrupa_id = p.id "
				+ "		join opstina op on m.opstina_id = op.id "
				+ "		join grupa g on p.grupa_id = g.id "
				+ "where ((mesto_id in (select id from mesto where opstina_id = (select opstina_id from mesto where id = (select mesto_id from user where username like :user))) "
				+ "			and (select authority_id from user_authority where user_id = (select id from user where username like :user)) in (1,2,4)) "
				+ " 		or "
				+ "			(o.id in (select objekat_id from korisnik_objekat where korisnik_id = (select id from user where username like :user)) "
				+ "			and (select authority_id from user_authority where user_id = (select id from user where username like :user)) in (3)) "
				+ "			or ((select authority_id from user_authority where user_id = "
 				+ "				(select u.id from user u where username like :user)) in (1)))"
				+ "		and (op.id = :opsId or :opsId = 0) "
				+ "		and (m.id = :mesId or :mesId = 0) "
				+ "		and (g.id = :gruId or :gruId = 0) "
				+ "		and (p.id = :podgruId or :podgruId = 0) "
				+ "		and (o.nacin_finansiranja_id = :nacFinId or :nacFinId = 0) "
				,"Lov"
				).setParameter("user", user)
				 .setParameter("opsId", opsId)
				 .setParameter("mesId", mesId)
				 .setParameter("gruId", gruId)
				 .setParameter("podgruId", podgruId)
				 .setParameter("nacFinId", nacFinId);
	
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lov> energentLov() {
		Query query = entityManager.createNativeQuery(
				"select id, naziv as name from energent order by naziv",
					"Lov");
	
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lov> energentLov(Long objId) {
		Query query = entityManager.createNativeQuery(
				"select e.id, e.naziv as name " +
				"from energent e " +
				"where energent_tip_id in (select t.id " +
				"							from brojilo b, brojilo_vrsta v, energent_tip t " +
				"							where b.brojilo_vrsta_id = v.id " +
				"								  and v.energent_tip_id = t.id " +
				"								  and b.objekat_id = " + objId + ") " +
				"order by e.naziv",
					"Lov");
	
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lov> energentTipLov() {
		Query query = entityManager.createNativeQuery(
				    "SELECT id, naziv as name from energent_tip order by naziv",
					"Lov");
	
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lov> energentTipLov(Long objId) {
		Query query = entityManager.createNativeQuery(
				    "select id, naziv as name " + 
					"from energent_tip " + 
					"where id in (select energent_tip_id " + 
					"			 from brojilo b, brojilo_vrsta v " + 
					"             where b.brojilo_vrsta_id = v.id " + 										
					"				  and b.objekat_id = " + objId + " ) " + 
					"order by naziv",
					"Lov");
	
		return query.getResultList();
	}
	

	@SuppressWarnings("unchecked")
	public List<Lov> JavnoPreduzeceLov(String user) {
		
		Query query = entityManager.createNativeQuery(
				"select id, naziv as name "
				+ "from javno_preduzece "
				+ "where (mesto_id in (select id from mesto where opstina_id = (select opstina_id from mesto where id = (select mesto_id from user where username like :user))) "
				+ "		and (select authority_id from user_authority where user_id = (select id from user where username like :user)) in (2,3,4)) "
				+ "or ((select authority_id from user_authority where user_id = "
 				+ "		(select u.id from user u where username like :user)) in (1))",
				"Lov"
				).setParameter("user", user);
		
		return query.getResultList();		

	}
	
}
