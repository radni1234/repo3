package com.isem.mvc.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.isem.mvc.model.Korisnik;

@Repository
public interface KorisnikDao extends PagingAndSortingRepository<Korisnik, Long>{
	
	Korisnik findByUsername (String userName);
	
	Korisnik findById(Long id);
	
	List<Korisnik> findAll();
	
	Page<Korisnik> findAll(Pageable pageRequest);
	
//	
//	
//	@Query(value = "SELECT CONCAT ( CONCAT ('{id:' , k.id)," +
//	   "CONCAT (	CONCAT (',username:' , k.username), " +
//       "CONCAT ( CONCAT (',password:' , k.password), " +
//       "CONCAT ( CONCAT (',mail:' , k.mail), " +
//       "CONCAT ( CONCAT (',uloga_naziv:' , u.naziv), " +
//       "CONCAT ( CONCAT (',mesto_naziv:' , m.naziv), " +
//       "CONCAT ( CONCAT (',opstina_naziv:' , o.naziv),'}')))))))   " +   
//			"FROM Korisnik k, Uloga u, Opstina O, Mesto m " +
//			"WHERE k.uloga_id = u.id and k.mesto_id = m.id and m.opstina_id = o.id and k.id = 61"
//			, nativeQuery = true)
//    public List<Object> vratiKorisnikTabela();

}