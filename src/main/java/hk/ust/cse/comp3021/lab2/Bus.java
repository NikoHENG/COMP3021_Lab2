package hk.ust.cse.comp3021.lab2;

/**
 * {@link Bus} class represents a bus that  can be added to the instance of {@link BusCompany} via {@link BusCompany#createAndAddBus(int, String)}.
 */

public class Bus {
	// TODO add any static or instance field as you need.
	int id;
	String model;
	
	/**
     * Initialize a new BusCompany instance.
     *
     * @param name the name of the bus company.
     */
	public Bus(int id, String modelName) {
		// TODO implement this constructor
		this.id = id;
		this.model = modelName;
	}
}
