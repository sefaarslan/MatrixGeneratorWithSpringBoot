package com.spring.matrixgenerator.service;

import org.springframework.stereotype.Service;

import com.spring.matrixgenerator.models.Numbers;

@Service
public class MatrixGeneratorService {

	
	public int[][] generateMatrix(Numbers numbers) {
		
		int[][] values = new int[numbers.getColumn_number()][numbers.getRow_number()];
		
		for(int i=0; i < values.length; i++) {
			for (int k=0; k< values[i].length; k++) {
				values[i][k]= (int) (Math.random()* 1000);
			}
				
		}
		
		return values;
		
		
	}
	
	

}
