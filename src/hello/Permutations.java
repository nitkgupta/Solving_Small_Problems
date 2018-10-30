package hello;

public class Permutations {
	public static void main(String ng[]){
		Permutations open =new Permutations();
		String str="geeta";
		open.permute(str,0,str.length()-1);
	}

	public void permute(String str,int l,int r){
		if(l==r){
			System.out.println(str);
		}
		for(int i=l;i<=r;i++){
			str=swap(str,l,i); //a
			permute(str, l+1, r); //bc //bb //cb
			str=swap(str,l,i); //bc//bb//abc
		}
	}

	private String swap(String str, int l, int k) {
		char temp;
		char[] arr=str.toCharArray();
		temp=arr[l];
		arr[l]=arr[k];
		arr[k]=temp;
		
		return String.valueOf(arr);
	}
}
