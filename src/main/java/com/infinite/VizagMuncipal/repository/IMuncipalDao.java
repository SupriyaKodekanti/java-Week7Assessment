package com.infinite.VizagMuncipal.repository;

import java.util.List;
import com.infinite.VizagMuncipal.model.Muncipal;

public interface IMuncipalDao {
	public List<Muncipal> getAllusers();
	public void login(Muncipal logindata);
}
