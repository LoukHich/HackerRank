
public class elevatorProblem {
public static void main(String[] args) {
	int[][] grille = {{0,1,0,1},{0,0,0,0}, {0,0,0,0},{1,0,1,0} } ; 
	int etage = 2 ; // Étage où une personne a appuyé sur le bouton
	int distanceMin= Integer.MAX_VALUE;
	//System.out.println(grille.length);
	long start = System.nanoTime();
	for(int i= etage  ;i<grille.length;i++) {
	         for(int j=0;j<grille[i].length;j++) {
	        	 if(grille[i][j]==1) {
	        		 int dis=i-etage;
	        		if(distanceMin>dis)
	        			distanceMin=dis;
	        		break;
	        	 }
	         }
     }
	//System.out.println(distanceMin);
	for(int i=0;i<etage;i++) {
		 for(int k=0;k<grille[i].length;k++) {
        	 if(grille[i][k]==1) {
        		 int dis=etage-i;
        		if(distanceMin>dis)
        			distanceMin=dis;
        		break;
        	 }
         }
	}
	long end = System.nanoTime();
	System.out.println(distanceMin);
	
	long execution = end - start;
    System.out.println("Execution time: " + execution + " nanoseconds");
}


}