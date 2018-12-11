package routines;

/*
 * user specification: the function's comment should contain keys as follows: 1. write about the function's comment.but
 * it must be before the "{talendTypes}" key.
 * 
 * 2. {talendTypes} 's value must be talend Type, it is required . its value should be one of: String, char | Character,
 * long | Long, int | Integer, boolean | Boolean, byte | Byte, Date, double | Double, float | Float, Object, short |
 * Short
 * 
 * 3. {Category} define a category for the Function. it is required. its value is user-defined .
 * 
 * 4. {param} 's format is: {param} <type>[(<default value or closed list values>)] <name>[ : <comment>]
 * 
 * <type> 's value should be one of: string, int, list, double, object, boolean, long, char, date. <name>'s value is the
 * Function's parameter name. the {param} is optional. so if you the Function without the parameters. the {param} don't
 * added. you can have many parameters for the Function.
 * 
 * 5. {example} gives a example for the Function. it is optional.
 */
public class Routine_Info {

    /**
     * concatInt: generateId.
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} String("obs") input: first.
     * 
     * {example} generateId("1","2","3") # 12.
     */
    public static String generateId(String obs, String obsm, String choc){
    	if (null == obs || !isInt(obs) || null == obsm ||
    			!isInt(obsm) || null == choc || !isInt(choc)) {
    		return null;
    	}
    	String result = format(obs) + format(obsm) + format(choc);    	
    	return result;
    }
    
    /**
     * concatInt: toString.
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} int("i") input: first.
     * 
     * {example} toString(1) # "01".
     */
    public static String format(String s){
    	if(s == null){
    		return "00";
    	}else if(s == "0"){
    		return "00";
    	}else if(Integer.parseInt(s) < 10){
    		return "0" + s;
    	}else{
    		return s;
    	}
    }

    /**
     * concatInt: obstacle_fixe.
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} int("i") input: first.
     * 
     * {example} obstacle_fixe(1) # "Véhicule en stationnement".
     */
    public static String obstacle_fixe(String obs){
    	if (null == obs || !isInt(obs)) {
    		return null;
    	}
    	int i = Integer.parseInt(obs);
    	switch(i){
	    	case 1 :
	    		return "Véhicule en stationnement";
	    	case 2 :
	    		return "Arbre";
	    	case 3 :
	    		return "Glissière métallique";
	    	case 4 :
	    		return "Glissière béton";
	    	case 5 :
	    		return "Autre glissière";
	    	case 6 :
	    		return "Bâtiment, mur, pile de pont";
	    	case 7 :
	    		return "Support de signalisation verticale ou poste d’appel d’urgence";
	    	case 8 :
	    		return "Poteau";
	    	case 9 :
	    		return "Mobilier urbain";
	    	case 10 :
	    		return "Parapet";
	    	case 11 :
	    		return "Ilot, refuge, borne haute";
	    	case 12 :
	    		return "Bordure de trottoir";
	    	case 13 :
	    		return "Fossé, talus, paroi rocheuse";
	    	case 14 :
	    		return "Autre obstacle fixe sur chaussée";
	    	case 15 :
	    		return "Autre obstacle fixe sur trottoir ou accotement";
	    	case 16 :
	    		return "Sortie de chaussée sans obstacle";	    		
	    	default :
	    		return "";
    	}
    }

    /**
     * concatInt: obstacle_mobile.
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} int("i") input: first.
     * 
     * {example} obstacle_mobile(1) # "Piéton".
     */
    public static String obstacle_mobile(String obsm){
    	if (null == obsm || !isInt(obsm)) {
    		return null;
    	}
    	int i = Integer.parseInt(obsm);
    	switch(i){
	    	case 1 :
	    		return "Piéton";
	    	case 2 :
	    		return "Véhicule";
	    	case 4 :
	    		return "Véhicule sur rail";
	    	case 5 :
	    		return "Animal domestique";
	    	case 6 :
	    		return "Animal sauvage";
	    	case 9 :
	    		return "Autre";
	    	default :
	    		return "";
    	}
    }

    /**
     * concatInt: choc.
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} int("i") input: first.
     * 
     * {example} choc(1) # "Avant".
     */
    public static String choc(String choc){
    	if (null == choc || !isInt(choc)) {
    		return null;
    	}
    	int i = Integer.parseInt(choc);
    	switch(i){
	    	case 1 :
	    		return "Avant";
	    	case 2 :
	    		return "Avant droit";
	    	case 3 :
	    		return "Avant gauche";
	    	case 4 :
	    		return "Arrière";
	    	case 5 :
	    		return "Arrière droit";
	    	case 6 :
	    		return "Arrière gauche";
	    	case 7 :
	    		return "Côté droit";
	    	case 8 :
	    		return "Côté gauche";
	    	case 9 :
	    		return "Chocs multiples (tonneaux)";
	    	default :
	    		return "";
    	}
    }
    
    /**
     * isInt: choc.
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {param} String("1") input: first.
     * 
     * {example} isInt("1") # "1".
     */
    public static Boolean isInt(String s){
    	if(s == null){
    		return false;
    	}
    	try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
    
}
