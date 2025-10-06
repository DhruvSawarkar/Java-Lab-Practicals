public class UserInfoParser {
    public static void main(String[] args) {
        String userData = "USERID:drvswkr | FULLNAME:Dhruv Sawarkar | ROLE:Admin";

        int fullNameStart = userData.indexOf("FULLNAME:") + "FULLNAME:".length();
        int fullNameEnd = userData.indexOf("|", fullNameStart);
        String fullName = userData.substring(fullNameStart, fullNameEnd).trim();


        int roleStart = userData.indexOf("ROLE:") + "ROLE:".length();
        String role = userData.substring(roleStart).trim();

        System.out.println("Full Name: " + fullName);
        System.out.println("Role: " + role.toLowerCase());
    }
}
