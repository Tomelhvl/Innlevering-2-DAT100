package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
        for (int i=0; i < tabell.length; i++){
            System.out.print(tabell[i] + " ");
        }
        System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
        String result = "[";
        for (int i=0; i < tabell.length; i++){
            if(i!= 0){
               result += ",";
            }
            result += tabell[i];
        }
        return result + "]";

	}

	// c)
	public static int summer(int[] tabell) {
        int result = 0;
        for(int i=0; i < tabell.length; i++){
            result += tabell[i];

        }
		return result;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        for(int i=0; i < tabell.length; i++){
            if(tabell[i] == tall){
            return true;
            }
        }

        return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        for(int i=0; i < tabell.length; i++){
            if(tabell[i] == tall){
                return i;
            }
        }
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
        int[] tabell2 = new int[tabell.length];
		for(int i = 0; i < tabell.length; i++){
            tabell2[i] = tabell[tabell.length -1 -i];

        }
        return tabell2;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
        for(int i = 0; i < tabell.length; i++){
            if(i > 0 && tabell[i] < tabell[i-1]){
                return false;
            }

        }
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] result = new int[tabell1.length + tabell2.length];
        for(int i = 0; i < result.length; i++){

            if(i < tabell1.length){
                result[i] = tabell1[i];
            } else {
                result[i] = tabell2[i - tabell1.length];
            }

        }
        return result;
	}
}
