package com.infinite.VizagMuncipal.service;

import java.util.List;
import com.infinite.VizagMuncipal.model.Muncipal;
public interface MuncipalService {
	public List<Muncipal> getAllusers();
	public void login(Muncipal logindata);
}
