package simulation;

/*
 * <문제> 세준이는 컵 3개를 탁자위에 일렬로 놓았다. 컵의 번호는 가장 왼쪽 컵부터 순서대로 1번, 2번 3번이고, 세준이는 이 컵을 이용해서 게임을 하려고 한다.
		먼저 1번컵의 아래에 공을 하나 넣는다. 세준이는 두 컵을 고른 다음, 그 위치를 바꾸려고 한다. 예를 들어, 고른 컵이 1번과 2번이라면, 1번 컵이 있던 위치에 2번 컵을 이동시키고, 동시에 2번 컵이 있던 위치에 1번 컵을 이동시켜야 한다.
		위치를 바꿀 때, 컵을 먼저 들고 이동해야 한다. 따라서, 공의 위치는 가장 처음 1번컵이 있던 위치와 같다.
		세준이는 컵의 위치를 총 M번 바꿀 것이며, 컵의 위치를 바꾼 방법이 입력으로 주어진다. 위치를 M번 바꾼 이후에 공이 들어있는 컵의 번호를 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 컵의 위치를 바꾼 횟수 M이 주어지며, M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 M개의 줄에는 컵의 위치를 바꾼 방법 X와 Y가 주어지며, X번 컵과 Y번 컵의 위치를 서로 바꾸는 것을 의미한다.
		컵을 이동시키는 중에 공이 컵에서 빠져나오는 경우는 없다. X와 Y의 값은 3보다 작거나 같고, X와 Y가 같을 수도 있다.
 * <출력> 첫째 줄에 공이 들어있는 컵의 번호를 출력한다. 공이 사라져서 컵 밑에 없는 경우에는 -1을 출력한다.
 */
import java.util.*;

public class Main_1547 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine().trim());
		int[] arr = {1, 2, 3};
		
		for(int i=0; i<m; i++) {
			int c1 = Integer.parseInt(sc.next().trim());
			int c2 = Integer.parseInt(sc.next().trim());
			
			int ind1 = -1, ind2 = -1;
			for(int j=0; j<3; j++) {
				if(arr[j] == c1) {
					ind1 = j;
				} else if(arr[j] == c2) {
					ind2 = j;
				}
				
				if(ind1 != -1 && ind2 != -1) {
					int tmp = arr[ind1];
					arr[ind1] = arr[ind2];
					arr[ind2] = tmp;
					break;
				}
			}
		}
		
		System.out.println(arr[0]);
	}

}
