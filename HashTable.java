public class HashTable {
    //calculating the ASCII value
    public static int HashInput(String input){
        int hash=0;
        for (int i=0;i<input.length();i++){
            if(i==2) {
				break;
			}
			System.out.println(input.charAt(i)+" "+(int)input.charAt(i));
            hash=input.charAt(i);
            
        }
        return hash;
    }
    public static void main(String[] args) {
        String input="AI";
        //calculate the hash value
        int hashval=HashInput(input);
        System.out.println("User Input: "+input);
        System.out.println("Hash value: "+hashval);
    }
}
