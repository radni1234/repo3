package com.isem.mvc.dao;

import java.util.List;

import com.isem.mvc.tab.RnProc;

public interface RnProcDaoCustom {
	List<RnProc> vratiRn();
	List<RnProc> vratiRnObj(Long obj_id);
}
