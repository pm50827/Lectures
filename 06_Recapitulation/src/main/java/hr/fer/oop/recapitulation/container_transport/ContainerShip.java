package hr.fer.oop.recapitulation.container_transport;

/**
 *
 * @author Krešimir Pripužić <kresimir.pripuzic@fer.hr>
 */
public class ContainerShip extends WeightLimitedCargoHolder {
    
    private final int maxContainers;

    public ContainerShip(double weight, double maxCargoWeight, int maxContainers) {
        super(weight, maxCargoWeight);
        this.maxContainers = maxContainers;
    }      

    @Override
    public boolean add(Cargo cargo) {
        if (!(cargo instanceof Container) || content.size() == maxContainers) {
            return false;
        }
        
        return super.add(cargo);        
    }

    @Override
    public boolean remove(Cargo cargo) {
        if (!(cargo instanceof Container)) {
            return false;
        }
        
        return super.remove(cargo);
    }                
}
