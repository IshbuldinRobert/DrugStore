package seminars.drugStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import seminars.drugStore.Components.*;

public class Program {
    public static void main(String[] args) {

        // hasNext() и next()

        /*Pharmacy p1 = new Pharmacy();
        p1.addCompopent(new Penicillin("penicillin1", 0.1, 1))
          .addCompopent(new Water("water1", 0.2, 2));
        Pharmacy p2 = new Pharmacy();
        p2.addCompopent(new Water("water2", 0.1, 4))
          .addCompopent(new Salt("salt2", 0.3, 0));
        Iterator<Component> iter1 = p1;
        Iterator<Component> iter2 = p2;

        while(iter1.hasNext()) {
            System.out.println(iter1.next());
        }
        while(iter2.hasNext()) {
            System.out.println(iter2.next());
        }*/


        // MyIterator


        /* final PharmacyIterable phi1 = new PharmacyIterable();
        phi1.addCompopent(new Penicillin("penicillin3", 0.1, 1))
                  .addCompopent(new Water("Water3", 0, 0))
                  .addCompopent(new Salt("Salt3", 0, 0));
        final PharmacyIterable phi2 = new PharmacyIterable();
        phi2.addCompopent(new Penicillin("penicillin3", 0.1, 1))
                .addCompopent(new Water("Water3", 0, 0))
                .addCompopent(new Salt("Salt3", 0, 0));
        final PharmacyIterable phi3 = new PharmacyIterable();
        phi3.addCompopent(new Penicillin("penicillin3", 0.1, 1))
                    .addCompopent(new Water("Water3", 0, 0))
                    .addCompopent(new Salt("Salt3", 0, 0));

        final ArrayList<PharmacyIterable> phis = new ArrayList<>();
        phis.add(phi1);
        phis.add(phi2);
        phis.add(phi3);

        for (Component component : phi1) {
            System.out.println(component);
        }
        for (int i = 0; i < phi1.getSize(); i++) {
            System.out.println(phi1.get(i));
        }*/


        // сортировка compareTo() в Component


        /*Component c1 = new Penicillin("p", 1, 234);
        Component c2 = new Water("w", 1, 1);
        Component c3 = new Salt("s", 1, 23);

        ArrayList<Component> components = new ArrayList<>();
        components.add(c1);
        components.add(c2);
        components.add(c3);
        components.add(c1);

        System.out.println(components);
        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);*/


        // Сортировка в PharmacyIterable


        final PharmacyIterable phit1 = new PharmacyIterable();
        phit1.addCompopent(new Penicillin("penicillin3", 0.1, 45))
             .addCompopent(new Water("Water3", 0, 3))
             .addCompopent(new Salt("Salt3", 0, 1));
        final PharmacyIterable phit2 = new PharmacyIterable();
        phit2.addCompopent(new Penicillin("penicillin3", 0.1, 1))
             .addCompopent(new Water("Water3", 0, 4))
             .addCompopent(new Salt("Salt3", 0, 7));
        final PharmacyIterable phit3 = new PharmacyIterable();
        phit3.addCompopent(new Penicillin("penicillin3", 0.1, 34))
             .addCompopent(new Water("Water3", 0, 4))
             .addCompopent(new Salt("Salt3", 0, 5));

        ArrayList<PharmacyIterable> phits = new ArrayList<>();
        phits.add(phit1);
        phits.add(phit2);
        phits.add(phit3);
        
        System.out.println(phits);
        Collections.sort(phits);
        System.out.println(phits);
    }
}