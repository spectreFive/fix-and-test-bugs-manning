package java.com.assetco.hotspots.optimization.test;

;

import java.util.Random;

import com.assetco.search.results.AssetVendorRelationshipLevel;

class Any{

    static AssetVendorRelationshipLevel relationshipLevel(){
        return anyEnumerationValue(AssetVendorRelationshipLevel.class);
    }

    private static <T> T anyEnumerationValue(Class<T> clazz) {
        Random random = new Random();
        var values = clazz.getEnumConstants();
        return values[random.nextInt(values.length)];
    }

   static String anyId(){
        Random random = new Random();
        return String.valueOf(random.nextInt());
   }

    /**
     * Ideally for this function, I have a map of first and last names and then select a random item from each
     * and make it into a name.
     * @return String which approximates a real human name
     */
   static String anyDisplayName(){
       return "Frank";
   }

   static float anyFloat(){
       Random random = new Random();
       return random.nextFloat();
   }





}