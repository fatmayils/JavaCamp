package eMailVerification.business.concretes;

import java.util.regex.Pattern;

import eMailVerification.business.abstracts.UserVerificationService;

public class EMailVerificationManager implements UserVerificationService {
	private  final  String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"; 
	public  boolean isEmailValid(String emailInput) {
	Pattern pattern = Pattern.compile(EMAIL_REGEX,
	Pattern.CASE_INSENSITIVE);
	return pattern.matcher(emailInput).find();
	}
}
