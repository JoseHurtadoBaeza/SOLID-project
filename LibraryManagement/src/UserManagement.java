import java.util.Map;

interface UserManage{

    void registerUser(LibraryData libraryData, String userId, String name, int age, String email, String phoneNumber);
    void updateUser(LibraryData libraryData, String userId, String name, int age, String email, String phoneNumber);
    void deactivateUser(LibraryData libraryData, String userId);

}

public class UserManagement implements UserManage {

    @Override
    public void registerUser(LibraryData libraryData, String userId, String name, int age, String email, String phoneNumber){

        // Check that the user is not already registered
        if (!libraryData.getUsers().containsKey(userId)){

            User user = new User(name, age, email, phoneNumber);
            libraryData.getUsers().put(userId, user);
            System.out.println("User registered correctly.");

        } else{
            System.out.println("The user already exists: " + userId);
        }


    }

    @Override
    public void updateUser(LibraryData libraryData, String userId, String name, int age, String email, String phoneNumber){

        // Check if the user exists
        if (libraryData.getUsers().containsKey(userId)){
            
            User user = libraryData.getUsers().get(userId);
            user.setName(name);
            user.setAge(age);
            user.setEmail(email);
            user.setPhoneNumber(phoneNumber);
            System.out.println("User updated correctly.");

        } else {
            System.out.println("User not found: " + userId);
        }

    }

    @Override
    public void deactivateUser(LibraryData libraryData, String userId){

        // Check if the user exists
        if (libraryData.getUsers().containsKey(userId)){
            libraryData.getUsers().remove(userId);
            System.out.println("User deactivated correctly.");
        } else {
            System.out.println("User not found: " + userId);
        }

    }

    public void generateRegisteredUsersReport(LibraryData libraryData) {

        System.out.println();
        System.out.println("Registered Users:");

        for (Map.Entry<String, User> entry : libraryData.getUsers().entrySet()) {
            System.out.println("- " + entry.getKey() + " | " + entry.getValue().getName() + " | " + entry.getValue().getAge() + " | " + entry.getValue().getEmail() + " | " + entry.getValue().getPhoneNumber());
        }

    }

}
