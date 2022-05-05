package com.prakash.algos;

public class MaskEmail {

	public static void main(String[] args) {
		  String s = "My email id is admin@gmail.com";
	       //My email id is XXXXX@gmail.com
	       String[] str = s.split(" ");
	       StringBuilder sb = new StringBuilder("");
	       for(int i=str.length-1; i>=0;i--){
	           String email = str[i];
	           String[] ar= email.split("@"); 
	           int len = email.length();
	           for(int j=0;j<len;j++){
	               char ch = email.charAt(j);
	               if(ch != '@'){
	                   sb.append("X");
	               }else{
	                   sb.append(ar[1]);
	                   break;
	               }
	           }
	           break;
	       }
	       
	       System.out.println(sb);

	}

}
