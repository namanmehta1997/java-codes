import java.util.Scanner;
class snake3{
	public static void main(String argsp[]){
		int t;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		while(t>0){
			t--;
			int s1x,s1y,e1x,e1y,s2x,s2y,e2x,e2y;
			s1x = in.nextInt();
			s1y = in.nextInt();
			e1x = in.nextInt();
			e1y = in.nextInt();
			s2x = in.nextInt();
			s2y = in.nextInt();
			e2x = in.nextInt();
			e2y = in.nextInt();

			if(   (s1x > e1x && s1y == e1y) || (s1y < e1y && s1x == e1x)  ){
				int temp = s1x;
				s1x = e1x;
				e1x = temp;
				temp = s1y;
				s1y = e1y;
				e1y = temp;
			}

			if(   (s2x > e2x && s2y == e2y) || (s2y < e2y && s2x == e2x)  ){
				int temp = s2x;
				s2x = e2x;
				e2x = temp;
				temp = s2y;
				s2y = e2y;
				e2y = temp;
			}


			if(s1x == s2x && s1y == s2y){
				System.out.println("yes");
				continue;
			}


			else if(  (s1x == e2x && s1y == e2y) || (s2x == e1x && s2y == e1y)   ){
				System.out.println("yes");
				continue;
			}
			else if( (e1x == e2x && e1y == e2y) || (e2x == e1x && e2y == e1y) ){
				System.out.println("yes");
				continue;

			}

			else if(s1x == e1x && s2x == e2x ){

				if(s1x != s2x){
					System.out.println("no");
					continue;
				}
				else{
					
					if(s1y > s2y && s2y >= e1y){
						System.out.println("yes");
						continue;
					}
					else if(s2y > s1y && s1y >=e2y){
						System.out.println("yes");
						continue;	
					}
					else{
						System.out.println("no");
						continue;
					}

				}

			}
			
			else if(s1y == e1y && s2y == e2y){
				if(s1y != s2y){
					System.out.println("no");
					continue;
				}
				else{
					if(s1x < s2x && s2x <= e1x){
						System.out.println("yes");
						continue;
					}
					else if(s2x < s1x && s1x <=e2x){
						System.out.println("yes");
						continue;
					}
					else{
						System.out.println("no");
						continue;
					}
				}
			}

			else{
				System.out.println("no");
			}

		}
	}
}