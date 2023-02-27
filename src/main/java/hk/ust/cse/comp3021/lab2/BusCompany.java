package hk.ust.cse.comp3021.lab2;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * {@link BusCompany} represents a bus company class, whose instance contains a
 * list of {@link Bus} instances.
 * {@link BusCompany} should also keep tracking the total number of
 * {@link BusCompany} instances that has been created
 * (those that are garbage-collected should also be counted).
 */
public class BusCompany {
    // TODO add any static or instance field as you need.
    private String name;
    private ArrayList<Bus> busArray;
    private static int numOfCompanies;

    /**
     * Initialize a new BusCompany instance.
     *
     * @param name the name of the bus company.
     */
    public BusCompany(@NotNull String name) {
        // TODO implement this constructor
        this.name = name;
        busArray = new ArrayList<Bus>();
        numOfCompanies++;
    }

    /**
     * @return the name of the bus company.
     */
    @NotNull
    public String getName() {
        // TODO implement this method
        try {
            return name;
        } catch (Exception e) {
            throw new RuntimeException("implement me");
        }

    }

    /**
     * @return the number of {@link Bus} instances that current bus company has.
     */
    public int getNumBuses() {
        try {
            return busArray.size();
        } catch (Exception e) {
            throw new RuntimeException("implement me");
        }

    }

    /**
     * @param id the id of the bus instance in current bus company.
     * @return the {@link Bus} instance with the {@code id} in the current bus
     *         company. Return null if not exist.
     */
    @Nullable
    public Bus getBusByID(int id) {
        try {
            for (int i = 0; i < busArray.size(); i++) {
                if (busArray.get(i).id == id)
                    return busArray.get(i);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("implement me");
        }

    }

    /**
     * @return an array of unique models used in current bus company. There should
     *         not be two equivalent models in the returned array.
     *         If there are no {@link Bus} instances in the current bus company,
     *         return an empty array with length 0.
     */
    @NotNull
    public String[] getModels() {
        try {
            ArrayList<String> modelArray = new ArrayList<String>();

            for (int i = 0; i < busArray.size(); i++) {
                if (!modelArray.contains(busArray.get(i).model)) {
                    modelArray.add(busArray.get(i).model);
                }

                // else {
                // modelArray.add(busArray.get(i).model);}
            }
            return modelArray.toArray(new String[modelArray.size()]);

        } catch (Exception e) {
            throw new RuntimeException("implement me");
        }

    }

    /**
     * Create a new {@link Bus} instance and add to the current bus company.
     * Each {@link Bus} instance added to the {@link BusCompany} instance should
     * have unique {@link Bus} id.
     * If the given id already exists in the current {@link BusCompany} instance, do
     * not add any {@link Bus} instance and just return false.
     * Otherwise, if a new {@link Bus} instance is successfully added, return true.
     *
     * @param id    the id of the bus to be created.
     * @param model the model of the bus to be created.
     * @return whether a new bus instance is added to the bus company.
     */
    public boolean createAndAddBus(int id, String model) {
        // TODO implement this method
        try {
            // check for same id
            for (int i = 0; i < busArray.size(); i++) {
                if (busArray.get(i).id == id)
                    return false;
            }

            // Bus tmp = new Bus(id,model);
            busArray.add(new Bus(id, model));
            return true;
        } catch (Exception e) {
            throw new RuntimeException("implement me");
        }

    }

    /**
     * Remove all {@link Bus} instances that have been added to the current bus
     * company via {@link BusCompany#createAndAddBus(int, String)}.
     */
    public void removeAllBuses() {
        busArray.clear();
        throw new RuntimeException("implement me");
    }

    /**
     * @return the total number of {@link BusCompany} instances that have been
     *         created.
     */
    @NotNull
    public static int getNumCompanies() {
        // TODO implement this method
        try {
            return numOfCompanies;
        } catch (Exception e) {
            throw new RuntimeException("implement me");
        }

        
    }

}
