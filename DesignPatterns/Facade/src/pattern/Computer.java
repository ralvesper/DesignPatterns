/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

/**
 *
 * @author dyego
 */
public class Computer {
	private CPU cpu=null;
	private Memory memory=null;
	private HardDrive hardDrive=null;

        private long BOOT_ADDRESS =1;
        private long BOOT_SECTOR =0;
        private int  SECTOR_SIZE =28;

	public Computer() {
		this.cpu=new CPU();
		this.memory=new Memory();
		this.hardDrive=new HardDrive();
	}

	public void startComputer() {
		cpu.freeze();
		memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
		cpu.jump(BOOT_ADDRESS);
		cpu.execute();
	}
}
