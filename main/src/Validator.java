public class Validator {
    private boolean checkLogin(String login, String password) {
        //
        return false;
    }

    private boolean checkUpper(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.toUpperCase().equals(password)) {
                return false;
            }
        }
        return true;

    }

    private boolean checkS(String password) {
        char[] passar = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            return passar[i] == '@' || passar[i] == '$' || passar[i] == '!' || passar[i] == '^';
        }
        return false;
    }

    private boolean checkDigit(String password) {
        char[] passchar = password.toCharArray();
        for (int i = 0; i < password.length(); i = i + 1) {
            return passchar[i] == '1' || passchar[i] == '2' || passchar[i] == '3' || passchar[i] == '4' || passchar[i] == '5' || passchar[i] == '6' || passchar[i] == '7' || passchar[i] == '8' || passchar[i] == '9' || passchar[i] == '0';
        }
        return false;
    }

    public boolean checkPassword(String password) {
        return checkUpper(password) && checkDigit(password) && checkS(password) && password.length() >= 8;
    }


}
