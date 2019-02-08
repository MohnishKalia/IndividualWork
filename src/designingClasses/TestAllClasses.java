package designingClasses;

public class TestAllClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HardDrive bob = new HardDrive("Disk 1", 128);
		System.out.println(bob.isEmpty());
		for (int i = 0; i < 7; i++) {
			bob.addFile(7 + i);
		}
		bob.deleteFile((int) Math.random() * 6);
		System.out.println(bob.isFull());
	}

}
