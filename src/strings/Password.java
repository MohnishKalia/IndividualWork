package strings;

public class Password {
	private String pass;
	private boolean valid;
	private boolean verify;

	public Password() {
		pass = "1aaaaa!?";
	}

	public boolean setPass(String xPass) {
		if (xPass.contains("!") && xPass.contains("?") && xPass.charAt(0) >= 48 && xPass.charAt(0) <= 57
				&& !(xPass.contains(" ")) && xPass.length() > 8 && xPass.length() < 23) {
			pass = xPass;
			valid = true;
		} else {
			valid = false;
		}
		return valid;
	}

	public boolean match(String xTry) {
		if (pass.contains(xTry)) {
			verify = true;
		} else {
			verify = false;
		}
		return verify;
	}

}
