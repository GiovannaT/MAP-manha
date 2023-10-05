package facade;

public class ComputerFacade {
	private CPU cpu = null;
	private HardDrive hardDrive = null;
	private Memory memory = null;
	
	public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
		this.cpu = cpu;
		this.memory = memory;
		this.hardDrive = hardDrive;
	}
	
	public void ligarComputer() {
		cpu.start();
		memory.LoadMemory();
		hardDrive.readHardDrive();
	}
}
