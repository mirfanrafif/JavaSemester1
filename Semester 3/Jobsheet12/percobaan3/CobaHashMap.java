/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.percobaan3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author irfan
 */
public class CobaHashMap {

    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1", "Biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        System.out.format("Hashmap Item Total : %d\n\n", hMapItem.size());

        Collection mCollection = hMapItem.values();
        Iterator mIterator = mCollection.iterator();
        while (mIterator.hasNext()) {
            System.out.println(mIterator.next());
        }

        Object mObject = hMapItem.remove("1");
        System.out.format("%s remove from hashmap \n", mObject);
        System.out.format("Hashmap Item Total : %d\n", hMapItem.size());
        System.out.println(hMapItem);

        hMapItem.clear();
        System.out.format("Hashmap Item Total : %d\n", hMapItem.size());
    }
}
