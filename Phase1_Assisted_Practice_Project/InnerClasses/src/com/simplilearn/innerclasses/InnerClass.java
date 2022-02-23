package com.simplilearn.innerclasses;

public class InnerClass {
	
	public static void main(String[] args) {
		// Create object of outer class CPU
		CPU cpu = new CPU();
		// create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();
        // create an object of inner class RAM using outer class CPU
        CPU.RAM ram = cpu.new RAM();
        
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());

	}

}

class CPU {
	double price;
	
	// nested class
	class Processor {
		// members of nested class
		double cores;
		String manufacturer;
		
		double getCache() {
			return 4.3;
		}
	}
	
	protected class RAM {
		// nested protected class
		double memory;
		String manufacturer;
		
		double getClockSpeed() {
			return 5.5;
		}
	}
}
