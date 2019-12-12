package models;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<> ();
        User u1 = new User ();
        u1.setAge ( 18 );
        u1.setAccount ( "admin" );
        u1.setPassword ( "omc@123" );
        u1.setName ( "Trương Minh" );
        u1.setEmail ( "ngocminh.qnm@vnpt.vn" );
        users.add ( u1 );

        users = new ArrayList<> ();
        User u2 = new User ();
        u2.setAge ( 18 );
        u2.setAccount ( "omcqnm" );
        u2.setPassword ( "omc@123" );
        u2.setName ( "Nhật Quang" );
        u2.setEmail ( "nhatquang.qnm@vnpt.vn" );
        users.add ( u2 );

        users = new ArrayList<> ();
        User u3 = new User ();
        u3.setAge ( 18 );
        u3.setAccount ( "tiennn.qnm" );
        u3.setPassword ( "Omc@12345" );
        u3.setName ( "Nho Tiến" );
        u3.setEmail ( "tiennn.qnm@vnpt.vn" );
        users.add ( u3 );
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount ().equals ( login.getAccount () ) && u.getPassword ().equals ( login.getPassword () )) {
                return u;
            }
        }
        return null;
    }
}
