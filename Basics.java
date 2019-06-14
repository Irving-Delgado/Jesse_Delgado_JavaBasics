import java.util.ArrayList;
import java.util.Collections;
public class Basics{
	public void printTo255(){
		int count = 1;
		while(count<=255)
		{
		System.out.println(count);
		count++;
		}
		
	}
	public void printOdd(){
		int sum = 0;
		for (int i=0; i<=255; i++)
		{
			if(i % 2 == 1)
			{
				System.out.println(i);
				sum = i;
			}
		}
			
	}
	public void sum255(){
		int sum = 0;
		for (int i=0; i<=255; i++){
			sum += i;
			System.out.println("New Number: "+i+" "+"Sum: "+sum);
		}
		
	}
	public void iterate(){
		int[] arr= {1,3,5,7,9,13};
		for(int item: arr){
			
			System.out.println(item);
		}

	}
	public void findMax(){
		int[] arr= {-3, -5, -7};
		int max = arr[0];
		for(int i = 0; i<arr.length; i++){
			if(arr[i] > max)
			{
                max = arr[i];
            }
		}
		System.out.println(max);

	}
	public void findAverage(){
		int[] arr={2, 10, 3};
		double sum = 0;
		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
		}
	System.out.println(sum/arr.length);
	}
	public void addNum(){
		ArrayList<Integer> y = new ArrayList<Integer>();
		int x = 1;
		while (x<=255){
			y.add(x);
			x = x+2;
		}
		System.out.println(y);
		
	}
	public void greaterThanY(){
		int[] arr = {1, 3, 5, 7};
		int y = 3;
		int count=0;
		for(int i=0; i<arr.length; i++){
			if(y<arr[i]){
				count++;
			}
		}
		System.out.println(count);
	}
	public void squareTheValues(){
		int[] arr = {1, 5, 10, -2};
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for(int i=0; i < arr.length; i++){
			arr[i] = arr[i]*arr[i];
			newArray.add(arr[i]);
		}
		System.out.println(newArray);
	}
	public void eliminateNegativeNumbers(){
		int[] arr = {1, 5, 10, -2};
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for(int i = 0; i<arr.length; i++){
			if(arr[i] < 0){
				arr[i] = 0;
			}
		newArray.add(arr[i]);
		}
		System.out.println(newArray);
	}
	public void maxMinAvg(){
		int[] arr = {1, 5, 10, -2};
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = sum/arr.length;
   		Collections.addAll(newArray,max,min,avg);
        System.out.println(newArray);

	}
	public void shiftingValues(){
		int[] arr = {1, 5, 10, 7, -2};
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for(int i = 0; i<arr.length; i++){
			if(i < arr.length-1){
				newArray.add(arr[i+1]);
			}
			else{
				newArray.add(0);
			}

		}
		System.out.println(newArray);
	}



}