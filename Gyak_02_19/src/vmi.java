
public class vmi {
	public static void main(String[] args) {
		//Leibniz-formula
		
		int darab =50;
		double pi=0;
		double a=1;
			
			for (int i = 0; i < darab; i++) {
				if(i % 2 == 0){
					pi=pi+(1/a);
					
				}
				else{
					if(i % 2 == 0){
						pi=pi-(1/a);
				}
			}
		a=a+2;
		pi=pi*4;
		System.out.println(pi);
		
	}

}

}
