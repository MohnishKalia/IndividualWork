package inheritance;

public class Storage extends Box {

	public Storage() {
		super();
	}

	public String method2() {
		return "Storage method2";
	}

	public String method3() {
		return super.method3();
	}

	public String method4() {
		return "Storage method4";
	}
}
