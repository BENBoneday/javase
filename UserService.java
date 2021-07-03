public class UserService {
    public void register(String username,String password) throws IllegalNameException {

        if (null==username||username.length()<6||username.length()>14){
            throw new IllegalNameException("信息错误！");
          //  System.out.println(username);
        }
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
        userService.register("dsa","123");
    }catch (IllegalNameException e){
            e.printStackTrace();
        }
    }

}
