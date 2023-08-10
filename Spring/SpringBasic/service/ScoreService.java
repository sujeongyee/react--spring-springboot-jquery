package com.simple.service;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreService {
	
	public void scoreRegist(ScoreVO vo);
	public ArrayList<ScoreVO> getScores();
	public void scoreDelete(int index);

}
