package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class Authmgmtservice implements IAuthMgmtservice {

	@Autowired
	private EntityManager manager;

//	CREATE DEFINER=`root`@`localhost` PROCEDURE `p_authuntication`(
//		    IN uname VARCHAR(45),
//		    IN pwd VARCHAR(45),
//		    OUT result VARCHAR(45)
//		)
//		BEGIN
//		    DECLARE cnt INT DEFAULT 0;
//
//		    SELECT COUNT(*) INTO cnt 
//		    FROM users_info 
//		    WHERE username = uname AND password = pwd;
//
//		    IF cnt <> 0 THEN
//		        SET result = 'valid credentials';
//		    ELSE
//		        SET result = 'invalid credentials';
//		    END IF;
//		END
	@Override
	public String login(String username, String pwd) {
		StoredProcedureQuery query = manager.createStoredProcedureQuery("p_authuntication");
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);

		query.setParameter(1, username);
		query.setParameter(2, pwd);

		String res = (String) query.getOutputParameterValue(3);
		return res;
	}

}
