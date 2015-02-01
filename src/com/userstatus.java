/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package com;

/**
 *
 * @author Nimantha
 */
public class userstatus {

//   static  Manager manager = new Manager("megacityPU");
//    public static User userr;
//    public static List<Item> itemsComs = manager.find(Item.class);
    public static String LodUser="a";

    public String Status(int num, String val) { // val has num or value // active deactive

        String ret = "";

        if (val.equals("num")) {
            if (num == 0) {
                ret = "0";
            } else if (num == 1) {
                ret = "1";
            } else {
                ret = "0";
            }
        } else if (val.equals("value")) {
            if (num == 0) {
                ret = "Active";
            } else if (num == 1) {
                ret = "Deactive";
            } else {
                ret = "--Select--";
            }
        }

        return ret;
    }
}
