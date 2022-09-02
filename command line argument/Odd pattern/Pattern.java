class Pattern{
    public static void main(String []args) {
    
    int row = Integer.parseInt(args[0]);
	int i,space,col;
	
	for(i=1; i<=row; i++){
		for(space=1; space<=row-i; space++){
			System.out.print(" ");
		}
			for(col=1; col<=2*i-1; col++){
            System.out.print("*");
		}
		System.out.println();
	    } 
    }
}