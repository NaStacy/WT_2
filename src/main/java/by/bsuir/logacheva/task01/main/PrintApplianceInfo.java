package by.bsuir.logacheva.task01.main;

import by.bsuir.logacheva.task01.entity.Appliance;

import java.util.List;

/**
 * Class for printing appliance info
 */
public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		for (Appliance appliance: appliances) {
			System.out.println(appliance);
		}
		
	}
}
