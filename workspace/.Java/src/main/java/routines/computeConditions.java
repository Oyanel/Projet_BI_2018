package routines;
public class computeConditions {
    
    /**
     * computeLum:return the string value for the lum
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} Integer(lum) lum: the type of luminosity
     * 
     * {example} helloExemple("world") # hello world !.
     */
    public static String computeLum(Integer lum) {
        switch(lum == null?0:lum){
        case 1:
        	return "Plein jour";
		case 2:
        	return "Crépuscule ou aube";
		case 3:
        	return "Nuit sans éclairage public";
		case 4:
        	return "Nuit avec éclairage public non allumé";
		case 5:
        	return "Nuit avec éclairage public allumé";
		default:
        	return null;
        }
    }
    
    /**
     * computeLum:return the string value for the intersection
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} Integer(lum) lum: the type of intersection
     * 
     * {example} helloExemple("world") # hello world !.
     */
    public static String computeIntersection(Integer intersection) {
        switch(intersection == null?0:intersection){
        case 1:
        	return "Hors intersection";
		case 2:
        	return "Intersection en X";
		case 3:
        	return "Intersection en T";
		case 4:
        	return "Intersection en Y";
		case 5:
        	return "Intersection à plus de 4 branches";
		case 6:
        	return "Giratoire";
		case 7:
        	return "Place";
		case 8:
        	return "Passage à niveau";
		case 9:
			return "Autre intersection";
		default:
        	return null;
        }
    }
    
    /**
     * computeAtmos the string value for the atmos condition
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} Integer(lum) lum: the type of atmos
     * 
     * {example} helloExemple("world") # hello world !.
     */
    public static String computeAtmos(Integer cndAtoms) {
        switch(cndAtoms == null? 0:cndAtoms){
        case 1:
        	return "Normale";
		case 2:
        	return "Pluie légère";
		case 3:
        	return "Pluie forte";
		case 4:
        	return "Neige - grêle";
		case 5:
        	return "Brouillard - Tempête";
		case 6:
        	return "Vent fort - tempête";
		case 7:
        	return "Temps éblouissant";
		case 8:
        	return "Temps couvert";
		case 9:
			return "Autre";
		default:
        	return null;
        }
    }
    
    /**
     * computeCollision the string value for the collision
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} Integer(lum) lum: the type of collision
     * 
     * {example} helloExemple("world") # hello world !.
     */
    public static String computeCollision(Integer collision) {
        switch(collision == null? 0:collision){
        case 1:
        	return "Deux véhicules - frontale";
		case 2:
        	return "Deux véhicules – par l’arrière";
		case 3:
        	return "Deux véhicules – par le coté";
		case 4:
        	return "Trois véhicules et plus – en chaîne";
		case 5:
        	return "Trois véhicules et plus - collisions multiples";
		case 6:
        	return "Autre collision";
		case 7:
        	return "Sans collision";
		default:
        	return null;
        }
    }
    
    /**
     * computeLocalisation the string value for the localisation
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} int(lum) lum: the type of localisation
     * 
     * {example} helloExemple("world") # hello world !.
     */
    public static String computeLocalisation(Integer localisation){
    	switch(localisation == null? 0:localisation){
    	case 1:
    		return "Hors agglomération";
    	case 2:
    		return "En agglomération";
    	default:
    		return null;
    	}
    }
    
    /**
     * computeConditionID the string value for the id
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} Integer(lum, localisation, intersection, atmos, collision) : the type of localisation
     * 
     * {example} helloExemple("world") # hello world !.
     */
    public static String computeConditionID(Integer lum, Integer localisation, Integer intersection, Integer atmos, Integer collision){
    	if(lum == null || localisation == null || intersection == null || atmos == null || collision == null){
    		return null;
    	} else
    		return String.valueOf(lum) + String.valueOf(localisation) + String.valueOf(intersection) + String.valueOf(atmos) + String.valueOf(collision);
    }
    
    
}
