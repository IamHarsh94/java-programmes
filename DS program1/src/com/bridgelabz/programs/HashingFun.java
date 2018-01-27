package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

import com.bridgelabz.util.GenericLinkList;



public class HashingFun {

	
	/**
	 * @param To read the num from a file and split it spaace wise.
	 * @throws IOException
	 */
	public static void main(String []args) throws IOException {
		Scanner sc =new Scanner(System.in);
		File file=null;
		BufferedReader br =null;
		String strArr[]=null;
	try {
			file = new File("/home/bridgeit/Documents/newFile.txt");
			br = new BufferedReader(new FileReader(file));
			String line;
	        	while((line = br.readLine())!=null) {
	       
	        		String str= line;
	        		strArr= str.split("\\s");
	        	}
	        	
	        	storeArr(strArr);
	        
		}catch(Exception e)  {
			System.out.println("");
		}finally {
			br.close();
		}
		
	}


	/**
	 * @param To add a num in a linklist and create a map obj.
	 * add each obj in map in appropriate position.
	 * @throws IOException
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> void storeArr(String [] str) throws IOException {
		
		Scanner sc =new Scanner(System.in);
		
		int intArr[] = new int[str.length];
		
		for(int i=0;i<str.length;i++){
			intArr[i] = Integer.valueOf(str[i]);
		}
		
		GenericLinkList Obj1 = new GenericLinkList();
		GenericLinkList Obj2 = new GenericLinkList();
		GenericLinkList Obj3 = new GenericLinkList();
		GenericLinkList Obj4 = new GenericLinkList();
		GenericLinkList Obj5 = new GenericLinkList();
		GenericLinkList Obj6 = new GenericLinkList();
		GenericLinkList Obj7 = new GenericLinkList();
		GenericLinkList Obj8 = new GenericLinkList();
		GenericLinkList Obj9 = new GenericLinkList();
		GenericLinkList Obj10 = new GenericLinkList();
		
		LinkedHashMap<Integer, GenericLinkList> map=new LinkedHashMap<Integer, GenericLinkList>();
		
		for(int i=0;i<intArr.length;i++) {
			
			int rem=intArr[i]/11;
			
			switch(rem) {
			
			case 0:Obj1.insertData(intArr[i]);
					break;
			case 1:Obj2.insertData(intArr[i]);
				break;
			case 2:Obj3.insertData(intArr[i]);
				break;
			case 3:Obj4.insertData(intArr[i]);
				break;
			case 4:Obj5.insertData(intArr[i]);
				break;
			case 5:Obj6.insertData(intArr[i]);
				break;
			case 6:Obj7.insertData(intArr[i]);
				break;
			case 7:Obj8.insertData(intArr[i]);
				break;
			case 8:Obj9.insertData(intArr[i]);
				break;
			case 9:Obj10.insertData(intArr[i]);
				break;
			default :
					
			}
		}
		map.put(0,Obj1);
		map.put(1,Obj2);
		map.put(2,Obj3);
		map.put(3,Obj4);
		map.put(4,Obj5);
		map.put(5,Obj6);
		map.put(6,Obj7);
		map.put(7,Obj8);
		map.put(8,Obj9);
		map.put(9,Obj10);
		System.out.println("Elements Successfully inserted in the appropriate slot..");
		System.out.println("Enter A element to search");
		int elem = sc.nextInt();
		
		toSearchElem(elem,map);
		
		GenericLinkList<T> myObj = new GenericLinkList<>();
		
		for(int i=0;i<10;i++) {
			map.get(i).PrintLinkNode(myObj);
		}
		int MyArr[] = myObj.StorePrintLinkNode();
		
			File file=null;
			BufferedWriter br1=null;
	       	        
			try {
	             file = new File("/home/bridgeit/Documents/newFile.txt");
	            br1 = new BufferedWriter(new FileWriter(file));
	        	for(int i=0;i<MyArr.length;i++) {
	        		if(String.valueOf(MyArr[i])=="0"||MyArr[i]==0) {
	        			continue;
	        		}else {
	        			br1.write(String.valueOf(MyArr[i]+" "));
	        		}
	        	}
	        		
				
	            System.out.println("updated list successfully added in file :");
	             
	        }catch(Exception e) {
	            e.printStackTrace();
	        }finally {
	          
	            br1.close();
	        }
	}
	/**
	 * @param To search a element in each linklist object
	 * if it is present then call remove method from same object otherwise call add method
	 * from same object.
	 * @param map
	 */
	@SuppressWarnings("unchecked")
	public static void toSearchElem(int data,LinkedHashMap <Integer,GenericLinkList> map){
		int rem = data/11;
		
		if(map.get(rem).searchLinkNode(data)) {
			map.get(rem).remove(data);
			System.out.println("Element remove");
		}
		else {
			map.get(rem).insertData(data);
			System.out.println("Element add");
		}
	}
}
