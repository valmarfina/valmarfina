package ta;

import java.util.Scanner;

public class z83 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    int m, n, step;
	    int tmp;
		int N = 10;
		int[] arr= new int[N];	
		//Filling an array with random numbers
		for(int i = 0; i < arr.length; i++) {
			arr[i]=  0 + (int) (Math.random() * 101);
		}
		System.out.println("Èñõîäíûé ìàññèâ:");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	//shell sort

		    for (step = N / 2; step > 0; step /= 2)
		        for (m = step; m < N; m++)
		        {
		            tmp = arr[m];
		            for (n = m; n >= step; n -= step)
		            {
		                if (tmp < arr[n - step])
		                    arr[n] = arr[n - step];
		                else
		                    break;
		            }
		            arr[n] = tmp;
		        }
		    System.out.println();
			System.out.println("îòñîðòèðîâàííûé ìàññèâ:");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + ", ");
			}
			
			
		    System.out.println();
		    System.out.println("ââåäèòå ÷èñëî êîòîðîå õîòèòå íàéòè");
		    int number = sc.nextInt();
		
		   //interpolation search
		    int mid;
		    int low = 0;
		    int high = arr.length - 1;

		    while (arr[low] < number && arr[high] > number) {
		        mid = low + ((number - arr[low]) * (high - low)) / (arr[high] - arr[low]);

		        if (arr[mid] < number)
		            low = mid + 1;
		        else if (arr[mid] > number)
		            high = mid - 1;
		        else
				    System.out.println(mid); ;
		    }

		    if (arr[low] == number)
			    System.out.println("èíäåêñ " + number + " = " + low); 
		    if (arr[high] == number)
			    System.out.println("èíäåêñ " + number + " = " + high); 
		    if((arr[low] != number) && (arr[high] != number))
			    System.out.println("÷èñëî â ìàññèâå îòñóòñâóåò"); 

		}

	}

