public class hello_dots {
	public static void main(String[] args) {

		  int[][] picture= {{0,0,0,1,0,0,0,0},
				           {0,0,0,1,0,0,0,0},
				           {0,1,1,1,0,0,0,0},
				           {0,1,0,1,0,0,0,0},
				           {0,1,1,1,0,0,0,0},
				           {0,0,0,0,0,0,0,0},
				           {0,0,0,1,1,1,0,0},
				           {0,0,0,1,0,1,0,0},
				           {0,0,0,1,1,1,0,0},
				           {0,0,0,0,0,0,0,0},
				           {0,0,0,0,0,1,0,0},
				           {0,0,0,0,1,1,1,0},
				           {0,0,0,0,0,1,0,0},
				           {0,0,0,0,0,1,1,0}};


		for(int[]img:picture) {
			for(int dia:img) {
				if(dia==1) {
					System.out.print("d");
				}else {
					System.out.print(" ");

				}
			}
			System.out.println(" ");
		}
		System.out.println("");
	}

}
