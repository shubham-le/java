package com.practice.date_time;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class LocalDateApis {

	@Test
	void printDate() {
		LocalDate dt = LocalDate.now();
		System.out.println("LocalDate now: " + dt);
	}

	@Test
	public void compairDate() {
		LocalDate dt = LocalDate.now();
		System.out.println(dt + " isBefore + 2 days: " + dt.isBefore(LocalDate.now().plusDays(2)));
	}

}
