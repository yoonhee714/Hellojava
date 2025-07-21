package chap05;

public class ExamArr {

	public static void main(String[] args) {
		// 배열생성 , 크기 10, 데이터 1~100사이 난수
		int[] nums = new int [20];
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*100)+1;
		}
		// 배열의 값 출력
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
			
		}
		// 배열의 합, 최대값 , 최소값 출력
		int sum = 0;
		int max = 0;
		int min = 100;
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			if(max<nums[i]) max = nums[i];
			if(min>nums[i]) min = nums[i];
				
		}
		System.out.println("합"+sum);
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
		
		//배열의 요소중 4의 배수 출력
		
		// 4의 배수 갯수 출력
		
		//2차원 배열
		
		//배열 선언
		int[][] twoArr = {
				{80,90},
				{70,60,50}
		};
		// 2차원 출력
		for(int i =0; i<twoArr.length; i++) {
			for(int j=0; j< twoArr[i].length; j++) {
				System.out.printf("| %d ",twoArr[i][j]);
			}
			System.out.println();
		}
		//과제2
		int[][] twoArr2= {
				{1,2,3},
				{1,2},
				{1},
				{1,2,3}
		};
		for(int i =0; i<twoArr2.length; i++) {
			for(int j=0; j< twoArr2[i].length; j++) {
				System.out.printf("| %d ",twoArr2[i][j]);
			}
			System.out.println();
		}
			
			
		//현재 관객의 수 출력
		//관객이 있는 좌석은 1, 없는 좌석은 0 : 난수 이용
		//극장의 자리는 1줄에 10좌석씩 3줄
		//3행10열의 배열에 0 또는 1저장 -> 값 출력
		//관객수 계산하기 -> 현재 관객 수는 00명
		int[][] movArr = new int[3][10];
		
		int person = 0;
		for(int i=0; i<movArr.length; i++) {
			for(int j=0; j<movArr[i].length; j++) {
				movArr[i][j] = (int)(Math.random()*2);
				System.out.printf("| %d ", movArr[i][j]);
				person += movArr[i][j];
			}
			System.out.println();
		}
		System.out.println(person);
		
		//학생 별 평균 계산하기
		// 학생3명, 각 학생당 5번의 테스트점수를 배열에 저장
		// 50 <= 점수 <= 100
		// 학생 별 평균 계산 출력
		
		//1번 학생 평균 = 72
		//2번 학생 평균 = 81
		//3번 학생 평균 = 74
		
		int[][] student = new int[3][5];
		int avg1 = 0;
		int avg2 = 0;
		int avg3 = 0;
		
		for(int i=0; i<student.length; i++) {
			for(int j=0; j<student[i].length; j++) {
				student[i][j] = (int)(Math.random()*51)+50;
				System.out.printf("%-3d ", student[i][j]);
				if(i == 0) {
					avg1 += student[i][j];
				}else if(i == 1) {
					avg2 += student[i][j];
				}else {
					avg3 += student[i][j];
				}
			}
			System.out.println();
		} 
		System.out.printf("1번학생의 평균 = %d\n",avg1/5);
		System.out.printf("2번학생의 평균 = %d\n",avg2/5);
		System.out.printf("3번학생의 평균 = %d\n",avg3/5);
		
//		카드를 랜덤하게 선택하여 화면에 출력
//		배열 : ("Clubs","Diamons","Hearts","Spades")
//		배열 : ("2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace")
//		각 카드를 랜덤하게 선택하는 코드 작성 (5번)
//		Club의 7
//		Clubs의 Ace
//		Club의 4
		

		
	}//end main

}
