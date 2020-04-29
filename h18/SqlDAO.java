package com.huawei.classroom.student.h18;

import java.lang.reflect.Field;
import java.util.List;

public class SqlDAO implements SqlUtil {

    @Override
    public String query(User user) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = user.getClass();
        Field field = clazz.getDeclaredField("id");
        field.setAccessible(true);
        return "SELECT * FROM user WHERE id = " + field.get(user);
    }

    @Override
    public String insert(User user) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = user.getClass();
        Field field2 = clazz.getDeclaredField("username");
        Field field3 = clazz.getDeclaredField("age");
        Field field4 = clazz.getDeclaredField("email");
        Field field5 = clazz.getDeclaredField("telephone");
        field2.setAccessible(true);
        field3.setAccessible(true);
        field4.setAccessible(true);
        field5.setAccessible(true);
        return "INSERT INTO `user` (`username`, `telephone`, `email`, `age`) VALUES" +
                " ('"+ field2.get(user) +"', '"+ field5.get(user) +"', '"+field4.get(user)+"',"+ field3.get(user)+")";
    }

    @Override
    public String insert(List<User> users) throws NoSuchFieldException, IllegalAccessException {
        String str = "";
        for(User user:users){
            Class clazz = user.getClass();
            Field field2 = clazz.getDeclaredField("username");
            Field field3 = clazz.getDeclaredField("age");
            Field field4 = clazz.getDeclaredField("email");
            Field field5 = clazz.getDeclaredField("telephone");
            field2.setAccessible(true);
            field3.setAccessible(true);
            field4.setAccessible(true);
            field5.setAccessible(true);
            str = str + "INSERT INTO `user` (`username`, `telephone`, `email`, `age`) VALUES" +
                    " ('"+ field2.get(user) +"', '"+ field5.get(user) +"', '"+field4.get(user)+"',"+ field3.get(user)+")"
                    + "\n";
        }
        return str;
    }

    @Override
    public String delete(User user) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = user.getClass();
        Field field = clazz.getDeclaredField("id");
        field.setAccessible(true);
        return"DELETE FROM `user` WHERE `id` = "+field.get(user)+";";
    }

    @Override
    public String update(User user) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = user.getClass();
        Field field1 = clazz.getDeclaredField("id");
        Field field2 = clazz.getDeclaredField("email");
        field1.setAccessible(true);
        field2.setAccessible(true);
        return "UPDATE `user` SET `email` = '"+field2.get(user)+"' WHERE `id` = "+field1.get(user)+";";
    }
}
