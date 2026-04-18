package Array;

public class ReverseVowelsFromString {
	public static boolean isVowel(char ch) {
		ch=Character.toLowerCase(ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		String str="IceCreAm";
		char[] arr=str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(isVowel(arr[left]) && isVowel(arr[right])) {
				char temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			else if(!isVowel(arr[left])) {
				left++;
			}
			else if(!isVowel(arr[right])){
				right--;
			}
		}
		System.out.println(new String(arr));
	}

}
