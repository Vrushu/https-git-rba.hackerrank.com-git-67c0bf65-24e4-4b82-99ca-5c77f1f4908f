package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> furnitureMap;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        furnitureMap =  = new HashMap<Furniture, Integer>(); 
        furnitureMap.put(Furniture.CHAIR, 0);
        furnitureMap.put(Furniture.TABLE, 0);
        furnitureMap.put(Furniture.COUCH, 0);
        
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        int curCount = furnitureMap.get(type);
        int newCount = prevCount+ furnitureCount;
        furnitureMap.put(type, newCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {        
        return furnitureMap;
    }

    public float getTotalOrderCost() {
        float chairCost = furnitureMap.get(Furniture.CHAIR) * Furniture.CHAIR.cost();
        float tableCost = furnitureMap.get(Furniture.TABLE) * Furniture.TABLE.cost();
        float couchCost = furnitureMap.get(Furniture.COUCH) * Furniture.COUCH.cost();
        return chairCost + tableCost + couchCost;
    }

    public int getTypeCount(Furniture type) {        
        return furnitureMap.get(type);
    }

    public float getTypeCost(Furniture type) {        
        return type.cost();
    }

    public int getTotalOrderQuantity() {
        int chairCount = furnitureMap.get(Furniture.CHAIR) ;
        int tableCount = furnitureMap.get(Furniture.TABLE) ;
        int couchCount = furnitureMap.get(Furniture.COUCH) ;
        return chairCount + tableCount + couchCount ;
    }
}
