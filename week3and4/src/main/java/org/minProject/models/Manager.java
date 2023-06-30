package org.minProject.models;

import org.minProject.base.User;

public class Manager extends User {

    private static  Manager MANAGER = null;

    public Manager(String id, String name) {
        super(id, name);
    }





    public static Manager getMANAGER(String id, String name) {
        if (MANAGER == null){
            MANAGER = new Manager(id , name);
        }
        return MANAGER;
    }
}
